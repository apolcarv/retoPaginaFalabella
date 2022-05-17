# language: es
Característica: Comprar un producto en el portal falabella.com colombia

  @Compra_exitosa
  Esquema del escenario: 001 - Realizar compra de un producto en el portal de falabella y llevarlo hasta el proceso de pago
    Dado que el usuario ingresa al portal de falabella colombia para la compra de un producto "<ESCENARIO>" "<FUNCIONALIDAD>"
    Cuando realiza busqueda de un producto de preferencia realizando compra y proceso de compra
    Entonces el usuario llega hasta el final de la compra del producto
    Ejemplos:
      | ESCENARIO                | FUNCIONALIDAD                                                                             |
      | 001- COMPRAR UN PRODUCTO | COMPRA DE UN PRODUCTO PORTAL FALABELLA COL Y LLEVARLOS HASTA EL FINAL DEL PROCESO DE PAGO |

