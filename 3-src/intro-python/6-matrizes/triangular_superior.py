M = [[1, 2, 4, 3, 6],
     [4, 5, 3, 1, 2],
     [0, 0, 2, 1, 7],
     [0, 9, 0, 2, 4],
     [0, 0, 1, 0, 8]]

N = [[1, 2, 4, 3, 6],
     [0, 5, 3, 1, 2],
     [0, 0, 2, 1, 7],
     [0, 0, 0, 2, 4],
     [0, 0, 0, 0, 8]]


def triangular_superior(matriz):
    for l in range(len(matriz)):
        for c in range(len(matriz[l])):
            if l > c:
                if matriz[l][c] != 0:
                    return False
    return True


if triangular_superior(M):
    print('A matriz M é triangular superior!')
else:
    print('A matriz M NÃO é triangular superior!')

if triangular_superior(N):
    print('A matriz N é triangular superior!')
else:
    print('A matriz N NÃO é triangular superior!')