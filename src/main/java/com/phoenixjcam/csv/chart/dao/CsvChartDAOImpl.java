package com.phoenixjcam.csv.chart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.csv.chart.model.CsvChartModel;

@Repository
public class CsvChartDAOImpl implements CsvChartDAO
{
	@Autowired
	SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CsvChartModel> getAllCharts()
	{
		return getCurrentSession().createQuery("from CsvChartModel").list();
	}

}
