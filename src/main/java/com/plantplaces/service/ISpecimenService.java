package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimens
 * @param specimenDTO
 */
public interface ISpecimenService
{
	/**
	 * Get specimens from persistence layer
	 * @param id A unique lookup
	 * @return A specimen with a matching ID.
	 */
	SpecimenDTO fetchById(int id);
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 */
	void save(SpecimenDTO specimenDTO);
}
