package com.archsystemsinc.pqrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archsystemsinc.pqrs.model.YearLookup;

/**
 * This is the Spring Data JPA Repository interface for year_lookup database table.
 * 
 * @author Murugaraj Kandaswamy
 * @since 6/19/2017
 * 
 */
public interface YearLookupRepository extends JpaRepository<YearLookup, Long> {
	
	YearLookup findByYearName(final String yearName);
	YearLookup findById(final int id);


}
