import sys

r1 = float(sys.argv[1])
r2 = float(sys.argv[2])
r3 = float(sys.argv[3])

if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
    print('Podem formar um triângulo!')
else:
    print('NÃO podem formar um triângulo!')
