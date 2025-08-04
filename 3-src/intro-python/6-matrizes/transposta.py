import sys

def le_matriz():
    n = int(sys.argv[1])
    valores = []
    for i in range(2, len(sys.argv)):
        valores.append(int(sys.argv[i]))
    
    matriz = []
    proximo = 0
    for i in range(n):
        matriz.append([])
        for j in range(n):
            matriz[i].append(valores[proximo])
            proximo += 1
    
    return matriz


def mostra(matriz):
    for linha in matriz:
        for elemento in linha:
            print(f'{elemento:4}', end = '')
        print()
        

def transpor(matriz):
    matriz_t = []
    for i in range(len(matriz)):
        matriz_t.append([])
    
    for linha in matriz:
        for i in range(len(linha)):
            matriz_t[i].append(linha[i])
            
    return matriz_t


matriz = le_matriz()
matriz_t = transpor(matriz)

print('Matriz original')
mostra(matriz)

print()

print('Matriz transposta')
mostra(matriz_t)