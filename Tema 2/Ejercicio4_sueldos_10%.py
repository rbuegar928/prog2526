# Sueldos con aumento del 10%
sueldos = [1800, 1200, 2000, 1200, 900]
print(sueldos)
for i in range(len(sueldos)): # recorremos todo el array
    sueldos[i] = (sueldos[i]*0.1) + sueldos[i]
print(sueldos)
