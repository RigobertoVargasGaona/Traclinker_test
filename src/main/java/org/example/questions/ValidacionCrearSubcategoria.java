package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.userinterfaces.PaginaProductos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.CategoriaPage.MENSAJE_CATEGORIA;
import static org.example.userinterfaces.crearSubcategorias.MENSAJE_DE_CONFIRMACION;

public class ValidacionCrearSubcategoria implements Question<Boolean>{

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionCrearSubcategoria.class);

    private static final String MENSAJE_ESPERADO = "Subcategoria creada con éxito!";

    public static ValidacionCrearSubcategoria validarCrearSubcategoria() {
        return new ValidacionCrearSubcategoria();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(MENSAJE_CATEGORIA, isVisible())
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