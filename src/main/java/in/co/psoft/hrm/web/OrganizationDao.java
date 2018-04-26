package in.co.psoft.hrm.web;

import java.util.List;

import in.co.psoft.hrm.domain.Organization;

public interface OrganizationDao {

	String findById(Long id);

	List<Organization> findAll();

	void save(Organization organization);

	void updateOrganization(Organization organization);

	void delete(Long id);

}
