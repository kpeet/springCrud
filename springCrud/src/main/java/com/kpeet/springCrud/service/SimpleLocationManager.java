package com.kpeet.springCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpeet.springCrud.dao.LocationDao;
import com.kpeet.springCrud.domain.Location;

@Service
public class SimpleLocationManager implements LocationManager{
	
	@Autowired
 	LocationDao locationDao;
	
	  private List<Location> locations;

	@Override
	public List<Location> getLocations() {
		List<Location> locations = locationDao.getLocationList();
    	
        return locations; 
	}

	@Override
	public void newLocation(String direccion) {
		 Location location_2 = new Location();
	        location_2.setAddress(direccion);
    	 	locationDao.persistLocation(location_2);
		
		
	}

}
