# language: es
# author: EdwinQuenguan


Característica: Gestión de categorías

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave |
      | juanesyt@gmail.com  | 12345 |
  @crearCategoria
  Esquema del escenario: Agregar una categoría correctamente
  Cuando el usuario está en el módulo de categorías y hace clic en crear categoría y se ingresan los datos de la categoría
  | nombreCategoria |
  | 12345       |
  Entonces el sistema confirma que la categoría fue creada correctamente

  Ejemplos:
  | categoria   |
  | Avionessss  |