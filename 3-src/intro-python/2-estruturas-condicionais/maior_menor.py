n1 = int(input('Informe primeiro número: '))
n2 = int(input('Informe segundo número: '))
n3 = int(input('Informe terceiro número: '))

if n1 > n2 and n1 > n3:
    print('Maior:', n1)
if n2 > n1 and n2 > n3:
    print('Maior:', n2)
if n3 > n2 and n3 > n1:
    print('Maior:', n3)

if n1 < n2 and n1 < n3:
    print('Menor:', n1)
if n2 < n1 and n2 < n3:
    print('Menor:', n2)
if n3 < n2 and n3 < n1:
    print('Menor:', n3)