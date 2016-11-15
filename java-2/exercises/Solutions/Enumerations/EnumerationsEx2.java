/* 
	Exercise 2 of Enumerations
	Author: Javier Reyes
 */

// 2.-Write enums code in a switch statements
public class EnumerationsEx2 {

	public static enum Planets {

		Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
	}

	public static String getPlanet(Planets PlanetNum) {

		switch(PlanetNum) {

		case Mercury:
			return "I'm melting!";
		case Venus:
			return "Everything shines";
		case Earth:
			return "It's a little boring";
		case Mars:
			return "Everything is Red";
		case Jupiter:
			return "It's really big";
		case Saturn:
			return "It needs more rings";
		case Uranus:
			return "It's getting colder around here";
		case Neptune:
			return "I miss Pluto";
		default:
			return "I guess you are now stranded";
		}
	}

	public static void main(String[] args) {	
		
		Planets searchPlanet = null;
		
		System.out.println("---- Start ----");
		System.out.println("Begin in " + searchPlanet.Mercury.toString() +" : " + getPlanet(Planets.Mercury));
		System.out.println("Now traveling to " + searchPlanet.Venus.toString()+ " :");
		System.out.println(getPlanet(Planets.Venus));
		System.out.println("Now traveling to " + searchPlanet.Earth.toString()+ " :");
		System.out.println(getPlanet(Planets.Earth));
	}
}
