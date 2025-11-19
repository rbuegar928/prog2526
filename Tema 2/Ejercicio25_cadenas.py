palabra = input("Escriba una palabra: ")
invertida = palabra[::-1]
print(f"La palabra al revés es {invertida}")
if palabra == invertida:
    print(f"La palabra {palabra} es un palíndromo")
else:
    print(f"La palabra {palabra} no es un palíndromo")
    
print("------------------------------------------------------")

cadena = " juan.perez@dominio.com "
print(cadena.strip())
print(cadena.upper())
print(cadena.split("@"))

print("------------------------------------------------------")

clase = "titulo"
contenido = "Mi Encabezado"
etiqueta = (f"<h1 class={clase}>{contenido}</h1>")

print(etiqueta)