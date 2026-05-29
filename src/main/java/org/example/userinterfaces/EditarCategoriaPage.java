package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarCategoriaPage {

    public static final Target BTN_EDITAR_CATEGORIA =
            Target.the("Botón editar categoría")
                    .located(By.id("editarCategoria"));

    public static final Target INPUT_EDITAR_CATEGORIA =
            Target.the("Input editar categoría")
                    .located(By.id("editarNombreCategoria"));

    public static final Target BTN_ACTUALIZAR_CATEGORIA =
            Target.the("Botón actualizar categoría")
                    .located(By.id("actualizarCategoria"));

}