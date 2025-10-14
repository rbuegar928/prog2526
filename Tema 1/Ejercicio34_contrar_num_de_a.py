# Contar número de vocales en una frase y cambiarlas por X

# Definir cuenta
def cuentaVocales(texto):
    cuenta = texto.count("a") + texto.count("A") + texto.count("e") + texto.count("E") + texto.count("i") + texto.count("I") + texto.count("o") + texto.count("O") + texto.count("u") + texto.count("U")
    print("El número de vocales que hay es", cuenta)
# Definir función cuenta y reemplaza
def cuentaYReemplaza(texto):
    cuenta = texto.count("a") + texto.count("A") + texto.count("e") + texto.count("E") + texto.count("i") + texto.count("I") + texto.count("o") + texto.count("O") + texto.count("u") + texto.count("U")
    print("El número de vocales que hay es", cuenta)
    nuevoTexto = texto.replace("a", "x").replace("A", "X").replace("e", "x").replace("E", "X").replace("i", "x").replace("I", "X").replace("o", "x").replace("O", "X").replace("u", "x").replace("U", "X")
    return nuevoTexto
# Invocar funciones
texto = input("Introduzca una frase prar contar su número de a: ")
print(cuentaYReemplaza(texto))
