# language: es
# author:

Característica: Editar usuario
  El usuario debe estar registrado para poder editar sus datos personales.

  Antecedentes:
    Dado que el administrador está autenticado en el sistema
      | campos     | valores              |
      | correo     | juanesyt7@gmail.com  |
      | contraseña | &zA#hs5fARmE         |
    Y está en la página de usuarios y hace clic en el botón Editar usuario

  @editarUsuario
  Escenario: Edición de usuario exitosa
    Dado que el usuario está en la pantalla de perfil
    Cuando ingresa los datos personales que desea editar
      | Rol              | Admin             |
      | Nombre           | Miguel            |
      | Primer Apellido  | Contreras         |
      | Segundo Apellido | Aguilarrrr        |
      | Ciudad           | Cartagena         |
      | Número           | 3003003030        |
      | Email            | pepeito@gmail.com |
      | Dirección        | KR 124 #34'12     |
    Y se hace clic en "Guardar"
    Entonces se verifica que la información ha sido actualizada correctamente