package org.example.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.example.models.CredencialesCrearSubcategoria;
import org.example.userinterfaces.crearSubcategorias;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CrearSubcategoria implements Task{

    private List< CredencialesCrearSubcategoria> credenciales;

    public CrearSubcategoria(List<CredencialesCrearSubcategoria> credenciales) {
        this.credenciales = credenciales;
    }

    public static CrearSubcategoria crearSubcategoria(List<CredencialesCrearSubcategoria>  credenciales) {
        return Instrumented.instanceOf(CrearSubcategoria.class)
                .withProperties(credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String suffix =
                System.currentTimeMillis() + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
        String nombreUnico = credenciales.get(0).getNombre() + suffix;

        actor.attemptsTo(
                Click.on(crearSubcategorias.BTN_SUBCATEGORIA),
                Click.on(crearSubcategorias.BTN_NUEVA_SUBCATEGORIA),
                Click.on(crearSubcategorias.SELECT_CATEGORIA),
                Click.on(crearSubcategorias.OPCION_SELECT_CATEGORIA),
                Click.on(crearSubcategorias.INPUT_NOMBRE),
                Enter.theValue(nombreUnico)
                        .into(crearSubcategorias.INPUT_NOMBRE),
                Click.on(crearSubcategorias.BTN_CREAR)
        );
    }
}