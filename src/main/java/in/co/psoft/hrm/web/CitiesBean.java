package in.co.psoft.hrm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
import in.co.psoft.hrm.domain.City;
import in.co.psoft.hrm.repo.CityRepo;

@RequestScopedComponent("citiesBean")
public class CitiesBean {
    
    @Autowired
    private CityRepo cityRepo;
    
    private List<City> cities;
    
    public List<City> getCities() {
        if (cities == null) {
            cities = cityRepo.findAll();
        }
        
        return cities;
    }
}
