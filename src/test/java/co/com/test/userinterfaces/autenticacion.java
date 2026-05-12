package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class autenticacion extends PageObject {

    public static final Target INPUT_USUARIO =
            Target.the("campo usuario")
                    .locatedBy("//*[@id='email-input']");

    public static final Target INPUT_CLAVE =
            Target.the("campo clave")
                    .locatedBy("//*[@id='password']");  // verifica el id real

    public static final Target BTN_INICIOSESION =
            Target.the("botón iniciar sesión")
                    .locatedBy("//*[@id='login_button']");  // verifica el id real
}

