import Ejercicio16_busqueda_binaria
import Ejercicio15_método_buscar_num
lista = [3.14,9,1,30,1.46,0.92]

eleccion = float(input("Introduzca el número que quiere buscar: "))
print(Ejercicio15_método_buscar_num.buscarNum(lista,eleccion))

ordenado = lista.sort
print(Ejercicio16_busqueda_binaria.busquedaBinaria(ordenado,eleccion))