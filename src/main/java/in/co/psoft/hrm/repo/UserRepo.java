package in.co.psoft.hrm.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import in.co.psoft.hrm.domain.User;

public interface UserRepo extends Repository<User, Long>, QueryDslPredicateExecutor<User> {

    List<User> findAll();
    
  
	Page<User> findAll(Pageable pageable);

	Page<User> findByFirstNameContainingAndLastNameContainingAllIgnoringCase(String firstName,
			String lastName, Pageable pageable);

	User findByFirstNameAndLastNameAllIgnoringCase(String firstName, String lastName);
	
	
	

}
