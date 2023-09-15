package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {

	WebDriver driver; 
	
	@Given("Abrir Chrome")
	public void abrir_chrome() {
	    System.out.println("Este paso abre el navegador Chrome");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Georg\\Desktop\\Integracion Continua - EVA 1\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://localhost:3031/Login_BancoPlatinum/Login.jsp");
	}

	@When("ingresa Username {string} y Password {string}")
	public void ingresa_username_y_password(String string, String string2) {
		System.out.println("Este paso ingresa las credenciales de usuario");
		driver.findElement(By.id("txtUser")).sendKeys(string);
		driver.findElement(By.id("txtPwd")).sendKeys(string2);
	}

	@Then("inicia sesion")
	public void inicia_sesion() {
		System.out.println("Este paso inicia sesion con los datos ingresados en el archivo MyTest.feature");
		driver.findElement(By.id("btnLogin")).click();
	}
}
