modelo = []
consumo = []

for i in range(5):
    modelo.append(input(f'Informe o modelo do {i + 1}o veículo: '))
    consumo.append(int(input(f'Informe o consumo do {i + 1}o veículo: ')))

indice_economico = 0
maior_economia = float('-inf')
for i in range(len(consumo)):
    if consumo[i] > maior_economia:
        maior_economia = consumo[i]
        indice_economico = i
print(f'O veículo mais econômico é o {modelo[indice_economico]}, que faz {maior_economia} quilômetros com um litro de combustível!')

for i in range(len(consumo)):
    litros = 1000 / consumo[i]
    print(f'O veículo {modelo[i]} consome {litros:.1f} litros de combustível para percorrer 1000km!')