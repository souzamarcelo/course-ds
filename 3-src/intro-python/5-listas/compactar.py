import sys

argumentos = sys.argv[1:]
lista = []
for item in argumentos:
    lista.append(int(item))

print(lista)

ultimo = len(lista) - 1

for i in range(len(lista)):
    while ultimo > 0 and lista[ultimo] == 0:
        ultimo -= 1
    if i >= ultimo:
        break
    if lista[i] == 0:
        aux = lista[i]
        lista[i] = lista[ultimo]
        lista[ultimo] = aux
        ultimo -= 1

print(lista)