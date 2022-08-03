package uk.ac.hw.planets.views;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import uk.ac.hw.planets.entities.Planet;
import uk.ac.hw.planets.forms.PlanetDistanceForm;
import uk.ac.hw.planets.forms.PlanetForm;

public class View {
	Scanner input = new Scanner(System.in);
	
	public int displayMenu() {
		System.out.println("______________________________");		
		System.out.println("0 : Add a planet");
		System.out.println("1 : Select a planet");
		System.out.println("2 : Sort planets");
		System.out.println("3 : Get distance between two planets");
		System.out.println("4 : Quit");
		System.out.print("What is your choice ? ");
		int choice = input.nextInt(); input.nextLine();
		System.out.println("______________________________");
		return choice;
	}

	public void displayPlanets(Collection<Planet> planetes) {
		Iterator<Planet> it = planetes.iterator();
		System.out.println("Name\t" + "Distance to sun\t" + "Volume");
		while (it.hasNext()) {
			Planet p = it.next();
			System.out.println(p.getName() + "\t" + p.getDistanceToSun() + "\t" + p.getVolume());
		}
	}

	public void displayDistance(PlanetDistanceForm f) {
		System.out.println("Distance between " + f.getPlanet1Name() + " and " + f.getPlanet2Name() + " = " + f.getDistance());
	}

	public void displayError(Exception e) {
		System.out.println("ERROR : " + e.getMessage());

	}

	public void displayPlanet(Planet p) {
		System.out.println("Name\t" + "Distance to sun\t" + "Volume");
		System.out.println(p.getName() + "\t" + p.getDistanceToSun() + "\t" + p.getVolume());
	}

	public PlanetForm readPlanetName() {
		System.out.print("Name ? \t");
		String name = input.nextLine();
		return new PlanetForm(name, 0, 0);
	}

	public uk.ac.hw.planets.forms.PlanetForm readPlanet() {
		System.out.print("Name ? \t");
		String name= input.nextLine();
		System.out.print("Distance to sun   \t? ");
		long distance = input.nextLong();
		System.out.print("Volume   \t? ");
		int volume = input.nextInt();
		return new PlanetForm(name, distance, volume);
	}

	public uk.ac.hw.planets.forms.PlanetDistanceForm read2PlanetNames() {
		System.out.print("Planet 1 name ? \t");
		String name1 = input.nextLine();
		System.out.print("Planet 2 name ? \t");
		String name2 = input.nextLine();
		return new PlanetDistanceForm(name1, name2);
	}

	public int readCriteria() {
		System.out.print("What is the sorting criteria (0- Name, 1- Volume, 2- Distance)? \t");
		int criteria = input.nextInt();
		return criteria;
	}

}
