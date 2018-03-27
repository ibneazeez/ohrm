package in.co.psoft.hrm.appname.repo;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import in.co.psoft.hrm.appname.domain.City;

public interface CityRepo extends Repository<City, Long>, QueryDslPredicateExecutor<City> {

    List<City> findAll();
    
    /*
	Page<City> findAll(Pageable pageable);

	Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
			String country, Pageable pageable);

	City findByNameAndCountryAllIgnoringCase(String name, String country);
	*/

}
