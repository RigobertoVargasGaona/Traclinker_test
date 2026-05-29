# language: es
# author: Rigoberto Vargas

Característica: Gestión de Garantías
  Como usuario autorizado del sistema Traclinker
  quiero gestionar quiero poder editar una garantia existente

  Antecedentes:
    Dado que el usuario está en la página de inicio de sesión
    Cuando el usuario ingresa credenciales válidas
      | usuario           | clave |
      | prueba1@gmail.com | 12345.*|

  @garantias
  Escenario: Edita una garantía existente exitosamente
      Cuando el usuario selecciona una incidencia para editar
      | id | estado       |
      | 1  | Pendiente |
    Entonces el sistema debe mostrar el mensaje Garantía registrada exitosamente