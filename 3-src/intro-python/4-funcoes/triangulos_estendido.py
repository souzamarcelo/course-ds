def tipo_triangulo(x, y, z):
    if x >= y + z or y >= x + z or z >= x + y:
        return 'NÃO É UM TRIÂNGULO'
    elif x == y and y == z:
        return 'TRIÂNGULO EQUILÁTERO'
    elif x == y or y == z or x == z:
        return 'TRIÂNGULO ISÓSCELES'
    else:
        return 'TRIÂNGULO ESCALENO'

def perimetro_triangulo(x, y, z):
    return x + y + z

import sys

perimetro_total = 0
quantidade = 0
for i in range(3, len(sys.argv), 3):
    x = int(sys.argv[i - 2])
    y = int(sys.argv[i - 1])
    z = int(sys.argv[i])
    tipo = tipo_triangulo(x, y, z)
    print(tipo, end = '')
    if tipo != 'NÃO É UM TRIÂNGULO':
        perimetro = perimetro_triangulo(x, y, z)
        perimetro_total += perimetro
        quantidade += 1
        print(f'; perímetro: {perimetro}}.', end = '')
    print()

print(f'Perímetro total: {perimetro_total}.')
print(f'Perímetro médio: {perimetro_total / quantidade:.1f}.')