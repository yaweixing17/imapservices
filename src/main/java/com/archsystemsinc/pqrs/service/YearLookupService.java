/**
 * 
 */
package com.archsystemsinc.pqrs.service;

import java.util.List;

import com.archsystemsinc.pqrs.model.YearLookup;

/**
 * This is the Service interface for year_lookup database table.
 * 
 * @author Murugaraj Kandaswamy
 * @since 6/19/2017
 * 
 */
public interface YearLookupService {
	
	YearLookup findByYearName(final String yearName);
	YearLookup findById(final int id);	
	List<YearLookup> findAll();

}
