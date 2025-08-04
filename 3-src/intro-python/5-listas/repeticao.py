import sys

argumentos = sys.argv[1:]
lista = []
for item in argumentos:
    lista.append(int(item))

print(lista)

for i in range(len(lista)):
    if lista[i] != None:
        numero = lista[i]
        quantidade = 0
        for j in range(len(lista)):
            if lista[j] == numero:
                quantidade += 1
                lista[j] = None
        if quantidade > 1:
            print(numero, quantidade)