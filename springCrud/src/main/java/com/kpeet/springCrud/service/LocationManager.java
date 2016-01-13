package com.kpeet.springCrud.service;

import java.util.List;

import com.kpeet.springCrud.domain.Location;


public interface LocationManager {
	
	  public List<Location> getLocations();
	    
	    public void newLocation(String direccion);
}
