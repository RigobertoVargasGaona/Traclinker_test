# language: es
# author: EdwinQuenguan

Característica: Crear producto
  Como administrador de sistemas,
  quiero poder agregar un nuevo producto
  para gestionar el inventario.

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave      |
      | prueba1@gmail.com   | 12345.*    |

  @crearProducto
  Esquema del escenario: Agregar un producto correctamente
    Cuando el usuario está en la página o módulo de productos y hace click en agregar producto se ingresan los datos del producto que se va a agregar
      | orden_de_entrada | subcategoria | marca | modelo | serial         | periodo_de_garantia |
      | 1                | 1            | 1     |  1     | NUEVO12121123  |  1                  |
    Entonces se debe verificar que el producto se haya creado correctamente

    Ejemplos:
      | orden entrada | categoria    | subcategoria | marca  | modelo                    | serial    | periodo garantia |
      | INP00001      | computadores | portatiles   | Lenovo | Lenovo ThinkPad X1 Carbon | nuevo123  | 24 meses         |