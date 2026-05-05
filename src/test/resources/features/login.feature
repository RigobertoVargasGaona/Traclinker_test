# language: es
# author: RigobertoVargas

Característica: Inicio de sesión
  Como usuario registrado
  quiero iniciar sesión en la aplicación
  para poder acceder a mi cuenta

  @autenticacion
  Escenario: Verificar autenticación exitosa en Traclinker
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | campos      | valores               |
      | correo      | juanesyt7@gmail.com |
      | contraseña | &zA#hs5fARmE        |
    Entonces el usuario debería autenticarse exitosamente