package in.co.psoft.hrm.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;
import in.co.psoft.hrm.domain.UserPermissions;

public interface UserPermissionsRepo extends Repository<UserPermissions, Long>, QueryDslPredicateExecutor<UserPermissions> {

    List<UserPermissions> findAll();
    
  
	Page<UserPermissions> findAll(Pageable pageable);

	UserPermissions findById(Long id);
	
	
	

}
