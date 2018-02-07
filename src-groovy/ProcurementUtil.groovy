import com.bonitasoft.engine.api.APIAccessor;

import java.lang.annotation.Documented;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.ConcurrentSkipListMap.Index;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.lang.RandomStringUtils;
import org.bonitasoft.engine.bpm.document.Document;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;


def static List readCSVFile(APIAccessor apiAccessor, long processInstanceId, String documentName){
	Document document = apiAccessor.getProcessAPI().getLastDocument(processInstanceId, documentName);
	if(!document.getContentFileName().toLowerCase().contains(".csv")){
		throw new Exception(String.format("The file %s is not a csv file. Please provide only a CSV file", document.getContentFileName()));
	}
	Reader reader = new InputStreamReader(new ByteArrayInputStream(apiAccessor.getProcessAPI().getDocumentContent(document.getContentStorageId())), "UTF-8");
	char noEscape = '\0';
	CSVReader csvReader = new CSVReader(reader, CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER,  noEscape, 1);
	return csvReader.readAll();
}

def static List readCSVFile(APIAccessor apiAccessor, long processInstanceId, File file){
	Reader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
	char noEscape = '\0';
	CSVReader csvReader = new CSVReader(reader, CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER,  noEscape, 1);
	return csvReader.readAll();
}

def static String generatePONumber(String vendorCode){
	return String.format("%s-%s", vendorCode.toUpperCase(), RandomStringUtils.randomAlphanumeric(6).toUpperCase());
}

def static double roundUpTo2Decimal(double value){
	BigDecimal bd = new BigDecimal(value);
	bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
	return bd.doubleValue();
}

def static void unzip(InputStream inputStream, String absoluteFolderPath){
	try{
		ZipInputStream stream = new ZipInputStream(inputStream);
		ZipEntry entry = null;
		while ((entry = stream.getNextEntry()) != null) {
			String fileName = entry.getName();
			new File(absoluteFolderPath).mkdirs();
			FileOutputStream out = new FileOutputStream(String.format("%s/%s", absoluteFolderPath, fileName));
			byte[] byteBuff = new byte[8192];
			int bytesRead = 0;
			while ((bytesRead = stream.read(byteBuff)) != -1)
			{
				out.write(byteBuff, 0, bytesRead);
			}
			out.close();
			stream.closeEntry();
		}
		stream.close();
	}catch(Exception e) {
		 throw new RuntimeException(e);
	}
}