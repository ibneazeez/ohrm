package in.co.psoft.hrm.web;


import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.UserPermissions;
import in.co.psoft.hrm.repo.UserPermissionsRepo;

@RequestScopedComponent("userPermissionsBean")
@ManagedBean
public class UserPermissionsBean {


	@Autowired
	private UserPermissionsRepo userPermissionsRepo;

	@Autowired
	private UserPermissionsDaoImplementation userPermissionsDAO;
	public UserPermissions getUserPermissions() {
		return userPermissions;
	}


	public void setUserPermissions(UserPermissions userPermissions) {
		this.userPermissions = userPermissions;
	}


	public List<UserPermissions> getUsersPermissions() {
		if (usersPermissions == null) {
			usersPermissions = userPermissionsRepo.findAll();
		}
		return usersPermissions;
	}


	public void setUsersPermissions(List<UserPermissions> usersPermissions) {
		this.usersPermissions = usersPermissions;
	}


	@Autowired
	private UserPermissions userPermissions;
	private List<UserPermissions> usersPermissions;


	public String saveUser() throws IOException {
		
		userPermissionsDAO.save(userPermissions);
        return "userPermissionList";
	}

	
}
