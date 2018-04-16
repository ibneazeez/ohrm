package in.co.psoft.hrm.web;



import java.util.List;

import in.co.psoft.hrm.domain.User;

public interface UserService { 

		User findById(Integer id);
		
		List<User> findAll();

		void saveOrUpdate(User user);
		
		void delete(int id);
		
	}
