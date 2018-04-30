package in.co.psoft.hrm.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import in.co.psoft.hrm.domain.Role;



public interface RoleRepo extends Repository<Role, Long>, QueryDslPredicateExecutor<Role> {

    List<Role> findAll();
      
	Page<Role> findAll(Pageable pageable);

	Page<Role> findByNameContainingAllIgnoringCase(String name,Pageable pageable);

	Role findByNameAllIgnoringCase(String name);
	
	Role findById(long id);
	

}