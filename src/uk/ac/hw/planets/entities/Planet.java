
package uk.ac.hw.planets.entities;

public class Planet implements Comparable<Planet> {
  private String name;

  private long distanceToSun;

  private int volume;

  public Planet() {
        
  }

  public Planet(String name) {
        this.name = name;
  }

  public int getVolume() {
        return volume;
  }

  public void setVolume(int volume) {
        this.volume = volume;
  }

  public long getDistanceToSun() {
        return distanceToSun;
  }

  public void setDistanceToSun(long distance_soleil) {
        this.distanceToSun = distance_soleil;
  }

  public String getName() {
        return name;
  }

  public void setName(String nom) {
        this.name = nom;
  }

  @Override
  public boolean equals(Object obj) {
        if(obj instanceof Planet){
            Planet p = (Planet) obj;
            String s = p.getName();
            return s.equalsIgnoreCase(name) ;
        }
        return false;
  }

  public int compareTo(Planet obj) {
            return name.compareTo(obj.getName()) ;
  }

}
