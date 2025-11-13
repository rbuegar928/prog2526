#Algoritmo que dice si dos arrays son iguales
def iguales(a, b):
    l1 = len(a)
    l2 = len(b) 
    if l1 == l2:
        for i in range(l1):
            if a[i] != b[i]:
                return False
    else:
        return False
    
    return True

#Creo los dos arrays
a = [1,2,3,4,5]
b = [1,5,3,2,4]

  
    
#Llamar algoritmo y ejecutar
if (iguales(a,b)) == True:
    print("Los arrays son iguales")
else:
    print("Los arrays no son iguales")