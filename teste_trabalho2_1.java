package testesistema;
import junit.framework.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class teste_trabalho2_1 {


static WebDriver driver = null;

private static String namePaginaPrincipal ;

@BeforeAll
public static void setUp() {
     System.setProperty("webdriver.chrome.driver", 
                "C:\\chromedriver_win32\\chromedriver.exe");
        
    
     driver = new ChromeDriver();

    driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");

    namePaginaPrincipal = driver.getWindowHandle();
}




	@Test
    public void testTituloPagina(){
    	
    	driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");      
    	String titulo ="Trabalho 2-1"; 
        
    	
    	Assert.assertEquals(titulo,driver.getTitle());
    }

	
	@Test
    public void teste_nome_em_branco(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("");
         campoSexo.sendKeys("m");
         campoEndereco.sendKeys("Rua Bibiano");
         campoidade.sendKeys("20");
         botaoSalvar.click();
        WebElement campoResultado = driver.findElement(By.id("resultado"));
         Assert.assertEquals(campoResultado.getText(),"Preencha o campo nome");
    }
	@Test
    public void teste_endereco_em_branco(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("joão");
         campoSexo.sendKeys("m");
         campoEndereco.sendKeys("");
         campoidade.sendKeys("20");
         botaoSalvar.click();
        WebElement campoResultado = driver.findElement(By.id("resultado"));
         Assert.assertEquals(campoResultado.getText(),"Preencha o campo endereco");
    }
	@Test
    public void teste_sexo_em_branco(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("joão");
         campoSexo.sendKeys("");
         campoEndereco.sendKeys("Rua Bibiano");
         campoidade.sendKeys("20");
         botaoSalvar.click();
        WebElement campoResultado = driver.findElement(By.id("resultado"));
         Assert.assertEquals(campoResultado.getText(),"Selecione um valor para o campo sexo");
    }
	@Test
    public void teste_idade_em_branco(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("joão");
         campoSexo.sendKeys("m");
         campoEndereco.sendKeys("Rua Bibiano");
         campoidade.sendKeys("");
         botaoSalvar.click();
        WebElement campoResultado = driver.findElement(By.id("resultado"));
         Assert.assertEquals(campoResultado.getText(),"Preencha o campo idade, somente com numeros");
    }
	@Test
    public void teste_idade_invalida(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("joão");
         campoSexo.sendKeys("m");
         campoEndereco.sendKeys("Rua Bibiano");
         campoidade.sendKeys("-5");
         botaoSalvar.click();
        WebElement campoResultado = driver.findElement(By.id("resultado"));
         Assert.assertEquals(campoResultado.getText(),"Preencha o campo idade com valores acima de 0");
    }
	@Test
    public void teste_alerta(){
        driver.get("C:\\xampp\\htdocs\\trabalho2-1.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoidade = driver.findElement(By.id("idade"));
        WebElement botaoSalvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("joão");
         campoSexo.sendKeys("m");
         campoEndereco.sendKeys("Rua Bibiano");
         campoidade.sendKeys("5");
         botaoSalvar.click();
         Alert alerta = driver.switchTo().alert();
         Assert.assertTrue(alerta.getText().equals("Cadastro realizado com sucesso"));
         alerta.accept();
    }
	
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }


}