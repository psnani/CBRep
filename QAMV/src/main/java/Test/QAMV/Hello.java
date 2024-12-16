package Test.QAMV;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello {

	public static void main(String[] args) {
 
        WebDriver driver = new ChromeDriver();
 
        String url = "https://www.lambdatest.com/";
 
        driver.get(url);
        driver.manage().window().maximize();
 
        WebElement login = driver.findElement(By.linkText("Login"));
        System.out.println("Clicking on the login element in the main page");
        login.click();
 
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
 
        email.clear();
        System.out.println("Entering the email");
        email.sendKeys("your_email");
 
        password.clear();
        System.out.println("entering the password");
        password.sendKeys("your_password");
 
        System.out.println("Clicking login button");
        loginButton.click();
 
        System.out.println("User logged in successfully");
 
        driver.quit();
    }
}