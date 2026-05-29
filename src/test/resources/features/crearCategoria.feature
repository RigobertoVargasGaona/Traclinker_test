# language: es
# author: EdwinQuenguan


Característica: Gestión de categorías

Antecedentes:
Dado que el usuario está autenticado en el sistema
Cuando el usuario ingresa credenciales válidas
| usuario              | clave        |
| juanesyt70@gmail.com | 6zAMhs5fARnE |

@crearCategoria
Esquema del escenario: Agregar una categoría correctamente

Dado que el usuario está en el módulo de categorías y hace clic en crear categoría

Cuando se ingresan los datos de la categoría
| campos             | valores      |
| nombre categoría   | <categoria>  |

Entonces el sistema confirma que la categoría fue creada correctamente

Y la categoría debería aparecer en la lista junto con las demás categorías

Ejemplos:
| categoria   |
| Tecnología  |