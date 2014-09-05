package com.phoenixjcam.csv.chart.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "csv_chart", catalog = "jquery_data_source")
public class CsvChartModel
{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "country", length = 60)
	private String country;

	@Column(name = "gdp_per_capita")
	private double gdpPerCapita;

	@Column(name = "debt_per_capita_percentage")
	private double gdpPerCapitaPercentage;

	@Column(name = "debt_per_capita")
	private double debtPerCapita;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public double getGdpPerCapita()
	{
		return gdpPerCapita;
	}

	public void setGdpPerCapita(double gdpPerCapita)
	{
		this.gdpPerCapita = gdpPerCapita;
	}

	public double getGdpPerCapitaPercentage()
	{
		return gdpPerCapitaPercentage;
	}

	public void setGdpPerCapitaPercentage(double gdpPerCapitaPercentage)
	{
		this.gdpPerCapitaPercentage = gdpPerCapitaPercentage;
	}

	public double getDebtPerCapita()
	{
		return debtPerCapita;
	}

	public void setDebtPerCapita(double debtPerCapita)
	{
		this.debtPerCapita = debtPerCapita;
	}

}
