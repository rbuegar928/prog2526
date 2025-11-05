inventario = ["Manzanas","Plátanos","Naranjas","Peras"]
cargasGrandes = []
# Llega el envío
inventario.append("Uvas")
inventario.append("Kiwi")
cargasGrandes.append("Melones")
inventario.extend(cargasGrandes)
# Reordenamiento
inventario.insert(2,"Plátanos Frescos")
# Venta y Descarte
producto_vendido = inventario.pop(-1)
inventario.remove("Peras")
# Reporte de emergencia
reporte_urgente = inventario[0:4]

for i in range (len(reporte_urgente)):
    print("ID:",i,",", reporte_urgente[i])