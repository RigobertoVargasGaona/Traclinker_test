package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.CategoriaPage.MENSAJE_CATEGORIA;

public class ValidacionCategoria implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionCategoria.class);

    private static final String MENSAJE_ESPERADO =
            "Categoría creada correctamente";

    public static ValidacionCategoria validacionCategoria() {
        return new ValidacionCategoria();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            actor.attemptsTo(
                    WaitUntil.the(MENSAJE_CATEGORIA, isVisible())
                            .forNoMoreThan(3).seconds()
            );

            String texto = Text.of(MENSAJE_CATEGORIA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto obtenido: {}", texto);

            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);

        } catch (Exception e) {

            logger.error("Elemento no encontrado: {}", e.getMessage());

            return false;
        }

    }

}