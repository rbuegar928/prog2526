#Algoritmo que dice si tres arrays son iguales ignorando mayus
def comparar(a,b,c):
    #Comparar longitudes de las listas
    if len(a) == len(b) == len(c):
        #Recorrer listas comparando letras
        for i in range(len(a)):
            if a[i].lower() != b[i].lower() or a[i].lower() != c[i].lower() or b[i].lower() != c[i].lower:
                return  False
    else:
        return False
    
    return True
    
a = ["h","o","l","a"]
b = ["H","o","l","a"]
c = ["H","O","L","A"]

#Llamar algoritmo y ejecutar
if (comparar(a,b,c)) == True:
    print("Los arrays son iguales")
else:
    print("Los arrays no son iguales")