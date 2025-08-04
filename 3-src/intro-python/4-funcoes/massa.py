import sys

def tempo(massa):
    t = 0
    while massa >= 0.5:
        t += 50
        massa /= 2
    return t

def massa_final(massa):
    while massa >= 0.5:
        massa /= 2
    return massa


massa_i = float(sys.argv[1])
tempo_f = tempo(massa_i)
massa_f = massa_final(massa_i)

print(tempo_f)
horas = int(tempo_f / 60 / 60)
tempo_f = tempo_f - (horas * 60 * 60)
minutos = int(tempo_f / 60)
tempo_f = tempo_f - (minutos * 60)
segundos = tempo_f

print(f'Massa inicial: {massa_i:.1f}')
print(f'Massa final: {massa_f:.1f}')
print(f'Tempo: {horas} horas, {minutos} minutos, {segundos} segundos')