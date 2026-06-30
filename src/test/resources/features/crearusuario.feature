# language: es
# author: Juan Alvarez

Característica: Crear usuario
  Como administrador del sistema
  quiero poder crear un nuevo usuario
  para gestionar el acceso a la plataforma

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave |
      | juanesyt7@gmail.com  | 12345 |

  @crearUsuario
  Esquema del escenario: Agregar un usuario correctamente
    Cuando el usuario se encuentra en la página o módulo de usuarios y da clic en el botón de crear usuario se ingresan los datos del usuario
      | rol | nombre | primer_apellido  | segundo_apellido | ciudad | telefono   | correo               | direccion |
      | 1   | Nuevo  | Nuevo            | Nuevo            | 1      | 3012221212 | prue110121@gmail.com | Mi casa   |
    Entonces se debe verificar que el usuario fue creado correctamente

    Ejemplos:
      | rol | nombre | primer_apellido  | segundo_apellido | ciudad | telefono   | correo               | direccion |
      | 1   | Nuevo  | Nuevo            | Nuevo            | 1      | 3012221212 | prueba0121@gmail.com | Mi casa   |