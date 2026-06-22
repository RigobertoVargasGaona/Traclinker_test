package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userinterfaces.PaginaUsuarios;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaUsuarios.MENSAJE_DE_CONFIRMACION;

public class ValidacionEditarUsuario implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionEditarUsuario.class);

    private static final String MENSAJE_ESPERADO = "Usuario editado con éxito";

    public static ValidacionEditarUsuario validacionEditarUsuario() {
        return new ValidacionEditarUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(PaginaUsuarios.MENSAJE_DE_CONFIRMACION, isVisible())
                            .forNoMoreThan(10).seconds()
            );
            String texto = Text.of(MENSAJE_DE_CONFIRMACION).viewedBy(actor).asString();
            logger.info("Texto obtenido: {}", texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("Elemento no encontrado: {}", e.getMessage());
            return false;
        }
    }
}
