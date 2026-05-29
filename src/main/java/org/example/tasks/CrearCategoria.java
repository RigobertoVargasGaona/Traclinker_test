package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.userinterfaces.CategoriaPage;

public class CrearCategoria implements Task {

    private String nombreCategoria;

    public CrearCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public static CrearCategoria conNombre(String nombreCategoria) {
        return Tasks.instrumented(CrearCategoria.class, nombreCategoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(nombreCategoria)
                        .into(CategoriaPage.INPUT_NOMBRE_CATEGORIA),

                Click.on(CategoriaPage.BTN_GUARDAR_CATEGORIA)

        );

    }

}