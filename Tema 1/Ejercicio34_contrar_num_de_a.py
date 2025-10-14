# Contar númerode "a" en una frase

# Definir función
def cuentaA(texto):
    cuenta = texto.count("a") + texto.count("A")
    return cuenta
# Invocar función
frase = input("Introduzca una frase prar contar su número de a: ")
print(cuentaA(frase))
