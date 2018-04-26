package in.co.psoft.hrm.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import javax.servlet.http.Part;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.Organization;
import in.co.psoft.hrm.repo.OrganizationRepo;



@RequestScopedComponent("organizationBean")
@ManagedBean
public class OrganizationBean {


	@Autowired
	private OrganizationRepo organizationRepo;

	@Autowired
	private OrganizationDaoImplementation organizationDAO;
	@Autowired
	private Organization organization;
	private List<Organization> organizations;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<Organization> getOrganizations() {
		if (organizations == null) {
			organizations = organizationRepo.findAll();
		}
		return organizations;
	}

	public void setOrganizations(List<Organization> organizations) {
		this.organizations = organizations;
	}

	public String saveOrganization(){
		organizationDAO.save(organization);
        return "organizationlist";
	}

	public String updateOrganization(Organization organization){
		organizationDAO.updateOrganization(organization);
		return "organizationlist";
		}
	public String getOrganization(Long id) {
		organization = organizationRepo.findById(id);	
		System.out.println(organization);
		return "updateOrganization"; 
	}
	@Transactional
	public String deleteOrganization(Long id) {
	organizationDAO.delete(id);
	return "organizationlist";
	}
}
