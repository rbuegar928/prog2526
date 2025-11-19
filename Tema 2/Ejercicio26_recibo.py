#variables del producto
producto = "Espresso Doble"
precio_unitario = 3.50

#variables de la transacción
cantidad = 3
tasa_iva = 0.16

#variables del cliente
cliente_nombre = "Ana María López"
id_transaccion = "CAF-20205-472"

recibo = (f"""---Recibo de Transacción | ID: {id_transaccion}
Cliente: {cliente_nombre}
Producto: {producto} ({cantidad} unidades)
Subtotal (sin IVA): {precio_unitario*cantidad}€
============================================
Total a pagar: {precio_unitario*cantidad*(1+tasa_iva)}€""")

print(recibo)