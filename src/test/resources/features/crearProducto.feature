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
    Y está en la página de productos y hace clic en el botón Agregar producto

  @crearProducto
  Esquema del escenario: Agregar un producto correctamente
    Cuando se ingresan los datos del producto
      | campos           | valores                     |
      | orden entrada    | <INP00001 >                 |
      | subcategoria     | <portatiles>                |
      | marca            | <Lenovo>                    |
      | modelo           | <Lenovo ThinkPad X1 Carbon> |
      | serie            | <serial>                    |
      | periode garantia | <24 meses>                  |
    Entonces se debe verificar que el producto "<brand> <subcategory>" se haya creado correctamente
           Y  el producto debería aparecer en la lista junto con los demás productos

    Ejemplos:
      | orden entrada | categoria   | subcategoria | marca  | modelo                    | serie  | periodo garantia |
      | INP00001      | computadores| portatiles   | Lenovo | Lenovo ThinkPad X1 Carbon | nuevo  | 24 meses         |