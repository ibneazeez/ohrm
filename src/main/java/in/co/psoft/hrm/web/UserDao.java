package in.co.psoft.hrm.web;

import java.util.List;


import in.co.psoft.hrm.domain.User;

public interface UserDao {

	String findById(Long id);

	List<User> findAll();

	void save(User user);

	void updateUser(User user);

	void delete(Long id);

}
