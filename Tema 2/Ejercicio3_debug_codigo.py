# El fallo es que tiene puesto 5, por lo cual busca leer hasta el índice 4, pero al empezar en cero llegamos solo hasta el 3, por lo que quiere leer un último índice inexistente
a = [1,2,3,4]
# Lo arreglamos poniendo len de a para que coja el tamaño de la lista de forma automática
for i in range(len(a)):
    print(a[i])
