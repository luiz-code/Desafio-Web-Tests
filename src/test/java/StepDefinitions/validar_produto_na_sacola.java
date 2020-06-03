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
import java.util.concurrent.TimeUnit;


public class validar_produto_na_sacola
{
    WebDriver driver;
    WebElement produto;
    WebElement Clicar_Produto;
    WebElement Adicionar_Produto;
    WebElement Validar_Produto;

    /* Página do produto é acessada aqui */
    @Dado("^Que usuário acessa lista do produto$")
    public void Acesso_ao_produto() throws Throwable
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.magazineluiza.com.br/");
        driver.manage().window().maximize();

        produto = driver.findElement(By.id("inpHeaderSearch"));
        produto.sendKeys("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6");
        produto =  driver.findElement(By.id("btnHeaderSearch"));
        produto.click();

    }

    /* Produto é selecionado */
    @E("^Seleciona produto específico$")
    public void Seleciona_produto_específico() throws Throwable
    {
        Thread.sleep(5000);
        Clicar_Produto =  driver.findElement(By.xpath("//li[@class='nm-product-item']"));


        /* Se produto é exibido na tela, será clicado */
        if (Clicar_Produto.isDisplayed())
        {
            Clicar_Produto.click();
            Thread.sleep(2000);
        }
        /* Caso contrário, navegador será encerrado */
        else
        {
            driver.quit();
            Assert.assertTrue(false);
        }
    }
    /* Item será adicionado à sacola */
    @Quando("^Usuário selecionar sacola$")
    public void  Seleciona_sacola() throws Throwable
    {
        Adicionar_Produto =  driver.findElement(By.xpath("//span[@class='button__text']"));
        Adicionar_Produto.click();
        Thread.sleep(5000);
    }
    /* Valida se o produto está na sacola */
    @Então("^Vejo produto na sacola$")
    public void Valida_produto_na_sacola() throws Throwable
    {
        Validar_Produto = driver.findElement(By.xpath("//p[@class='BasketItemProduct-info-sku']"));

        /* Se produto é exibido à tela aciona outra condição */
        if(Validar_Produto.isDisplayed())
        {
            /* Verificar se a página contém o texto indicando que o produto foi adicionado a sacola */
            if(driver.getPageSource().contains("Notebook Dell Inspiron i15-3583-M5XP 8ª Geração Intel Core i7 8GB 2TB 15.6\" Windows 10 Preto McAfee -  "))
            {
                Thread.sleep(3000);
                driver.quit();
                Assert.assertTrue(true);
            }

            else
            {
                driver.quit();
                Assert.assertTrue(false);
            }
        }
        else
        {
            driver.quit();
            Assert.assertTrue(false);
        }
    }
}