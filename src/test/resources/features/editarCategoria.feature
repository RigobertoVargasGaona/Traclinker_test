# language: es
# author: EdwinQuenguan

Característica: Editar categorías

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario           | clave  |
      | prueba1@gmail.com | 12345.*|

  @editarCategoria
  Esquema del escenario: Editar una categoría correctamente
    Cuando el usuario está en el módulo de categorías y selecciona una categoría para editar y se modifican los datos de la categoría
      | nombreCategoría   |
      | EDITADA22412      |

    Entonces el sistema confirma que la categoría fue editada correctamente$

    Ejemplos:
      | nuevoNombreCategoria |
      | Tecnología Avanzada  |