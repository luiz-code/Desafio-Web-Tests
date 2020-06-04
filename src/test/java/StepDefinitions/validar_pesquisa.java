package StepDefinitions;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class validar_pesquisa
{

    WebDriver driver;
    WebElement nome;
    WebElement código;
    WebElement pesquisar_código;
    WebElement retorno_mensagem;
    String mensagem;
    String mensagem_esperada;
    WebElement pesquisar_nome;

    /* Navegador é inicializado aqui */
    @Dado("^Que usuário acessa website$")
    public void Abrir_navegador() throws Throwable
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    /* É realizada pesquisa com nome do produto não existente */
    @Quando("^Usuario pesquisa produto inserindo nome incorreto$")
    public void Inserir_nome_incorreto() throws Throwable
    {
        nome =  driver.findElement(By.id("inpHeaderSearch"));
        nome.sendKeys("hedghfkglç");
        pesquisar_nome =  driver.findElement(By.id("btnHeaderSearch"));
        pesquisar_nome.click();
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
    /* É realizada pesquisa com nome existente */
    @Quando("^Usuário pesquisa produto inserindo nome completo$")
    public void Pesquisa_nome_produto() throws Throwable
    {
        Thread.sleep(2000);
        nome =  driver.findElement(By.id("inpHeaderSearch"));
        nome.sendKeys("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6");
        pesquisar_nome =  driver.findElement(By.id("btnHeaderSearch"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(pesquisar_nome));
        pesquisar_nome.click();
    }

    /* Página do produto é acessada */
    @Então("^Vejo usuário acessar página do produto$")
    public void Acessa_página_do_produto() throws Throwable
    {
        Thread.sleep(5000);
        if(driver.getPageSource().contains("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6"))
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
    /* É realizada pesquisa com código existente */
    @Quando("^Usuário pesquisa produto inserindo código correto$")
    public void Pesquisa_código_produto() throws Throwable
    {
        Thread.sleep(2000);
        código =  driver.findElement(By.id("inpHeaderSearch"));
        código.sendKeys("had96dk051");
        pesquisar_código =  driver.findElement(By.id("btnHeaderSearch"));
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(pesquisar_código));
        pesquisar_código.click();
    }

    /* Página do produto é acessada */
    @Então("^Vejo usuário acessar também a página do produto$")
    public void Novo_acesso_página_do_produto() throws Throwable
    {
        if(driver.getPageSource().contains("had96dk051"))
        {
            Thread.sleep(2000);
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