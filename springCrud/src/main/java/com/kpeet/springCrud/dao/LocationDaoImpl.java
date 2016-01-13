package com.kpeet.springCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kpeet.springCrud.domain.Location;


@Repository(value = "locationDao")
public class LocationDaoImpl implements LocationDao{
	
	@PersistenceContext
    public EntityManager em;

	@Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Location> getLocationList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mergeLocation(Location loc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persistLocation(Location loc) {
		// TODO Auto-generated method stub
		
	}

}
