import sys

a1 = float(sys.argv[1])
a2 = float(sys.argv[2])
a3 = float(sys.argv[3])

if a1 + a2 + a3 != 180:
    print('Não são ângulos internos de um triângulo!')
else:
    print('São ângulos de um triângulo ...')
    if (a1 == a2 and a1 != a3) or (a1 == a3 and a1 != a2) or (a2 == a3 and a2 != a1):
        print('... e o triângulo é isósceles!')
    elif a1 == 90 or a2 == 90 or a3 == 90:
        print('... e o triângulo é retângulo!')
    else:
        print('... e não se trata de um triângulo isósceles, nem de um triângulo retângulo!')