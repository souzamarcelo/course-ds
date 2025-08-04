import sys

dias = int(sys.argv[1])
horas = int(sys.argv[2])
minutos = int(sys.argv[3])
segundos = int(sys.argv[4])

total_segundos = segundos
total_segundos = total_segundos + (minutos * 60)
total_segundos = total_segundos + (horas * 60 * 60)
total_segundos = total_segundos + (dias * 60 * 60 * 24)

print('Tudo isso em segundos:', total_segundos)