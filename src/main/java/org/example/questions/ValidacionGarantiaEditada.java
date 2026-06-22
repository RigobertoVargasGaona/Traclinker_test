package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static org.example.userinterfaces.garantias.MENSAJE_EDITAR_GARANTIA;
import static org.example.userinterfaces.garantias.MENSAJE_GARANTIAS;

public class ValidacionGarantiaEditada implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionGarantiaEditada.class);

    private static final String MENSAJE_ESPERADO = "¡Garantía actualizada!";

    public static ValidacionGarantiaEditada validacionGarantiaEditada(){
        return new ValidacionGarantiaEditada();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(MENSAJE_EDITAR_GARANTIA, isVisible())
                            .forNoMoreThan(2).seconds()
            );
            String texto = Text.of(MENSAJE_EDITAR_GARANTIA).viewedBy(actor).asString();
            logger.info("Texto obtenido: {}", texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("Elemento no encontrado: {}", e.getMessage());
            return false;
        }
    }

}