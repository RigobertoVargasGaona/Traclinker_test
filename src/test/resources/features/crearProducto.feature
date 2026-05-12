# language: es
# author: EdwinQuenguan

Característica: Crear producto
  Como administrador de sistemas,
  quiero poder agregar un nuevo producto
  para gestionar el inventario.

  Antecedentes:
    Dado que el administrador está autenticado en el sistema
      | campos     | valores               |
      | correo     | juanesyt7@gmail.com |
      | contraseña | &zA#hs5fARmE        |

  @crearProducto
  Esquema del escenario: Agregar un producto correctamente
    Dado que el usuario está en la página o módulo de productos y hace click en agregar producto
    Cuando se ingresan los datos del producto
      | campos           | valores            |
      | orden entrada    | <orden entrada>    |
      | subcategoria     | <subcategoria>     |
      | marca            | <marca>            |
      | modelo           | <modelo>           |
      | serial           | <serial>           |
      | periodo garantia | <periodo garantia> |
    Entonces se debe verificar que el producto con serial "<serial>" se haya creado correctamente
    Entonces el producto debería aparecer en la lista junto con los demás productos

    Ejemplos:
      | orden entrada | categoria    | subcategoria | marca  | modelo                    | serial    | periodo garantia |
      | INP00001      | computadores | portatiles   | Lenovo | Lenovo ThinkPad X1 Carbon | nuevo123  | 24 meses         |