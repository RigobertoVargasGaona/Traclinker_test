package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductos extends PageObject {
    public static final Target BOTON_CREAR_PRODUCTO = Target.the("Boton para crear producto")
            .located(By.id("create-button"));

    public static  final Target BOTON_MODULO_PRODUCTOS = Target.the("boton para ir al modulo de productos")
            .located(By.id("products-desktop-aside-button"));

    public static final Target BOTON_EDITAR_PRODUCTO = Target.the("boton para editar producto")
            .located(By.id("edit-product-1-button"));

    public static final Target CAMPO_SERIAL_EN_LA_TABLA = Target.the("celda de la tabla productos donde esta el serial")
            .located(By.id("product_serial-cell"));

    public static final Target MENU_ORDENES_DE_ENTRADA = Target.the("menu de ordenes de entrada")
            .located(By.id("input-orders-menu"));

    public static final Target OPCION_MENU_ORDENES_DE_ENTRADA = Target.the("opcion dentro del menu de ordenes de entrada")
            .located(By.id("input-orders-menu-1-option"));

    public static final Target MENU_SUBCATEGORIAS = Target.the("menu de subcategorias")
            .located(By.id("subcategories-menu"));

    public static final Target OPCION_MENU_SUBCATEGORIAS = Target.the("opcion dentro del menu de subcategorias")
            .located(By.id("subcategories-menu-1-option"));

    public static final Target MENU_MARCAS = Target.the("menu de marcas")
            .located(By.id("brands-menu"));

    public static final Target OPCION_MENU_MARCAS = Target.the("opcion dentro del menu de marcas")
            .located(By.id("brands-menu-25-option"));

    public static final Target MENU_MODELOS = Target.the("menu de modelos")
            .located(By.id("models-menu"));

    public static final Target OPCION_MENU_MODELOS = Target.the("opcion dentro del menu de modelos")
            .located(By.id("models-menu-23-option"));

    public static final Target CAMPO_SERIAL = Target.the("campo para el serial del producto")
            .located(By.id("product_serial"));

    public static final Target CAMPO_SERIALES = Target.the("campo de seriales que sale en el formulario de agregar producto")
            .located(By.id("product_serials"));

    public static final Target MENU_TIEMPOS_DE_GARANTIA = Target.the("menu de tiempos de garantia")
            .located(By.id("warranty-times-menu"));

    public static final Target OPCION_MENU_TIEMPOS_DE_GARANTIA = Target.the("opcion dentro del menu de tiempos de garantia")
            .located(By.id("warranty-times-menu-3-option"));

    public static final Target BOTON_CONFIRMAR = Target.the("boton para confirmar")
            .located(By.id("confirm-button"));

    public static final Target MENSAJE_DE_CONFIRMACION = Target.the("texto de confimacion que sale en una modal")
            .located(By.id(("confirm-title")));
}
