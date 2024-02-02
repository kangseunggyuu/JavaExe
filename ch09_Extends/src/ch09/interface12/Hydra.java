package ch09.interface12;

public class Hydra implements StarUnit{

	@Override
	public void walk() {
		System.out.println("스물스물&&");
	}

	@Override
	public void attack() {
		System.out.println("퉷퉷&&");
	}

	@Override
	public void die() {
		System.out.println("크아악&&");
	}

}
