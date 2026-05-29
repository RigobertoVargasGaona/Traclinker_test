# language: es
# author: EdwinQuenguan

Característica: Editar categorías

  Antecedentes:
    Dado que el usuario está autenticado en el sistema
    Cuando el usuario ingresa credenciales válidas
      | usuario              | clave        |
      | juanesyt70@gmail.com | 6zAMhs5fARnE |

  @editarCategoria
  Esquema del escenario: Editar una categoría correctamente

    Dado que el usuario está en el módulo de categorías y selecciona una categoría para editar

    Cuando se modifican los datos de la categoría
      | campos             | valores               |
      | nombre categoría   | <nuevoNombreCategoria> |

    Entonces el sistema confirma que la categoría fue editada correctamente

    Y la categoría actualizada debería aparecer en la lista de categorías

    Ejemplos:
      | nuevoNombreCategoria |
      | Tecnología Avanzada  |