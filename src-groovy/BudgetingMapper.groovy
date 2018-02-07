import java.sql.ResultSet;
import java.sql.SQLException;

import org.bonitasoft.budgeting.Budget;
import com.bonitasoft.engine.api.APIAccessor;
import com.bonitasoft.engine.api.IdentityAPI;


private def static Budget mapBudget(ResultSet resultSet, APIAccessor apiAccessor){
	List budgets = mapBudgets(resultSet, apiAccessor);
	return budgets.size() == 1 ? budgets.get(0) : new Budget();
}

private def static List<Budget> mapBudgets(ResultSet resultSet, APIAccessor apiAccessor){
	IdentityAPI identityAPI = apiAccessor.getIdentityAPI();
	List<Budget> budgets = new ArrayList<Budget>();
	while(resultSet.next()){
		Budget budget = new Budget();
		budget.setId(resultSet.getLong("id"));
		budget.setStatus(resultSet.getString("status"))
		budget.setObjective(resultSet.getString("objective"));
		budget.setComment(resultSet.getString("comment"));
		budget.setDepartment(resultSet.getString("department"));
		budget.setAttachmentName(resultSet.getString("attachment_name"));
		budget.setBudgetYear(resultSet.getString("budget_year"));
		Long groupId =  resultSet.getLong("bonita_group_id") == null ? 0L : resultSet.getLong("bonita_group_id")
		budget.setBonitaGroupId(groupId);
		budget.setDepartmentName(groupId == 0L ? "" : identityAPI.getGroup(groupId).getDisplayName());
	
		Long userId =  resultSet.getLong("department_head_id") == null ? 0L : resultSet.getLong("department_head_id")
		budget.setDepartmentHeadId(userId);
		budget.setDepartmentHeadName(userId == 0L ? "" : String.format("%s %s", identityAPI.getUser(userId).getFirstName(), identityAPI.getUser(userId).getLastName()));
	
		budget.setParentBudgetId(resultSet.getLong("parent_budget_id"))
		budget.setPlannedBudget(resultSet.getDouble("planned_budget"));
		budget.setActualBudget(resultSet.getDouble("actual_budget"));
		budget.setCreatedDate(getDate(resultSet, "created_date"));
		budgets.add(budget);
	}
	return budgets;
}

def static Boolean getBoolean(ResultSet resultset, String parameterName){
	return 1 == resultset.getInt(parameterName);
}

def static Date getDate(ResultSet result, String parameterName)
{
	   try {
			return result.getDate(parameterName) == null ? null :
					new Date(result.getDate(parameterName).getTime()) ;
		} catch (SQLException e) {
		   throw new RuntimeException(e);
		}
}
