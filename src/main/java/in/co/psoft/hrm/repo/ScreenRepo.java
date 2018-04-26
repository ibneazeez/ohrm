package in.co.psoft.hrm.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;
import in.co.psoft.hrm.domain.Screen;

public interface ScreenRepo extends Repository<Screen, Long>, QueryDslPredicateExecutor<Screen> {

    List<Screen> findAll();
    
  
	Page<Screen> findAll(Pageable pageable);

	Page<Screen> findByNameContainingAllIgnoringCase(String name,Pageable pageable);

	Screen findByNameAllIgnoringCase(String name);
	

}