import sys

def primo(n):
    if n <= 1: return False
    for i in range(2, numero):
        if numero % i == 0:
            return False
    return True


argumentos = sys.argv[1:]
lista = []
for item in argumentos:
    lista.append(int(item))

print(lista)

primos = []
for numero in lista:
    if primo(numero):
        primos.append(numero)

print(primos)
