package com.phoenixjcam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;

@Controller
public class MainController
{
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("home");
		
		// TODO: add link list to static and dynamic controllers
		
		return modelAndView;
	}
}
