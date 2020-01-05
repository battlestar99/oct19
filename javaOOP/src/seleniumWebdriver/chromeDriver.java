package seleniumWebdriver;

public class chromeDriver implements WebDriver {

	@Override
	public void sendkeys() {
		System.out.println("chromderiver sendkeyss");
		
	}

	@Override
	public String findelemenn() {
		System.out.println("chromderiver findelement");
		return null;
	}

	@Override
	public void click() {
		System.out.println("chromderiver click");
		
	}

	@Override
	public void deselect() {
		System.out.println("chromderiver deselct");
		
	}

}
