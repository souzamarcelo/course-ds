M = [[1, 5, 7, -9, 0],
     [5, -8, -10, 5, 9],
     [4, -12, 19, 6, 0],
     [4, -48, 1, 95, 5],
     [6, 2, 1, -5, 9]]

menor = float('inf')
maior = float('-inf')

# Forma 1
def busca1():
    global menor, maior
    for i in range(len(M)):
        for j in range(len(M[i])):
            if M[i][j] > maior:
                maior = M[i][j]
            if M[i][j] < menor:
                menor = M[i][j]
    
    print(f'Maior valor: {maior}')
    print(f'Menor valor: {menor}')
    

# Forma 2
def busca2():
    global menor, maior
    for linha in M:
        for elemento in linha:
            if elemento > maior:
                maior = elemento
            if elemento < menor:
                menor = elemento
    
    print(f'Maior valor: {maior}')
    print(f'Menor valor: {menor}')
    

busca2()
    

