quantidade_18 = 0
media_altura = 0
quantidade_80 = 0

times = 5
jogadores = 11

for i in range(times):
    media_idade = 0
    print('\n\n--- TIME ' + str(i + 1) + ' ---')
    for j in range(jogadores):
        idade = int(input('Idade do jogador ' + str(j + 1) + ': '))
        peso = float(input('Peso do jogador ' + str(j + 1) + ': '))
        altura = float(input('Altura do jogador ' + str(j + 1) + ': '))

        if idade < 18:
            quantidade_18 = quantidade_18 + 1

        media_idade = media_idade + idade
        media_altura = media_altura + altura
        
        if peso > 80:
            quantidade_80 = quantidade_80 + 1

        print()
    
    print('Média de idade do time: ' + str(media_idade / jogadores))

print('Quantidade de jogadores com menos de 18 anos: ' + str(quantidade_18))
print('Média de alturas de todos os jogadores: ' + str(media_altura / (times * jogadores)))

percentual_80 = (100 * quantidade_80) / (times * jogadores)
print('Percentual de jogadores com mais de 80kg: ' + str(percentual_80))