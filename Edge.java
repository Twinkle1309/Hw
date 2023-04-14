package web1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\software\\Driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();
        driver.quit();
    }
}
