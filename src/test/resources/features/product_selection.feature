# Autor: Jhon Sebastian Ramos Muñoz


Feature: seleccionar un producto de la seccion colchones en la categoria Hogar de la aplicacion Linio.com.co
  Yo como usuario de la aplicacion Linio.com.co
  necesito seleccionar un producto de la seccion colchones de la categoria Hogar por medio
  del carrito de compras

  @scenario1
  Scenario Outline: seleccionar un producto de la seccion colchones en la categoria Hogar de la aplicacion Linio.com.co
    Given el usuario se encuentra en la aplicacion https://www.linio.com.co/
    When el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito
    Then el usuario ve el <producto>, <cantidad> y <valor> en el carrito
    Examples:
      | producto                                               | cantidad | valor      |
      | Super Mega Combo Azul Queen 160x190 Resortado Marshall | 3        | $3.974.700 |

  @scenario2
  Scenario Outline: seleccionar un producto de la seccion colchones en la categoria Hogar de la aplicacion Linio.com.co y eliminarlo del carrito al finalizar
    Given el usuario se encuentra en la aplicacion https://www.linio.com.co/
    When el usuario ingresa a la seccion colchones de la categoria Hogar, selecciona un producto con el carrito y despues lo elimina
    Then el usuario ve el mensaje <mensaje>
    Examples:
      | mensaje                           |
      | NO TIENES PRODUCTOS EN TU CARRITO |
