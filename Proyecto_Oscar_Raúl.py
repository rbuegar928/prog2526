# Juego de preguntas

# Contador para ver el número de veces que ha contestado
contador = 0
Incorrecto = "Respuesta Incorrecta, prueba de nuevo"

# Definir respuestas correctas
respuesta1 = "Real Madrid"
respuesta2 = "Blanco"
respuesta3 = "Los Remedios"
respuesta4 = "DAW"
respuesta5 = "Fran"
respuesta6 = "Juan Carlos"
respuesta7 = 1007
respuesta8 = "Miami"
respuesta9 = "3 PM"
# Empezamos el test
answer = input("¿En que equipo juega Mbaapé? \n Barcelona \n Cádiz \n Ubrique FC \n Real Madrid \n Introduzca su respuesta: ")
while answer != respuesta1:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿De qué color es el caballo blanco de Santiago? \n Blanco \n Negro \n Amarillo \n Variado \n Introduzca su respuesta: ")
while answer != respuesta2:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿En qué instituto estamos? \n Los Remedios \n Las Cumbres \n Los Pirineos \n Las Soluciones \n Introduzca su respuesta: ")
while answer != respuesta3:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿Qué ciclo estamos cursando? \n TECO \n Ayuda a las peronas mayores \n DAM \n DAW \n Introduzca su respuesta: ")
while answer != respuesta4:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿Cómo se llama el mestro? \n Julio \n Adolfo \n Fran \n Mario \n Introduzca su respuesta: ")
while answer != respuesta5:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿Cómo se llama el mestro que dice chavales? \n Juan Manuel \n Juan Alberto \n Juan Antonio \n Juan Carlos \n Introduzca su respuesta: ")
while answer != respuesta6:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = int(input("¿Cuánto suma 7 + 1000? \n 17 \n 107 \n 1007 \n 10007 \n Introduzca su respuesta: "))
while answer != respuesta7:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿A qué se parece la entrada de Puerto Serrano? \n El Gastor \n Miami \n Madrid \n Londres \n Introduzca su respuesta: ")
while answer != respuesta8:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")
answer = input("¿A qué hora salimos hoy del instituto? \n 3 AM \n 6 PM \n 3 PM \n No salimos \n Introduzca su respuesta: ")
while answer != respuesta9:
    contador = contador + 1
    print(Incorrecto)
    answer = input("Vuelve a introducir tu nueva respuesta: ")

print("Has realizado", contador, "intentos") # Decimos el número total de intentos usados

print ("Pregunta Bonus: Debes introducir dos números que sumen 10")
num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))
if (num1 + num2) == 10:
    print("Respuesta correcta")
else:
    print("Respuesta incorrecta")