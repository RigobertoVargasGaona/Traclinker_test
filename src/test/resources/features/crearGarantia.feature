# language: es
# author: Rigoberto Vargas

Característica: Gestión de Garantías
  Como usuario autorizado del sistema Traclinker
  quiero gestionar las garantías de los equipos y contratos
  para poder registrar, consultar y hacer seguimiento de las garantías vigentes

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario             | clave        |
      | juanesyt7@gmail.com | &zA#hs5fARmE |

  @garantias @registro
  Escenario: Registrar una nueva garantía exitosamente
    Dado que el usuario está en el módulo de garantías
    Cuando el usuario selecciona la opción "Nueva Garantía"

     | serial     |cliente     |telefono   |direccion       |descripcion               |adjumtos                   |
     |QTYC1123122 | Juan Perez | 3008765432| Calle 50 #10-25| Problema con la impresión| c:/mvkjhsdfksl/jhhfkdsjlfh|

    Entonces el sistema debe mostrar el mensaje "Garantía registrada exitosamente"

