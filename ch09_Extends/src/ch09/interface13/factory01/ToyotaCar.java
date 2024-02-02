package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - 正確にエンジンがかかる~T");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("ToyotaCar - 正確にエンジンがオフになる~T");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - アクセル·イー~T");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("ToyotaCar - アクセル·イー~T");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
