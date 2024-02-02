package ch09.resolve14;

public class TabletTester {
	private final int TABLET_NUM = 3;
	private ITablet tablet;
	
	public TabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	public TabletTester() {
		
	}
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
}
