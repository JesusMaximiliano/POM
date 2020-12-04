package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends Base {
    private Base base;

    public Page(WebDriver driver) {
        base=new Base(this.driver);
    }

    By user=By.id("login_usuario");
    By pwd=By.id("login_contraseña");
    By ingresar=By.id("btn");
    By tituloObtenido=By.partialLinkText("Cerrar");

    public void SingIn() {
        if (isDisplayed(user)){
            type("standard_user",user);
            type("secret_sauce",pwd);
            Click(ingresar);
        }else{
            System.out.println("UserName textbox was not present");
        }

    }

    public boolean isHomeDisplayed(){
        return isDisplayed(tituloObtenido);
    }
}

