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

public class validar_pesquisa
{

    WebDriver driver;
    WebElement nome;
    WebElement retorno_mensagem;
    String mensagem;
    String mensagem_esperada;
    WebElement pesquisar;

    /* Navegador é inicializado aqui */
    @Dado("^Que usuario acessa website$")
    public void Abrir_navegador() throws Throwable
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");
        driver.manage().window().maximize();
    }
    /* Condição para quando não existe produto na busca */
    @Quando("^Usuario pesquisa produto inserindo dado incorreto$")
    public void Inserir_dado_incorreto() throws Throwable
    {
        nome =  driver.findElement(By.id("inpHeaderSearch"));
        nome =  driver.findElement(By.id("inpHeaderSearch"));
        nome.sendKeys("hedghfkglç");
        pesquisar =  driver.findElement(By.id("btnHeaderSearch"));
        pesquisar.click();
        Thread.sleep(5000);
    }
    /* Validação da mensagem de erro da pesquisa do produto */
    @Então("^Vejo mensagem de erro$")
    public void Valida_mensagem_de_erro() throws Throwable
    {
        retorno_mensagem = driver.findElement(By.xpath("//div[@class='nm-not-found-message1']"));
        mensagem = retorno_mensagem.getText();
        mensagem_esperada = ("Sua busca por hedghfkglç não encontrou resultado algum :(");

        if (mensagem.equals(mensagem_esperada))
        {
            driver.navigate().back();
            Assert.assertTrue(true);
        }

        else
        {
            driver.quit();
            Assert.assertTrue(false);
        }

    }
    /* Condição para quando existe produto na busca */
    @Quando("^Usuario pesquisa produto inserindo dado correto$")
    public void Usuario_pesquisa_produto() throws Throwable
    {
        Thread.sleep(5000);
        nome =  driver.findElement(By.id("inpHeaderSearch"));
        nome.sendKeys("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6");
        pesquisar =  driver.findElement(By.id("btnHeaderSearch"));
        pesquisar.click();
        Thread.sleep(2000);
    }
    /* Página do produto é acessada */
    @Então("^Vejo usuario acessar página do produto$")
    public void Acessa_página_do_produto() throws Throwable
    {
        if(driver.getPageSource().contains("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6"))
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