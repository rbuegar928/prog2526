nombres = ["Julio","Manolo","Juan","Adolfo"]

print("Alumnos ahora: ", nombres)

nuevo = input("Añade otro alumno: ")
nombres.insert(2,nuevo)

print("Alumnos actualizados:", nombres)