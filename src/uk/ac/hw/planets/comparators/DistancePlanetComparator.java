/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.hw.planets.comparators;

import java.util.Comparator;

import uk.ac.hw.planets.entities.Planet;
/**
 * 
 * @author Hadj
 */
public class DistancePlanetComparator implements Comparator<Planet> {
  public int compare(Planet p1, Planet p2) {
        Long i1 = p1.getDistanceToSun();
        Long i2 = p2.getDistanceToSun();
        return i1.compareTo(i2);
  }

}
