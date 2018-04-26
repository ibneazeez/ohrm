package in.co.psoft.hrm.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import in.co.psoft.hrm.domain.Role;

@Component
public class RoleDaoImplementation implements RoleDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Role role) {
		em.persist(role);
		
		}
}
