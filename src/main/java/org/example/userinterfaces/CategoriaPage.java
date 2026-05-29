package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaPage {

    public static final Target BTN_MENU_CATEGORIA =
            Target.the("Botón menú categoría")
                    .located(By.id("menuCategoria"));

    public static final Target BTN_CREAR_CATEGORIA =
            Target.the("Botón crear categoría")
                    .located(By.id("crearCategoria"));

    public static final Target INPUT_NOMBRE_CATEGORIA =
            Target.the("Input nombre categoría")
                    .located(By.id("nombreCategoria"));

    public static final Target BTN_GUARDAR_CATEGORIA =
            Target.the("Botón guardar categoría")
                    .located(By.id("guardarCategoria"));

    public static final Target MENSAJE_CATEGORIA =
            Target.the("Mensaje categoría creada")
                    .located(By.id("mensajeCategoria"));

}