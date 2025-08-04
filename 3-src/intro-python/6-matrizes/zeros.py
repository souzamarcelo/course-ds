def linhas_zeradas(matriz):
    qtd = 0
    for linha in matriz:
        zerada = True
        for elemento in linha:
            if elemento != 0:
                zerada = False
                break
        if zerada: qtd += 1
    return qtd


def colunas_zeradas(matriz):
    qtd = 0
    for col in range(len(matriz[0])):
        zerada = True
        for lin in range(len(matriz)):
            if matriz[lin][col] != 0:
                zerada = False
                break
        if zerada: qtd += 1
    return qtd


matriz = [[1, 0, 4, 0],
          [0, 0, 0, 0],
          [4, 0, 0, 1],
          [0, 0, 0, 0],
          [1, 0, 4, 0]]

linhas = linhas_zeradas(matriz)
colunas = colunas_zeradas(matriz)
print(f'Linhas zeradas = {linhas}\nColunas zeradas = {colunas}')