# Sueldos con aumento del 10%
sueldos = [1800, 1200, 2000, 1200, 900]

for i in range(len(sueldos)):
    sueldos[i] = (sueldos[i]*0.1) + sueldos[i]
print(sueldos)
