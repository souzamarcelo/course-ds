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


def simetrica(matriz):
    n = len(matriz)
    
    for linha in matriz:
        if len(linha) != n:
            return False
    
    for i in range(n):
        for j in range(n):
            if matriz[i][j] != matriz[j][i]:
                return False
    
    return True


matriz = le_matriz()
if simetrica(matriz):
    print('A matriz é simétrica!')
else:
    print('A matriz NÃO é simétrica!')