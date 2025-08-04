def tipo_triangulo(x, y, z):
    if x >= y + z or y >= x + z or z >= x + y:
        return 'NÃO É UM TRIÂNGULO'
    elif x == y and y == z:
        return 'TRIÂNGULO EQUILÁTERO'
    elif x == y or y == z or x == z:
        return 'TRIÂNGULO ISÓSCELES'
    else:
        return 'TRIÂNGULO ESCALENO'

import sys

qtd_equilatero = 0
qtd_isosceles = 0
qtd_escaleno = 0

for i in range(3, 16, 3):
    x = int(sys.argv[i - 2])
    y = int(sys.argv[i - 1])
    z = int(sys.argv[i])
    tipo = tipo_triangulo(x, y, z)
    print(x, y, z, '---', tipo)
    
    if tipo == 'TRIÂNGULO EQUILÁTERO': qtd_equilatero += 1
    if tipo == 'TRIÂNGULO ISÓSCELES': qtd_isosceles += 1
    if tipo == 'TRIÂNGULO ESCALENO': qtd_escaleno += 1
    
print()
print('QUANTIDADES:')
print('Equilátero:', qtd_equilatero)
print('Isósceles:', qtd_isosceles)
print('Escaleno:', qtd_escaleno)
