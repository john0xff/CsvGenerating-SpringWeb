package com.phoenixjcam.csv.chart.dao;

import java.util.List;

import com.phoenixjcam.csv.chart.model.CsvChartModel;

public interface CsvChartDAO
{
	public List<CsvChartModel> getAllCharts();
}
