import java.util.logging.Logger;

import javax.management.relation.RoleNotFoundException;

import org.bonitasoft.engine.identity.Role;
import org.bonitasoft.engine.identity.User;
import org.bonitasoft.engine.identity.UserCriterion;
import org.bonitasoft.engine.identity.UserMembership;
import org.bonitasoft.engine.identity.UserMembershipCriterion;

import com.bonitasoft.engine.api.APIAccessor;

def static List findUsers(APIAccessor apiAccessor, long groupId, String roleName){
Logger logger = Logger.getLogger("org.bonitasoft.test");
	Role role = null;
	try{
		role = apiAccessor.getIdentityAPI().getRoleByName(roleName);
	}catch(RoleNotFoundException roleNotFound){
		return new ArrayList();
	}
	long roleId = role.getId();
	List users = apiAccessor.getIdentityAPI().getUsersInRole(roleId, 0, 100, UserCriterion.FIRST_NAME_ASC);
	List finalUsers = [];
	for(User user in users){
		List memberships = apiAccessor.getIdentityAPI().getUserMemberships(user.getId(), 0, 10, UserMembershipCriterion.GROUP_NAME_ASC);
		for(UserMembership mem in memberships){
			if(mem.getGroupId() == groupId){
				finalUsers.add(user);
			}
		}
	}
	return finalUsers;
}