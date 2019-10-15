package com.plantplaces.dto;

public class SpecimenDTO
{
	private int specimenId;
	private String latitude;
	private String longitude;
	private String description;
	
	public int getSpecimenId()
	{
		return specimenId;
	}
	public String getLatitude()
	{
		return latitude;
	}
	public String getLongitude()
	{
		return longitude;
	}
	public void setSpecimenId(int specimenId)
	{
		this.specimenId = specimenId;
	}
	public void setLatitude(String latitude)
	{
		this.latitude = latitude;
	}
	public void setLongitude(String longitude)
	{
		this.longitude = longitude;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
}
