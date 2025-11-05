a = [1,2,3,4,5,6,7,8,9,10]
print("La lista original es: ", a)
for i in a:
    if i % 2 == 0:
        a.remove(i)
print("la lista sin los números pares es: ", a)