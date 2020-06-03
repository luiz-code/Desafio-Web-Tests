package StepDefinitions;


import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class validar_sacola_vazia
{
    WebDriver driver;
    WebElement produto;

    /* Navegador é inicializado aqui */
    @Dado("^Que o usuário acessa o website$")
    public void Abrir_navegador()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");
        driver.manage().window().maximize();

    }
    /* Usuário seleciona sacola vazia */
    @Quando("^Usuário seleciona sacola sem item$")
    public void Seleciona_sacola() throws Throwable
    {
        produto =  driver.findElement(By.xpath("//a[@class='container-checkout']"));
        produto.click();
    }
    /* Página da sacola sem itens é exibida */
    @Então("^Vejo sacola vazia$")
    public void Sacola_sem_item() throws Throwable
    {
        Thread.sleep(5000);
        if(driver.getPageSource().contains("Sua sacola está vazia"))
        {
            driver.quit();
            Assert.assertTrue(true);
        }

        else
        {
            driver.quit();
            Assert.assertTrue(false);
        }

    }
}
