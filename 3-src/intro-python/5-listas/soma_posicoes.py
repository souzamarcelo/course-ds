numeros = [0] * 10
for i in range(10):
    numeros[i] = int(input(f'Informe o valor da posição {i}: '))

x = int(input('Informe o valor de x: '))
y = int(input('Informe o valor de y: '))

print(numeros[x] + numeros[y])