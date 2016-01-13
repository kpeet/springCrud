package com.kpeet.springCrud.dao;

import java.util.List;

import com.kpeet.springCrud.domain.Location;


public interface LocationDao {
	
	public List<Location> getLocationList();

    public void mergeLocation(Location loc);
    
    public void persistLocation(Location loc);

}

