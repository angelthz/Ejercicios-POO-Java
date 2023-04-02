package personas;

public class DemoPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona("Angel", "Torres", "TOHA941120", 1994,"Mexico", 'M');
		Persona p2 = new Persona("Ana", "Perez", "SOPA981030",1998,"Chile",'F');
		
		p1.showPersona();
		System.out.println("----------------");
		p2.showPersona();
	}
}
