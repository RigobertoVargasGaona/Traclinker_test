package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.example.models.CategoriaData;
import org.example.models.EditarCategoriaData;
import org.example.userinterfaces.CategoriaPage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class EditarCategoria implements Task {
    private List<EditarCategoriaData> datos;

    public EditarCategoria(List<EditarCategoriaData> datos) {
        this.datos = datos;
    }

    public static EditarCategoria editarCategoria(List<EditarCategoriaData> datos) {
        return new EditarCategoria(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String suffix =
                System.currentTimeMillis() + String.format("%03d", ThreadLocalRandom.current().nextInt(1000));
        String nombreUnico = datos.get(0).getNombreCategoria() + suffix;

        actor.attemptsTo(
                Click.on(CategoriaPage.BOTON_CATEGORIAS),

                Click.on(CategoriaPage.BOTON_EDITAR_CATEGORIA),

                Click.on(CategoriaPage.INPUT_EDITAR_NOMBRE_CATEGORIA),
                Enter.theValue(nombreUnico)
                        .into(CategoriaPage.INPUT_EDITAR_NOMBRE_CATEGORIA),

                Click.on(CategoriaPage.BTN_GUARDAR_CATEGORIA)

        );

    }
}
