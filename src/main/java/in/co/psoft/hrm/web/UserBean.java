package in.co.psoft.hrm.web;

import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.jsf.ViewScopedComponent;
import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.User;
import in.co.psoft.hrm.repo.UserRepo;

@ViewScopedComponent("userBean")
public class UserBean{


	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserDaoImplementation userDAO;
	
	@Autowired
	private User user;
	private List<User> users;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		if (users == null) {
			users = userRepo.findAll();
		}

		return users;
	}

	public String saveUser() {
		
		userDAO.save(user);
		return "userlist";
	}
	public String updateUser() {
	ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	 String firstname = ec.getRequestParameterMap().get("form1:first_name");
	 System.out.println(firstname);
	 userDAO.update(user);	
	return "userlist";
	
	}	
		
}
