# language: es
# author: Juan Alvarez

Característica: Crear usuario
  Como administrador del sistema
  quiero poder crear un nuevo usuario
  para gestionar el acceso a la plataforma

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave      |
      | prueba1@gmail.com   | 12345.*    |

  @crearUsuario
  Esquema del escenario: Agregar un usuario correctamente
    Dado que el usuario se encuentra en la página o módulo de usuarios y da clic en el botón de crear usuario
    Cuando se ingresan los datos del usuario
      | rol | nombre | primer_apellido  | segundo_apellido | ciudad | telefono   | correo               | direccion |
      | 1   | Nuevo  | Nuevo            | Nuevo            | 1      | 3012221212 | prueba12@gmail.com | Mi casa   |
    Entonces se debe verificar que el usuario fue creado correctamente

    Ejemplos:
      | rol | nombre | primer_apellido  | segundo_apellido | ciudad | telefono   | correo               | direccion |
      | 1   | Nuevo  | Nuevo            | Nuevo            | 1      | 3012221212 | prueba123@gmail.com | Mi casa   |