import java.util.ArrayList.SubList;

import org.bonitasoft.customerexperience.SupportCase;

def static String formatCityWithLatLong(SupportCase supportCase){
	if(supportCase.getCity() == null || supportCase.getCity().isEmpty()) return "";
	if(supportCase.getLatitude() != null && supportCase.getLongitude() != null){
		return String.format("%s (%s, %s)", supportCase.getCity(), supportCase.getLatitude(), supportCase.getLongitude());
	}
   return String.format("%s", supportCase.getCity());
}

def static String stripBasicHTMLTags(String text){
    return text.replaceAll("<.*?>", "").replaceAll("&nbsp;", "");
}


def static boolean isNullOrEmpty(String text){
	return text == null || text.isEmpty();
}