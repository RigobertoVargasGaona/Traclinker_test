package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.models.EditarUsuarioModelo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.PaginaUsuarios.*;

public class EditarUsuario implements Task {
    private List<EditarUsuarioModelo> datos;

    public EditarUsuario(List<EditarUsuarioModelo> datos) {
        this.datos = datos;
    }

    public static EditarUsuario editarUsuario(List<EditarUsuarioModelo> datos) {
        return new EditarUsuario(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String suffix =
                System.currentTimeMillis() + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
        String nombreUnico = datos.get(0).getNombre() + suffix;
        String correoUnico = datos.get(0).getCorreo().replace("@", suffix + "@");
        String telefonoUnico = datos.get(0).getTelefono() + suffix;

        actor.attemptsTo(
            WaitUntil.the(BOTON_MODULO_USUARIOS, isVisible())
                    .forNoMoreThan(1).seconds(),
            Click.on(BOTON_MODULO_USUARIOS),

            WaitUntil.the(BOTON_PARA_EDITAR_USUARIO, isVisible())
                    .forNoMoreThan(15).seconds(),
            Click.on(BOTON_PARA_EDITAR_USUARIO),

            Click.on(MENU_ROLES),
            Click.on(OPCION_MENU_ROLES),

            Click.on(CAMPO_NOMBRE),
            Enter.theValue(nombreUnico).into(CAMPO_NOMBRE),

            Click.on(CAMPO_PRIMER_APELLIDO),
            Enter.theValue(datos.get(0).getPrimerApellido()).into(CAMPO_PRIMER_APELLIDO),

            Click.on(CAMPO_SEGUNDO_APELLIDO),
            Enter.theValue(datos.get(0).getSegundoApellido()).into(CAMPO_SEGUNDO_APELLIDO),

            Click.on(MENU_CIUDADES),
            Click.on(OPCION_MENU_CIUDADES),

            Click.on(CAMPO_TELEFONO),
            Enter.theValue(telefonoUnico).into(CAMPO_TELEFONO),

            Click.on(CAMPO_EMAIL),
            Enter.theValue(correoUnico).into(CAMPO_EMAIL),

            Click.on(CAMPO_DIRECCION),
            Enter.theValue(datos.get(0).getDireccion()).into(CAMPO_DIRECCION),

            Click.on(BOTON_CONFIRMAR)
        );
    }
}
