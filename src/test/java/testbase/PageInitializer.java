package testbase;

import pages.DashboardPageElements;

public class PageInitializer extends BaseClass{

	
	protected static DashboardPageElements dash;
	
	public static void initializePageObjects() {
	
		dash = new DashboardPageElements();
		
	}
}
