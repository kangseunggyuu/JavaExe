package ch09.resolve14;

public class Sony implements ITablet{

	@Override
	public void movie() {
		System.out.println("This is Sony Movie");
		
	}

	@Override
	public void music() {
		System.out.println("This is Sony Music");
		
	}

	@Override
	public void readBook() {
		System.out.println("This is Sony readBook");
		
	}

}
