package com.phoenixjcam.csv.controller.dynamic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.phoenixjcam.csv.chart.model.CsvChartModel;
import com.phoenixjcam.csv.chart.service.CsvChartService;

@Controller
public class CsvDynamicController
{
	@Autowired
	private CsvChartService chartService;
	
	@RequestMapping(value = "/dynamicCsv", method = RequestMethod.GET)
	public ModelAndView getJqxChartTest()
	{
		ModelAndView modelAndView = new ModelAndView("dynamicSource/dynamicChartCsv");

		return modelAndView;
	}
	
	@RequestMapping(value = "/dynamicCsvDBFile", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String getCsvDBFile()
	{
		List<CsvChartModel> list = chartService.getAllCharts();

		StringBuilder csv = new StringBuilder();

		// the same functionality as StringBuilder but thread-safe
		StringBuffer test;

		final String COMMA = ",";
		final String NEWLINE = "\n";
		
		for (CsvChartModel chartModel : list)
		{
			csv.append(chartModel.getCountry() + COMMA);
			csv.append(chartModel.getGdpPerCapita() + COMMA);
			csv.append(chartModel.getGdpPerCapitaPercentage() + COMMA);
			csv.append(chartModel.getDebtPerCapita() + NEWLINE);;
		}

		return csv.toString();
	}

	@RequestMapping(value = "/dynamicCsvFile", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String getCsvFile()
	{
		String csv = "Luxembourg,81278.63,16.2,13167.13806" + "\n"
				   + "Singapore,57596.47,102.4,58978.78528" + "\n"
				   + "Norway,53285.21,47.7,25417.04517" + "\n" 
				   + "USA,45759.46,58.9,26952.32194" + "\n"
				   + "Austria,39269.33,70.4,27645.60832" + "\n"
				   + "Germany,34065.12,78.8,26843.31456" + "\n"
				   + "Canada,38065.13,34,12942.1442";

		return csv;
	}

	@RequestMapping(value = "/dynamicPlainText", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String getPlainText()
	{
		return "this is plain text";
	}
	
	/**
	 * A MIME attachment with the content type "application/octet-stream" is a binary file. 
	 * Typically, it will be an application or a document that must be opened in an application, 
	 * such as a spreadsheet or word processor. If the attachment has a filename extension associated with it, 
	 * you may be able to tell what kind of file it is. A .exe extension, for example, indicates it is a Windows 
	 * or DOS program (executable), while a file ending in .doc is probably meant to be opened in Microsoft Word. 
	 * 
	 * @return
	 */
	@RequestMapping(value = "/dynamicOctetStreamFile", method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public byte[] createOctetStreamFile()
	{
		byte[] file = new byte[]
		{ 1, 2, 3, 4, 6 };

		return file;
	}
}
