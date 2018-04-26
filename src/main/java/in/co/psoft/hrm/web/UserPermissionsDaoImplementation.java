package in.co.psoft.hrm.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import in.co.psoft.hrm.domain.UserPermissions;
@Component
public class UserPermissionsDaoImplementation implements UserPermissionsDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(UserPermissions userPermissions) {
		em.persist(userPermissions);
		
		}
}
