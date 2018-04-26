
package in.co.psoft.hrm.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import in.co.psoft.hrm.domain.Organization;
@Component
public class OrganizationDaoImplementation implements OrganizationDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public void updateOrganization(Organization organization) {
		if(organization!=null)
		em.merge(organization);
	}
	@Override			
	public void delete(Long id){
		Organization organization=(Organization)em.find(Organization.class,id);
		em.remove(organization);
	}
  
@Override
	public void save(Organization organization) {
		em.persist(organization);
	}
@Override
public String findById(Long id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<Organization> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
