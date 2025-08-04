import random

def primo(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def conta(matriz):
    primos = 0
    for linha in matriz:
        for elemento in linha:
            if primo(elemento):
                primos += 1
    return primos


def gera_matriz(semente):
    random.seed(semente)
    n = random.randint(3, 10)

    matriz = []
    for i in range(n):
        matriz.append([])
        for j in range(n):
            matriz[i].append(random.randint(2, 100))
    
    return matriz



qtd = conta(gera_matriz(1))
print(f'Quantidade de primos: {qtd}')

qtd = conta(gera_matriz(2))
print(f'Quantidade de primos: {qtd}')

