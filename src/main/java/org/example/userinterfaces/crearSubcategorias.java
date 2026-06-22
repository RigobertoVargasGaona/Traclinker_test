package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class crearSubcategorias extends PageObject {

    public static final Target BTN_SUBCATEGORIA =
            Target.the("Botón  subcategoría")
                    .located(By.id("subcategories-desktop-aside-button"));


    public static final Target BTN_NUEVA_SUBCATEGORIA =
            Target.the("Botón nueva subcategoría")
                    .located(By.id("create-button"));

    public static final Target SELECT_CATEGORIA =
            Target.the("Selector categoría")
                    .located(By.id("categories-menu"));

    public static final Target OPCION_SELECT_CATEGORIA =
            Target.the("Selector categoría")
                    .located(By.id("categories-menu-2-option"));

    public static final Target INPUT_NOMBRE =
            Target.the("Campo nombre")
                    .located(By.id("subcategory-name"));

    public static final Target BTN_CREAR =
            Target.the("Botón crear")
                    .located(By.id("confirm-button"));

    public static final Target MENSAJE_DE_CONFIRMACION =
            Target.the("Mensaje de confirmación")
                    .located(By.id("confirm-title"));
}