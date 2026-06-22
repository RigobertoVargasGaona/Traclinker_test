package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaPage {
    public static final Target BOTON_CATEGORIAS =
            Target.the("boton de categorias")
                    .located(By.id("categories-desktop-aside-button"));

    public static final Target BOTON_CREAR_CATEGORIA =
            Target.the("boton de crear categoria")
                .located(By.id("create-button"));

    public static final Target BTN_MENU_CATEGORIA =
            Target.the("Botón menú categoría")
                    .located(By.id("menuCategoria"));

    public static final Target BTN_CREAR_CATEGORIA =
            Target.the("Botón crear categoría")
                    .located(By.id("crearCategoria"));

    public static final Target INPUT_NOMBRE_CATEGORIA =
            Target.the("Input nombre categoría")
                    .located(By.id("category_name"));

    public static final Target INPUT_DESCRIPCION_CATEGORIA =
            Target.the("Input descripcion categoría")
                    .located(By.id("category_description"));

    public static final Target BTN_GUARDAR_CATEGORIA =
            Target.the("Botón guardar categoría")
                    .located(By.id("confirm-button"));

    public static final Target INPUT_EDITAR_NOMBRE_CATEGORIA =
            Target.the("Input nombre categoría")
                    .located(By.id("name"));

    public static final Target BOTON_EDITAR_CATEGORIA =
            Target.the("Botón editar categoría")
                    .located(By.id("edit-category-1-button"));

    public static final Target MENSAJE_CATEGORIA =
            Target.the("Mensaje categoría creada")
                    .located(By.id("confirm-title"));

}