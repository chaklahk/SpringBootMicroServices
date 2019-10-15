package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService
{
	public SpecimenDTO fetchById(int id)
	{
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("40.70");
		specimenDTO.setLongitude("-65.42");
		specimenDTO.setDescription("A beautiful Eastern RedBud");
		return specimenDTO;
	}
	
	public void save(SpecimenDTO specimenDTO)
	{
		
	}
}
