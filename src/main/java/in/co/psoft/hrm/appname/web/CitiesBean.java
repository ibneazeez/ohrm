package in.co.psoft.hrm.appname.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.psoft.hrm.appname.domain.City;
import in.co.psoft.hrm.appname.repo.CityRepo;
import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

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
