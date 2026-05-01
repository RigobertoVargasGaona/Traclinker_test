# language: es
# author: JuanAlvarez

Característica: Agregar usuario
  Como administrador del sistema
  quiero poder agregar un nuevo usuario
  para gestionar el acceso a la plataforma

  Antecedentes:
    Dado que el administrador está autenticado en el sistema
      | campo      | valores             |
      | correo     | juanesyt7@gmail.com |
      | contraseña | &zA#hs5fARmE        |
    Y está en la página de usuarios y hace clic en el botón Agregar usuario

  @crearUsuario
  Esquema del escenario: Agregar un usuario correctamente
    Cuando se ingresan los datos del usuario
      | campos            | valores           |
      | rol              | <admin>            |
      | nombre           | <Miguel>           |
      | primer apellido  | <Prueba >          |
      | segundo apellido | <Prueba >          |
      | ciudad           | Medellin           |
      | numero telefono  | 300300300          |
      | correo           | prueba@prueba.com  |
      | direccion        | KR 00 CL 000       |
    Y se hace clic en "Crear"
    Entonces se debe verificar que el usuario "<first_name> <last_name>" fue creado correctamente
    Y el usuario debería aparecer en la lista con el rol "<role>"

    Ejemplos:
      | nombre     | primer apellido | segundo apellido | rol   | status |
      | Albeiro    | Ramos           | Villalba         | Admin | activo |
      | Juan       | Pérez           | Garcia           | Admin | activo |
      | Miguel     | Prueba          | Prueba           | Admin | activo |