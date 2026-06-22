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

  @editarProducto
  Esquema del escenario: Editar producto correctamente
    Cuando que el usuario está en la pagina o modulo de productos y hace click en el boton de editar producto se ingresan los datos del producto
      | serial      |
      | 12345678902 |
    Entonces se deberia ver el producto en la lista con el nuevo serial editado

    Ejemplos:
      | serial      |
      | 1234567890A |