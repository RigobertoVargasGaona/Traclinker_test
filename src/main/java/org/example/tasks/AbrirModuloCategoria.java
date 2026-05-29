package org.example.tasks;

import org.example.userinterfaces.CategoriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloCategoria implements Task {

    public static AbrirModuloCategoria elModulo() {
        return Tasks.instrumented(AbrirModuloCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(CategoriaPage.BTN_MENU_CATEGORIA),
                Click.on(CategoriaPage.BTN_CREAR_CATEGORIA)

        );

    }

}