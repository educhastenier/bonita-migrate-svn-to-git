import java.sql.ResultSet;
import java.util.logging.Logger;

import org.bonitasoft.customerexperience.Reporter;
import org.bonitasoft.customerexperience.SupportCase;

def static List<SupportCase> mapCase(ResultSet rs)
{
	List<SupportCase> cases = new ArrayList();
	while(rs.next()){
	SupportCase supportCase = new SupportCase();
	supportCase.setAttachmentUrl(rs.getString("attachment_url"));
	supportCase.setId(rs.getLong("id"));
	supportCase.setDescription(rs.getString("description"));
	supportCase.setTitle(rs.getString("title"));
	supportCase.setCategory(rs.getString("category"));
	supportCase.setSeverity(rs.getString("severity"));
	supportCase.setReporterId(rs.getLong("reporter_id"));
	supportCase.setSource(rs.getString("source"));
	supportCase.setCity(rs.getString("city"));
	supportCase.setExternalCaseId(rs.getLong("external_case_id"));
	supportCase.setLatitude(rs.getDouble("latitude"));
	supportCase.setLongitude(rs.getDouble("longitude"));
	supportCase.setCreatedDate(rs.getDate("created_date"));
	supportCase.setOnsiteVisitDate(rs.getDate("onsite_visit_date"));
	supportCase.setFieldTechnicianId(rs.getLong("field_technician_id"));
	supportCase.setStatus(rs.getString("status"));
	supportCase.setCrmCaseId(rs.getString("crm_case_id"));
	cases.add(supportCase);
	}
	return cases;
}


def static Reporter mapUser(ResultSet rs)
{
	Reporter user = new Reporter();
	while(rs.next()){
		user.setId(rs.getLong("id"));
		user.setFirstName(rs.getString("first_name"));
		user.setLastName(rs.getString("last_name"));
		user.setEmail(rs.getString("email"));
		user.setTwitterId(rs.getString("twitter_id"));
		user.setCrmContactId(rs.getString("crm_contact_id"));
	}
	return user;
}

def static List<List> mapLocations(ResultSet rs)
{
	List<List> locations = new ArrayList();
	while(rs.next()){
		List location = new ArrayList();
		location.add(rs.getInt("count"));
		location.add(rs.getDouble("latitude"));
		location.add(rs.getDouble("longitude"));
		location.add(rs.getString("city"));
		locations.add(location);
	}
	return locations;
}
