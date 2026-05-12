# language: es
# author: Juan Alvarez

Característica: Agregar usuario
  Como administrador del sistema
  quiero poder agregar un nuevo usuario
  para gestionar el acceso a la plataforma

  Antecedentes:
    Dado que el administrador está autenticado en el sistema
      | campo      | valores             |
      | correo     | juanesyt7@gmail.com |
      | contraseña | &zA#hs5fARmE        |

  @crearUsuario
  Esquema del escenario: Agregar un usuario correctamente
    Dado que el usuario se encuentra en la página o módulo de usuarios
    Cuando se ingresan los datos del usuario
      | campos           | valores            |
      | rol              | <rol>              |
      | nombre           | <nombre>           |
      | primer apellido  | <primer apellido>  |
      | segundo apellido | <segundo apellido> |
      | ciudad           | <ciudad>           |
      | numero telefono  | <numero telefono>  |
      | correo           | <correo>           |
      | direccion        | <direccion>        |
    Entonces debe hacer clic en el botón que dice "Crear"
    Entonces se debe verificar que el usuario con el nombre "<nombre> <primer apellido>" fue creado correctamente
    Entonces el usuario debería aparecer en la lista con el nombre "<nombre> <primer apellido> <segundo apellido>"

    Ejemplos:

    Ejemplos:
      | nombre     | primer apellido | segundo apellido | rol   | estado |
      | Albeiro    | Ramos           | Villalba         | Admin | activo |
      | Juan       | Pérez           | Garcia           | Admin | activo |
      | Miguel     | Prueba          | Prueba           | Admin | activo |