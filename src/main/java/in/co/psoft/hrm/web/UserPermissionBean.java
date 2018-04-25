package in.co.psoft.hrm.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

@RequestScopedComponent("userPermission")
@ManagedBean
public class UserPermissionBean {
	
	private String section; 
	private String[] empPermission;
	private List<String> permissions;
	
	@PostConstruct
    public void init() {
		permissions = new ArrayList<String>();
		permissions.add("Can Read");
		permissions.add("Can Write");
		permissions.add("Can Delete");
		
	}
	public List<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String[] getEmpPermission() {
		return empPermission;
	}
	public void setEmpPermission(String[] empPermission) {
		this.empPermission = empPermission;
	}

}
