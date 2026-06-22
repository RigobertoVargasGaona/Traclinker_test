package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userinterfaces.PerfilPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PerfilPage.MENSAJE_CONFIRMACION;

public class ValidacionEditarPerfil implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionEditarPerfil.class);

    private static final String MENSAJE_ESPERADO = "Your profile has been updated!";

    public static ValidacionEditarPerfil validacionEditarPerfil() {
        return new ValidacionEditarPerfil();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(PerfilPage.MENSAJE_CONFIRMACION, isVisible())
                            .forNoMoreThan(10).seconds()
            );
            String texto = Text.of(MENSAJE_CONFIRMACION).viewedBy(actor).asString();
            logger.info("Texto obtenido: {}", texto);
            return texto.toLowerCase().contains("updated")
                    || texto.toLowerCase().contains("profile");
        } catch (Exception e) {
            logger.error("Elemento no encontrado o mensaje inesperado: {}", e.getMessage());
            return false;
        }
    }
}
