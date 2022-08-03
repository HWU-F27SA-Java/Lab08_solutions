/**
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package uk.ac.hw.planets.comparators;

import java.util.Comparator;

import uk.ac.hw.planets.entities.Planet;

/**
 *
 * @author Hadj
 */
public class PlanetComparatorFactory {

    private static final int ByNAME = 0;
    private static final int ByVOLUME = 1;
    private static final int ByDISTANCE = 2;

    public static Comparator<Planet> createPlanetComparator(int criteria) {
        Comparator<Planet> c = null;
        switch (criteria) {
            case ByNAME:
                c = new NamePlanetComparator();
                break;
            case ByVOLUME:
                c = new VolumePlanetComparator();
                break;
            case ByDISTANCE:
                c = new DistancePlanetComparator();
        }
        return c;
    }
}
