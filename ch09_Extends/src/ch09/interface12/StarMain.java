package ch09.interface12;

public class StarMain {
	public static void walk(StarUnit[] units) {
		for(StarUnit unit : units) {
			unit.walk();
		}
	}
	public static void attack(StarUnit[] units) {
		for(StarUnit unit : units) {
			unit.attack();
		}
	}
	public static void die(StarUnit[] units) {
		for(StarUnit unit : units) {
			unit.die();
		}
	}
	public static void main(String[] args) {
		StarUnit[] units = new StarUnit[] {
				new Marine(),
				new Scv(),
				new Hydra()
		};
		
		walk(units);
		attack(units);
		die(units);
	}
}
