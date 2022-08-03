/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.hw.planets.controllers;

import java.util.Collection;

import uk.ac.hw.planets.entities.Planet;
import uk.ac.hw.planets.forms.PlanetDistanceForm;
import uk.ac.hw.planets.forms.PlanetForm;
import uk.ac.hw.planets.services.PlanetService;
import uk.ac.hw.planets.views.View;

/**
 * 
 * @author Hadj
 */
public class MainController {
	public static void main(String[] args) {
		int userChoice = 4;
		View view = new View();
		PlanetService service = new PlanetService();
		do {
			userChoice = view.displayMenu();
			try {
				switch (userChoice) {
				case 0:// create planet
				{
					PlanetForm form = view.readPlanet();
					Planet p = service.createPlanet(form);
					view.displayPlanet(p);
				}
					break;
				case 1:// find planet
				{
					PlanetForm form = view.readPlanetName();
					Collection<Planet> list = service.findPlanet(form);
					view.displayPlanets(list);
				}
					break;
				case 2:// sort
				{
					int c = view.readCriteria();
					Collection<Planet> list = service.sortPlanets(c);
					view.displayPlanets(list);
				}
					break;
				case 3:// distance
				{
					PlanetDistanceForm form = view.read2PlanetNames();
					form = service.getPlanetsDistance(form);
					view.displayDistance(form);
				}
					break;
				}

			} catch (Exception e) {
				view.displayError(e);
			}
		} while (userChoice != 4);
	}

}
