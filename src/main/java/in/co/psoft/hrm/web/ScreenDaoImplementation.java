package in.co.psoft.hrm.web;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import in.co.psoft.hrm.domain.Screen;



@Component
public class ScreenDaoImplementation implements ScreenDao{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Screen screen) {
		em.persist(screen);
		
		}
}
