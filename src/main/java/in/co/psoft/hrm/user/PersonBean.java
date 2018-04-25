package in.co.psoft.hrm.user;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.User;
import in.co.psoft.hrm.repo.UserRepo;

@ManagedBean(name = "personBean")
@RequestScopedComponent
public class PersonBean {

	@Autowired
	private UserRepo userRepo;

	@PersistenceContext
	private EntityManager em;

	private List<User> users;

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@PostConstruct
	public void init() {
		user = new user();
	}

	public String saveUser() {
		em.persist(user);
		return "listUser";
	}

	public List<User> getUsers() {
		if (users == null) {
			users = userRepo.findAll();
		}
		return users;
	}

	public String findById(Long id) {
		user = userRepo.findById(id);
		return "updatePerson";
	}

	public String updateUser() {
		em.merge(user);
		return "listUser";
	}
	
	public String deleteUser(Long id) {
		User user = em.find(User.class, id);
		System.out.println(user.getId());
		em.remove(user);
		return null;
	}

}
