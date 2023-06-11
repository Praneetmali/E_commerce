package Fecbook;

public class login {
	
	public static void main(String[]args)
	{
		System.setProperty("Chrome.Driver", null)
		webDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.close();
		
	}

}
