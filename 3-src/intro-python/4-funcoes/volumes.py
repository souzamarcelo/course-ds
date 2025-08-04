import sys
import math

def cubo(s):
    return s ** 3

def paralelepipedo(l, c, h):
    return l * c * h

def cilindro(r, h):
    return math.pi * (r ** 2) * h

def esfera(r):
    return (4 * math.pi * (r ** 3)) / 3

def cone(r, h):
    return (math.pi * (r ** 2) * h) / 3

forma = sys.argv[1]
if forma == 'cubo':
    volume = cubo(int(sys.argv[2]))
if forma == 'paralelepipedo':
    volume = paralelepipedo(int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4]))
if forma == 'cilindro':
    volume = cilindro(int(sys.argv[2]), int(sys.argv[3]))
if forma == 'esfera':
    volume = esfera(int(sys.argv[2]))
if forma == 'cone':
    volume = cone(int(sys.argv[2]), int(sys.argv[3]))

print(f'Volume do/a {forma}: {volume:.1f}')