
package in.co.psoft.hrm.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;


import in.co.psoft.hrm.domain.User;

@Component
public class UserDaoImplementation implements UserDao {

	@PersistenceContext
	private EntityManager em;
	@Override

	public void updateUser(User user) {
		if(user!=null)
	em.merge(user);}
				
public void delete(Long id){

		User entityUser=(User)em.find(User.class,id);
		em.remove(entityUser);
}
  
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		em.persist(user);
		
		}
	@Override
	public String findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	}
