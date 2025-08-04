import sys

a = int(sys.argv[1])
b = int(sys.argv[2])

contador = 0
for i in range(b, a + 1, b):
    contador = contador + 1
print(f'Parte inteira: {contador}')
print(f'Resto: {a - contador * b}')


# import sys
# 
# numerador = int(sys.argv[1])
# denominador = int(sys.argv[2])
# 
# divisao_inteira = 0
# 
# while numerador >= denominador:
#     numerador = numerador - denominador
#     divisao_inteira = divisao_inteira + 1
# 
# print('Divisão inteira:', divisao_inteira)
# print('Resto:', numerador)