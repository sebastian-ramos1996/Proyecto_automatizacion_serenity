Feature: seleccionar un producto de la seccion colchones en la categoria Hogar de la aplicacion Linio.com.co
  Yo como usuario de la aplicacion Linio.com.co
  necesito seleccionar un producto de la seccion colchones de la categoria Hogar por medio
  del carrito de compras

  Scenario Outline: seleccionar un producto de la seccion colchones en la categoria Hogar de la aplicacion Linio.com.co
    Given el usuario se encuentra en la aplicacion https://www.linio.com.co/
    When el usuario ingresa a la seccion colchones de la categoria Hogar y selecciona un producto con el carrito
    And el usuario elimina el producto seleccionado del carrito
    Then el usuario ve el <producto>, <cantidad> y <valor> en el carrito
    And ve el mensaje <mensaje>
    Examples:
      | producto                                               | cantidad | valor      | mensaje                           |
      | Super Mega Combo Azul Queen 160x190 Resortado Marshall | 3        | $1.274.900 | NO TIENES PRODUCTOS EN TU CARRITO |
