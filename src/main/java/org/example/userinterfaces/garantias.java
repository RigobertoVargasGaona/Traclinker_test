package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class garantias extends PageObject {
    public static final Target INPUT_SERIAL =
            Target.the("Campo serial de producto")
                    .located(By.id("serial"));

    public static final Target INPUT_CLIENTE =
            Target.the("Campo nombre de cliente")
                    .located(By.id("customer"));
    public static final Target INPUT_TELEFONO =
            Target.the("Campo de teléfono")
                    .located(By.id("phone"));
    public static final Target INPUT_DIRECCCION =
            Target.the("Campo de DIRECCION")
                    .located(By.id("address"));

    public static final Target INPUT_CIUDAD =
            Target.the("Campo de nombre de la cuidad")
                    .located(By.id("cities-menu"));

    public static Target BTN_ITEM_CIUDAD(String ciudad) {
        return Target.the("Seleccionar ciudad " + ciudad)
                .located(By.xpath("//button[contains(@id,'cities-menu')]//span[contains(text(),'" + ciudad + "')]"));
    }

    public static final Target INPUT_DESCRIPCION =
            Target.the("Campo de la descripción")
                    .located(By.id("description"));

    public static final Target INPUT_ADJUNTOS =
            Target.the("Link de campetadas de datos adjuntos")
                    .located(By.id("link_attachments"));

    public static final Target BTN_GARANTIAS =
            Target.the("Boton para ingreso al modulo de garantías")
                    .located(By.id("warranties-desktop-aside-button"));

    public static final Target BTN_AGREGAR_GARANTIA =
            Target.the("Boton para agregar garantias")
                    .located(By.id("create-button"));

    public static final Target BTN_CREAR =
            Target.the("Boton para crear garantía")
                    .located(By.id("confirm-button"));

    public static final Target MEANSAJE_GARANTIAS =
            Target.the("")
                    .located(By.id(""));

    public static Target BTN_EDITAR_GARANTIA(String id) {
        return Target.the("Botón editar garantía " + id)
                .located(By.xpath("//button[@id='edit-warranty-" + id + "-button']"));
            }
    public static final Target BTN_ABRIR_ESTADO =
            Target.the("Abrir desplegable de estado")
                    .located(By.id("warranty-status-menu"));
    public static Target INPUT_ESTADO(String estado) {
        return Target.the("Seleccionar estado " + estado)
                .located(By.xpath("//button[contains(@id,'warranty-status-menu')]//span[contains(text(),'" + estado + "')]"));
    }
    public static final Target BTN_EDITAR =
            Target.the("Boton editar garantia")
                    .located(By.id("confirm-button"));


}