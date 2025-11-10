precios = [12.50,45.99,5.00,22.75,10.00]
for e in precios:
    print (e)


print("----------------------------------------------------")


for i in range(len(precios)):
    print(precios[i], "posiciṕon", i)


print("----------------------------------------------------")


suma = 0
for e in precios:
    suma = int(suma + e)
print ("El precio total es", suma,"€")