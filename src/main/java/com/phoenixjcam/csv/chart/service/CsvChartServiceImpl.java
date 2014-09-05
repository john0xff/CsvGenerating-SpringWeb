package com.phoenixjcam.csv.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.csv.chart.dao.CsvChartDAO;
import com.phoenixjcam.csv.chart.model.CsvChartModel;

@Service
@Transactional
public class CsvChartServiceImpl implements CsvChartService
{
	@Autowired
	private CsvChartDAO csvChartDAO;

	@Override
	public List<CsvChartModel> getAllCharts()
	{
		return csvChartDAO.getAllCharts();
	}

}
