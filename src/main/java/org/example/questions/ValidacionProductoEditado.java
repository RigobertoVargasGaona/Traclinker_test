package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaProductos.MENSAJE_DE_CONFIRMACION;

public class ValidacionProductoEditado implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionProductoEditado.class);

    private static final String MENSAJE_ESPERADO = "Producto Editado Correctamente";

    public static ValidacionProductoEditado validarProductoEditado() {
        return new ValidacionProductoEditado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(MENSAJE_DE_CONFIRMACION, isVisible())
                            .forNoMoreThan(2).seconds()
            );
            String texto = Text.of(MENSAJE_DE_CONFIRMACION).viewedBy(actor).asString().trim();
            logger.info("Texto obtenido: {}", texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("Elemento no encontrado: {}", e.getMessage());
            return false;
        }
    }

}
