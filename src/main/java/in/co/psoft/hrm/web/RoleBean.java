package in.co.psoft.hrm.web;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.Role;

import in.co.psoft.hrm.repo.RoleRepo;


@RequestScopedComponent("roleBean")
@ManagedBean
public class RoleBean {


	@Autowired
	private RoleRepo roleRepo;

	@Autowired
	private RoleDaoImplementation roleDAO;
	@Autowired
	private Role role;
	private List<Role> roles;

	
	

	public List<Role> getRoles() {
		if (roles == null) {
			roles = roleRepo.findAll();
		}

		return roles;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String saveRole(){
		roleDAO.save(role);
        return "roleList";
	}

	
}
