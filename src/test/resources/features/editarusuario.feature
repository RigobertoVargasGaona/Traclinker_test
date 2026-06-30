# language: es
# author: Michael Galindo

Característica: Editar usuario
  El usuario debe estar registrado para poder editar sus datos personales.

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave |
      | juanesyt7@gmail.com  | 12345 |

  @editarUsuario
  Esquema del escenario: Edición de usuario exitosa
    Cuando el usuario se encuentra en la página o módulo de usuarios y da clic en el botón de editar usuario se ingresan los datos a editar del usuario
      | rol | nombre | primer_apellido | segundo_apellido | ciudad | telefono | correo | direccion |
      | <rol> | <nombre> | <primer_apellido> | <segundo_apellido> | <ciudad> | <telefono> | <correo> | <direccion> |
    Entonces se debe verificar que el usuario fue editado correctamente

    Ejemplos:
      | rol | nombre | primer_apellido  | segundo_apellido | ciudad | telefono   | correo               | direccion |
      | 1   | Miguel | Contreras        | Aguilar          | 1      | 3003003030 | pepeito@gmail.com    | KR 124 #34-12 |