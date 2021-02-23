package com.objarr.model.vo;

public class Nation {

	private String name;
	private long population;
	private String language;
	private double size;
	private String flower;
	
	public Nation() {}
	
	public Nation(String name, long population, String language, 
			double size, String flower) {
		this.name=name;
		this.population=population;
		this.language=language;
		this.size=size;
		this.flower=flower;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setPopulation(long pop) {
		population=pop;
	}
	public long getPopulation() {
		return population;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getLanguage() {
		return language;
	}
	public void setSize(double size) {
		this.size=size;
	}
	public double getSize() {
		return size;
	}
	public void setFlower(String flower) {
		this.flower=flower;
	}
	public String getFlower() {
		return flower;
	}
	
}








