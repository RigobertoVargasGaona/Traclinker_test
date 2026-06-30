# language: es
# author: EdwinQuenguan

Característica: Crear Subcategoria
  Como administrador de sistemas,
  quiero poder agregar una nueva subcategoria
  para poder crear su respectiva categoria

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave |
      | juanesyt7@gmail.com  | 12345 |

  @crearSubcategorias
  Esquema del escenario: Agregar una subcategoria correctamente
    Cuando se ingresan los datos de la subcategoria
      | categoria     | nombre      |
      | nueva         | prue1111211 |

    Entonces el sistema confirma que la subcategoria fue creada correctamente

    Ejemplos:
      | categoria | nombre |
      | nueva     | prueba |