package chapter14;

public class Country {
	
	String name;
	long population;
	long area;
	double density;

	/**
	 * Constructor
	 * 
	 * @param name  		the country name
	 * @param population 	the country population in 2020
	 * @param area      	the land area of country in km square
	 * @param density		the country population density per km square
	 */
	public Country(String name, long population, long area, double density) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.density = density;
	}

	public Country() {
		name = "";
		population = 0;
		area = 0;
		density = 0;
	}
 
	/**
	 * Set the country name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the country name
	 */
	public void setPopulation(long population) {
		this.population = population;
	}

	/**
	 * Set the land area of country
	 */
	public void setArea(long area) {
		this.area = area;
	}

	/**
	 * Set the country population density
	 */
	public void setDensity(double density) {
		this.density = density;
	}
	
	/**
	 * Returns the country name
	 * 
	 * @return the country name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the country population
	 * 
	 * @return the country population
	 */
	public long getPopulation() {
		return population;
	}
	
	/**
	 * Returns the land area of country
	 * 
	 * @return the land area of country
	 */
	public long getArea() {
		return area;
	}
	
	/**
	 * Returns the country population density
	 * 
	 * @return the country population density
	 */
	public double getDensity() {
		return density;
	}

	/**
	 * Returns a string 
	 */
	public String toString() {
		return "Country[name: "+ name +", population: "+ population +", area: "+ area +", density: "+ density +"]";
	}

	

}
