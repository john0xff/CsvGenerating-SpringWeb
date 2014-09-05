package com.phoenixjcam.csv.controller.staticc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CsvStaticController
{
	/**
	 * Return jsp with jquery chart content
	 * second step, request for XML file with XHR object which is in data.json 
	 * path to this file - res/chartjqx/chartXml/orders.xml
	 * 
	 * @return
	 */
	@RequestMapping(value = "/staticCsv", method = RequestMethod.GET)
	public ModelAndView getJqxChartTest()
	{
		ModelAndView modelAndView = new ModelAndView("staticSource/staticChartCsv");

		return modelAndView;
	}
}
