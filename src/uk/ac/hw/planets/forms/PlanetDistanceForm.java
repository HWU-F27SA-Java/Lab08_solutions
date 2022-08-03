/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.hw.planets.forms;

/**
 * 
 * @author Hadj
 */
public class PlanetDistanceForm {
  private String planet1Name;
  private String planet2Name;
  private long distance;
  
  public PlanetDistanceForm() {
  }

  public PlanetDistanceForm(String planet1Name, String planet2Name) {
        this.planet1Name = planet1Name;
        this.planet2Name = planet2Name;
  }

  public String getPlanet2Name() {
        return planet2Name;
  }

 
  public String getPlanet1Name() {
        return planet1Name;
  }

public long getDistance() {
	return distance;
}

public void setPlanet1Name(String planet1Name) {
	this.planet1Name = planet1Name;
}

public void setPlanet2Name(String planet2Name) {
	this.planet2Name = planet2Name;
}

public void setDistance(long distance) {
	this.distance = distance;
}

  

}
