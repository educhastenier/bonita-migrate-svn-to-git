/**
 * 
 */
package org.mycompany.connector;

import org.bonitasoft.engine.bpm.document.Document;
import org.bonitasoft.engine.connector.ConnectorException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.logging.Logger;


/**
 *The connector execution will follow the steps
 * 1 - setInputParameters() --> the connector receives input parameters values
 * 2 - validateInputParameters() --> the connector can validate input parameters values
 * 3 - connect() --> the connector can establish a connection to a remote server (if necessary)
 * 4 - executeBusinessLogic() --> execute the connector
 * 5 - getOutputParameters() --> output are retrieved from connector
 * 6 - disconnect() --> the connector can close connection to remote server (if any)
 */
public class ExcelReadCellRangeImpl extends AbstractExcelReadCellRangeImpl {
	private final DataFormatter formatter = new DataFormatter(Locale.ENGLISH);
	private Logger logger = Logger.getLogger("org.bonitasoft.test"); 

	@Override
	protected void executeBusinessLogic() throws ConnectorException{
	    List values = new ArrayList();
	    try{
			Document document = apiAccessor.getProcessAPI().getLastDocument(getExecutionContext().getProcessInstanceId(), getFileName());
		    InputStream inputStream = new ByteArrayInputStream(apiAccessor.getProcessAPI().getDocumentContent(document.getContentStorageId()));
			Workbook workbook = document.getContentFileName().contains(".xlsx") ? new XSSFWorkbook(inputStream) : new HSSFWorkbook(inputStream);
        	FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            Sheet sheet = workbook.getSheet(getSheetName().trim());
	        List<String> cellRanges = Arrays.asList(getCellRangeList().split(","));
	        for (String cellRange : cellRanges) {
	            List cellRangeValues = new ArrayList();
	            CellRangeAddress range = CellRangeAddress.valueOf(cellRange.trim());
	                for (int i = range.getFirstRow(); i <= range.getLastRow(); i++) {
	             	Row row = sheet.getRow(i);
	          	   	int cellStart = range.getFirstRow() == range.getLastRow() ? range.getFirstColumn() : row.getFirstCellNum();
	          	   	int cellEnd = range.getFirstRow() == range.getLastRow() ? range.getLastColumn() : row.getLastCellNum();
	          	   	for (int j = cellStart; j <= cellEnd; j++) {
	                       cellRangeValues.add(readCellValue(evaluator, row.getCell(j)));
	                }
	            }
            values.add(cellRangeValues);
	        }
        setData(values);
	    }catch(Exception e){
        	throw (new ConnectorException(e));
	    }
     }

	@Override
	public void connect() throws ConnectorException{
		//[Optional] Open a connection to remote server
	
	}

	@Override
	public void disconnect() throws ConnectorException{
		//[Optional] Close connection to remote server
	
	}
	
    private String readCellValue(FormulaEvaluator evaluator, Cell cell) {
        if (cell == null) return "";
        if (cell.getCellType() != 2) return formatter.formatCellValue(cell);
        return formatter.formatCellValue(cell, evaluator);
    }
}
