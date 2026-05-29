package org.example.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.example.models.EditarGarantiaModelo;

import java.util.List;


import static org.example.userinterfaces.garantias.*;

public class EditarGarantia implements Task {


    private final List<EditarGarantiaModelo> registro;

    public EditarGarantia(List<EditarGarantiaModelo> registro) {
        this.registro = registro;
    }

    public static EditarGarantia data(List<EditarGarantiaModelo> registro) {
        return Instrumented.instanceOf(EditarGarantia.class)
                .withProperties(registro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(BTN_GARANTIAS));
            Thread.sleep(2000);

            actor.attemptsTo(Click.on(BTN_EDITAR_GARANTIA(registro.get(0).getId())));
            Thread.sleep(1500);

            actor.attemptsTo(Click.on(BTN_ABRIR_ESTADO));
            Thread.sleep(500);

            actor.attemptsTo(Click.on(INPUT_ESTADO(registro.get(0).getEstado())));
            Thread.sleep(500);

            actor.attemptsTo(Click.on(BTN_EDITAR));

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}