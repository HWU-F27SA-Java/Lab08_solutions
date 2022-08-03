package uk.ac.hw.planets.entities;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class SolarSystem extends HashSet<Planet> {
    private static final long serialVersionUID = 1L;
	private static SolarSystem system = null;

    public static SolarSystem getSolarSystem() {
        if (system == null) {//we create the instance only if is has not been created
            system = new SolarSystem();//we keep the single instance in a static private variable
        }
        return system;
    }

    private SolarSystem() {//private constructor to allow only one instance of this class called singleton
        super();
    }

    public Planet getPlanet(String s) {
        Planet p = new Planet(s);
        LinkedList<Planet> liste = new LinkedList<Planet>(this);
        int i = Collections.binarySearch(liste, p);
        if (i >= 0) {
            p = liste.get(i);
        } else {
            p = null;
        }
        return p;
    }
}
