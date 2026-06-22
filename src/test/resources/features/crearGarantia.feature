# language: es
# author: Rigoberto Vargas

Característica: Gestión de Garantías
  Como usuario autorizado del sistema Traclinker
  quiero gestionar las garantías de los equipos y contratos
  para poder registrar, consultar y hacer seguimiento de las garantías vigentes

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario           | clave |
      | prueba1@gmail.com | 12345.*|

  @garantias
  Escenario: Registrar una nueva garantía exitosamente
    Cuando el usuario selecciona la opción Nueva Garantía
      | serial| cliente    | telefono   | direccion| descripcion| adjuntos| ciudad|
      |QTYS2468135|Pepito Perez| 3008765432| Calle 50 #10-25 norte| Problema con la impresión | c:/mvkjhsdfksl/jhhfkdsjlfh | Cali |
    Entonces el sistema debe mostrar el mensaje Garantia registrada con éxito