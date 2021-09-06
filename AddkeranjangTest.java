// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddkeranjangTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addkeranjang() {
    driver.get("https://shopee.co.id/");
    driver.manage().window().setSize(new Dimension(1382, 824));
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".image-carousel__item:nth-child(2) .home-category-list__category-grid:nth-child(1) .\\_25_r8I > .\\_3K5s_h")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,1174.4000244140625)");
    driver.findElement(By.cssSelector(".col-xs-2-4:nth-child(4) .\\_1jowzv img")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,195.1999969482422)");
    js.executeScript("window.scrollTo(0,296)");
    driver.findElement(By.cssSelector(".\\_1D3GfE")).click();
    driver.findElement(By.cssSelector(".product-variation:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".icon-plus-sign > polygon"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".\\_2KdYzP:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".\\_2KdYzP:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn > span")).click();
    driver.close();
  }
}
