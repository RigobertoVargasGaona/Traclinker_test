package org.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.example.userinterfaces.PaginaUsuarios.MENSAJE_DE_CONFIRMACION;

public class ValidacionCrearUsuario implements Question<Boolean> {
    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionCrearUsuario.class);

    private static final String MENSAJE_ESPERADO = "Usuario creado con éxito!";

    public static ValidacionCrearUsuario validacionCrearUsuario() {
        return new ValidacionCrearUsuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_DE_CONFIRMACION).viewedBy(actor).asString().trim();
            logger.info("Texto obtenido: {}", texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("Elemento no encontrado: {}", e.getMessage());
            return false;
        }
    }
}
