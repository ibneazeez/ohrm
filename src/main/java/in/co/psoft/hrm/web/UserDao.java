package in.co.psoft.hrm.web;

import java.util.List;

import in.co.psoft.hrm.domain.User;

public interface UserDao {

	User findById(Long id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);

}
