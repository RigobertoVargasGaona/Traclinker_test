# language: es
# author: Michael Galindo

Característica: Editar usuario
  El usuario debe estar registrado para poder editar sus datos personales.

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave      |
      | juanesyt7@gmail.com | 12345.*    |

  @editarUsuario
  Esquema del escenario: Edición de usuario exitosa
    Dado que el usuario se encuentra en el modulo o página de usuarios
    Entonces debe dar click al boton de editar usuario
    Cuando el usuario ingresa los datos personales que desea editar
      | campos           | valores           |
      | rol              | Admin             |
      | nombre           | Miguel            |
      | primer apellido  | Contreras         |
      | segundo apellido | Aguilarrr         |
      | ciudad           | Cartagena         |
      | numero telefono  | 3003003030        |
      | correo           | pepeito@gmail.com |
      | direccion        | KR 124 #34-12     |
    Entonces debe darle clic al botón de "Guardar"
    Entonces se verifica que la información del usuario ha sido actualizada correctamente

    Ejemplos:
      | nombre  | primer apellido | segundo apellido | rol   | estado |
      | Albeiro | Ramos           | Villalba         | Admin | activo |
      | Juan    | Pérez           | Garcia           | Admin | activo |
      | Miguel  | Contreras       | Aguilar          | Admin | activo |