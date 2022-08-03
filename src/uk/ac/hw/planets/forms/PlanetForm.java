/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.hw.planets.forms;

/**
 * 
 * @author Hadj
 */
public class PlanetForm {
	private String name;
	private long distance;
	private int volume;

	public PlanetForm(String nom, long distance, int volume) {
		this.name = nom;
		this.distance = distance;
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public long getDistance() {
		return distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String nom) {
		this.name = nom;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
