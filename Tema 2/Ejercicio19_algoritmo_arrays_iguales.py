#Algoritmo que dice si dos arrays son iguales
def iguales(a, b):
    l1 = len(a)
    l2 = len(b) 
    if l1 == l2:
        for i in range(l1):
            if a[i] != b[i]:
                return  False
            else:
                return True
    else:
        return False
        
#Creo los dos arrays
a = [1,2,3,4,5]
b = [1,3,5,2,4]

  
    
#Llamar algoritmo y ejecutar
if (iguales(a,b)) == True:
    print("Los arrays son iguales")
else:
    print("Los arrays no son iguales")