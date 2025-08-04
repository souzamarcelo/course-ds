import sys

a = int(sys.argv[1])
b = int(sys.argv[2])
resultado = 0

for i in range(b):
    resultado += a

print(resultado)