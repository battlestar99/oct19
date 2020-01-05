package seleniumWebdriver;

public class firefoxDriver implements WebDriver {

	@Override
	public void sendkeys() {
		System.out.println("firefox sendkeyss");
		
	}

	@Override
	public String findelemenn() {
		System.out.println("firefox findlement");
		return null;
	}

	@Override
	public void click() {
		System.out.println("firefox click");
		
	}

	@Override
	public void deselect() {
		System.out.println("firefox deselect");
		
	}
	
	

}
