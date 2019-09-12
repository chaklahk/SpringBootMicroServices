package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 */
@Controller
public class PlantPlacesController 
{
	/**
	 * Handles the /start endpoint
	 * @return 
	 */
	@RequestMapping("/start")
	public String start() 
	{
		return "start";
	}
	
	@RequestMapping("/")
	public String index() 
	{
		return "start";
	}
}