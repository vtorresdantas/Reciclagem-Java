# Reciclagem-Java

Com o objetivo de automatizar os postos de coleta de resíduos recicláveis, elabore
um programa que apresente um menu através do qual os usuários possam informar
o tipo de material que está sendo entregue:

- 1 PAPEL (CAIXAS DE PAPELÃO)
- 2 VIDRO (GARRAFAS DE VINHO)
- 3 ALUMÍNIO (LATAS DE REFRIGERANTE E CERVEJA)
- 4 PLÁSTICO
- 5 SAIR

Para cada tipo de material entregue, o programa deverá analisar as características
do material em questão (peso, volume, dimensões etc.) e gerar um crédito para ser
utilizado pelo cidadão no pagamento do IPTU do próximo ano. De acordo com as
seguintes especificações:

a) PAPEL:

- Para simular as dimensões da caixa de papelão entregue, forneça (entrada de
dados via teclado) um número inteiro referente à menor dimensão da caixa, largura
ou comprimento, entre 2 cm e 100 cm), calcule quantos ternos pitagóricos é possível
gerar com esta caixa e atribua um crédito de R$ 0,10 para cada terno pitagórico.

- Para simular o peso da caixa de papelão entregue, forneça (entrada de dados via
teclado) um número real referente ao peso da caixa de papelão, entre 0,5 kg e 2 kg)
e atribua um crédito de R$ 0,20 para cada kg de papelão.

b) VIDRO: Para simular a quantidade de garrafas de vidro entregues, forneça
(entrada de dados via teclado) um número inteiro referente à quantidade de garrafas
de vidro entregues, entre 1 e 20, e atribua um crédito de R$ 0,15 por garrafa.

c) ALUMÍNIO: O programa deverá discriminar a quantidade de latinhas de alumínio
com e sem o anel de abertura (lacre). Para simular a quantidade de latas de alumínio
entregues, forneça (entrada de dados via teclado) dois números inteiros, um número
para a quantidade de latas com lacre e o outro para a quantidade de latas sem lacre,
entre 1 e 30, e atribua um crédito de R$ 0,30 por lacre e R$ 0,25 por litro de “latinha
amassada”, sendo que cada latinha amassada representa um volume de 5 ml.

d) PLÁSTICO: Para simular a quantidade de “garrafas PET" entregues, forneça
(entrada de dados via teclado) um número inteiro referente à quantidade de
“garrafas PET” entregues, entre 1 e 12, e atribua um crédito de R$ 0,05 para cada
“garrafa PET” entregue.

Assim que o usuário encerrar a execução do programa, opção 5 – SAIR, o programa
deverá exibir (1) o TOTAL de créditos obtidos pelo usuário naquela entrega de
materiais recicláveis e (2) qual foi o material reciclável entregue em maior quantidade
(VIDRO, ALUMÍNIO ou PLÁSTICO).

Observação: O programa deverá realizar a consistência de todos os valores de
entrada fornecidos, aceitando apenas valore válidos, isto é, de acordo com as
especificações acima.

- ENTREGA 1: Nestas condições, desenvolva o programa para automação do posto de
coleta de resíduos recicláveis.
