package uk.ac.hw.planets.services;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import uk.ac.hw.planets.comparators.PlanetComparatorFactory;
import uk.ac.hw.planets.entities.Planet;
import uk.ac.hw.planets.entities.SolarSystem;
import uk.ac.hw.planets.forms.PlanetDistanceForm;
import uk.ac.hw.planets.forms.PlanetForm;

public class PlanetService {
	public PlanetDistanceForm getPlanetsDistance(PlanetDistanceForm f) throws Exception {
		SolarSystem planets = SolarSystem.getSolarSystem();
		Planet p1 = planets.getPlanet(f.getPlanet1Name());
		if (p1 == null) {
			throw new Exception("Planet " + f.getPlanet1Name() + " does not exist !");
		}
		Planet p2 = planets.getPlanet(f.getPlanet2Name());
		if (p2 == null) {
			throw new Exception("Planet " + f.getPlanet2Name() + " does not exist !");
		}
		long distance = Math.abs(p1.getDistanceToSun() - p2.getDistanceToSun());
		f.setDistance(distance);
		return f;
	}

	public HashSet<Planet> findPlanet(PlanetForm f) throws Exception {
		HashSet<Planet> list = new HashSet<Planet>();
		if (f.getName() == null)
			throw new Exception("Invalid planet name");

		SolarSystem planets = SolarSystem.getSolarSystem();
		Iterator<Planet> it = planets.iterator();
		while (it.hasNext()) {
			Planet p = it.next();
			String s1 = p.getName().toUpperCase();
			String s2 = f.getName().toUpperCase();
			if (s1.contains(s2)) {
				list.add(p);
			}
		}
		return list;
	}

	public Planet createPlanet(PlanetForm f) {
		SolarSystem s = SolarSystem.getSolarSystem();
		Planet p = new Planet();
		p.setName(f.getName());
		p.setDistanceToSun(f.getDistance());
		p.setVolume(f.getVolume());
		s.add(p);
		return p;
	}

	public TreeSet<Planet> sortPlanets(int criteria) {
		SolarSystem planets = SolarSystem.getSolarSystem();
		Comparator<Planet> cmp = PlanetComparatorFactory.createPlanetComparator(criteria);

		TreeSet<Planet> set = new TreeSet<Planet>(cmp);
		set.addAll(planets);

		return set;
	}
}
