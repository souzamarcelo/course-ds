import sys

argumentos = sys.argv[1:]
lista = []
for item in argumentos:
    lista.append(int(item))

print(lista)

for i in range(len(lista)):
    if i > 0:
        lista[i] = lista[i] + lista[i - 1]

print(lista)