import java.sql.ResultSet;
import java.util.logging.Logger;

import org.bonitasoft.leavemanagement.Employee;
import org.bonitasoft.leavemanagement.EmployeeApplicableLeave;
import org.bonitasoft.leavemanagement.EmployeeLeave;
import org.bonitasoft.leavemanagement.LeaveType;

def static Map mapLeaveType(ResultSet rs)
{
	Map leaveTypes = new HashMap();	
	while(rs.next()){
		LeaveType leaveType = new LeaveType();
		leaveType.setDefaultDaysOff(rs.getDouble("default_days_off"));
		leaveType.setId(rs.getLong("id"));
		leaveType.setName(rs.getString("type"));
		leaveType.setAutoValidate(rs.getBoolean("auto_validate"));
		leaveTypes.put(rs.getLong("id"), leaveType)
	}
	return leaveTypes;
}

def static List mapLeaveTypeList(ResultSet rs)
{
	List leaveTypes = new ArrayList();
	while(rs.next()){
		LeaveType leaveType = new LeaveType();
		leaveType.setDefaultDaysOff(rs.getDouble("default_days_off"));
		leaveType.setId(rs.getLong("id"));
		leaveType.setName(rs.getString("type"));
		leaveType.setAutoValidate(rs.getBoolean("auto_validate"));
		leaveTypes.add(leaveType);
	}
	return leaveTypes;
}


def static Map mapApplicableLeave(ResultSet rs)
{
	Map availableLeave = new HashMap();
	while(rs.next()){
		EmployeeApplicableLeave applicableLeave = new EmployeeApplicableLeave();
		applicableLeave.setLeaveTypeId(rs.getLong("leave_type_id"));
		applicableLeave.setTotal(rs.getDouble("total"));
		applicableLeave.setTotalTaken(rs.getDouble("total_taken"));
		applicableLeave.setTotalAvailable(rs.getDouble("total_available"));
		applicableLeave.setEmployeeId(rs.getLong("employee_id"));
		availableLeave.put(rs.getLong("leave_type_id"), applicableLeave);
	}
	return availableLeave;
}

def static Map mapLeaveApplied(ResultSet rs)
{
	Map leavesTaken = new HashMap();
 	while(rs.next()){
		leavesTaken.put(rs.getLong("leave_type_id"),rs.getDouble("days_off"))
	}
	return leavesTaken;
}

def static Employee mapEmployee(ResultSet rs){
	Employee employee = new Employee();
	while(rs.next()){
		employee.setBonitaUserId(rs.getLong("bonita_user_id"));
		employee.setId(rs.getLong("id"));
		employee.setFirstName(rs.getString("first_name"));
		employee.setLastName(rs.getString("last_name"));   
		}
   return employee;
}

def static EmployeeLeave mapEmployeeLeave(ResultSet rs){
	EmployeeLeave employeeLeave = new EmployeeLeave();
	while(rs.next()){
		employeeLeave.setLeaveTypeId(rs.getLong("leave_type_id"));
		employeeLeave.setId(rs.getLong("id"));
		employeeLeave.setStatus(rs.getString("status"));
		employeeLeave.setStartDate(rs.getDate("start_date"));
		employeeLeave.setEndDate(rs.getDate("end_date"));
		employeeLeave.setReturnDate(rs.getDate("return_date"));
		employeeLeave.setDaysOff(rs.getDouble("days_off"));
		employeeLeave.setEmployeeId(rs.getLong("employee_id"));
	}
   return employeeLeave;
}

