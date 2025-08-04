velocidade = input('Velocidade: ')
velocidade = int(velocidade)

if velocidade > 80:
    print('Você foi multado!')
    valor_multa = (velocidade - 80) * 30
    print(f'A multa é de ${valor_multa:.2f}.')