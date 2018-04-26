package in.co.psoft.hrm.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import in.co.psoft.hrm.domain.Organization;



public interface OrganizationRepo extends Repository<Organization, Long>, QueryDslPredicateExecutor<Organization> {

    List<Organization> findAll();
    
  
	Page<Organization> findAll(Pageable pageable);

	Page<Organization> findByNameContainingAllIgnoringCase(String name, Pageable pageable);

	Organization findByNameAllIgnoringCase(String name);


	Organization findById(Long id);
	
	
	

}
