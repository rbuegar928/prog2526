
def maximo (a):
    valMax= a[0]
    for i in range(len(a)):
        if a[i] > valMax:
            valMax = a[i]
    return valMax


a = [5,3,2,8,1]
# Invocamos la función
num_mayor = maximo(a)
print (num_mayor)