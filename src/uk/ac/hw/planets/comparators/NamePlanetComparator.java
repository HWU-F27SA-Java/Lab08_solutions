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
public class NamePlanetComparator implements Comparator<Planet> {
  public int compare(Planet p1, Planet p2) {
        return p1.getName().compareTo(p2.getName());
  }

}
