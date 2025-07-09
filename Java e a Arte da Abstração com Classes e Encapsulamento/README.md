# ☕ Desafios Java — Bootcamp Santander 2025 (Back-End com Java)

Este repositório contém a implementação de dois desafios práticos desenvolvidos no módulo  
**"Java e a Arte da Abstração com Classes e Encapsulamento"**, oferecido pelo **Bootcamp Santander 2025 - Back-End com Java**.

Todos os desafios seguem a proposta de **simular situações reais**, utilizando os pilares da **Programação Orientada a Objetos (POO)**, com foco em **classes, encapsulamento, lógica de negócio e validações de estado**. Cada aplicação conta com **um menu interativo no terminal**, com opção de sair ao final da execução.

---

## ✍️ Exercícios propostos

Durante o módulo, três desafios foram propostos:

1. 🐶 Máquina de Banho de PetShop  
2. 🏦 Conta Bancária com Cheque Especial
3. 🚗 Simulação de Carro com Marchas e Velocidade  

##

> Eu optei por implementar **dois , dos três exercícios**, pois me identifiquei mais com suas lógicas e regras de negócio. Ambos foram desenvolvidos com atenção à estrutura, validações e interação fluída via console.

---

## 🐶 Desafio 1 — Máquina de Banho de PetShop

Simula uma máquina automatizada de banho para pets, com recursos limitados de água e shampoo. Inclui controle de estado da máquina, presença do pet e consumo de recursos.

### Funcionalidades:
- Dar banho no pet;
- Abastecer com água;
- Abastecer com shampoo;
- verificar nivel de água;
- verificar nivel de shampoo;
- verificar se tem pet no banho;
- colocar pet na maquina;
- retirar pet da máquina;
- limpar maquina.

### Regras de implementação

- A maquina de banho deve permitir somente 1 pet por vez;
- Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
- A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
- Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina     para permitir a entrada de outro pet;
- A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
- O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;


---

## 🏦 Desafio 2 — Conta Bancária com Cheque Especial

Simula uma conta bancária com operações financeiras e um sistema de cheque especial que se adapta ao valor depositado na criação da conta.

### Funcionalidades:
- Consultar saldo;
- consultar cheque especial;
- Depositar dinheiro;
- Sacar dinheiro;
- Pagar um boleto;
- Verificar se a conta está usando cheque especial;

### Regras:
- A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
- O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
- Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00;
- Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
- Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial;

---

## 🏦 Estrutura — Conta Bancária
```bash
📦 src/
┣ 📂 banco/
┃ ┗ 📄 ContaBancaria.java
┗ 📄 Main.java
```

---

## 🐶 Estrutura — Máquina de Banho de PetShop
```bash
📦 src/
┣ 📂 banho/
┃ ┗ 📄 MaquinaDeBanho.java
┗ 📄 Main.java
```

## 🛠️ Tecnologias utilizadas no projeto

- Social:
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/SEUUSERNAME/)[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/SEUUSERNAME)
- Linguagens de Marcação e Estilo
![Markdown](https://img.shields.io/badge/Markdown-000?style=for-the-badge&logo=markdown)

- Linguagens de Programação
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

---

## 📚 O que aprendi

Aplicação prática de classes com estados e comportamentos

Uso de constantes e validações robustas

Controle de lógica de negócio simulando situações reais

Separação de responsabilidades e encapsulamento

Interação com o usuário via menus dinâmicos

---

## 📌 Observação
O desafio referente à simulação do carro com marchas e velocidade também fazia parte da proposta, mas optei por focar na máquina de banho e conta bancária, por serem mais interessantes do ponto de vista lógico e de validações.

---

## 🧑‍💻 Autor  
**Fellipe Gonsalves de Pina Miranda**  
Bootcamp Santander 2025 — Back-End com Java  

- [GitHub](https://github.com/FellipePina)  
- [LinkedIn](https://www.linkedin.com/in/fellipe-miranda-7b070331a/)

