
# 💰 Simulador de Banco em Java

![Java](https://img.shields.io/badge/Java-21-blue?logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![Lombok](https://img.shields.io/badge/Lombok-%E2%9C%85-green?logo=lombok)

Este projeto é uma simulação de uma instituição bancária desenvolvida em Java, utilizando conceitos de programação orientada a objetos e padrões de projeto para fornecer uma experiência realista de uso de contas bancárias (corrente e poupança).

---

## 🧰 Tecnologias Utilizadas

- **Java 21**
- **Maven** como gerenciador de dependências
- **Lombok** para redução de código boilerplate (getters, setters, construtores, etc.)

---

## 🧠 Padrões de Projeto Aplicados

- **Singleton**: Utilizado para garantir que apenas uma instância da entidade `Banco` (instituição financeira) exista durante toda a execução do programa. Isso assegura que todas as contas criadas estejam centralizadas e disponíveis para login a qualquer momento.
- **Strategy + Factory**: Implementados para permitir a criação dinâmica dos tipos de conta (`ContaCorrente` e `ContaPoupanca`) em tempo de execução, dependendo da escolha do usuário.

---

## 📌 Funcionalidades

### Menu Inicial

```text
1 - Criar Conta
2 - Login
0 - Sair
```

## 🧾 Menu da Conta

Após realizar login com o número da conta, o usuário tem acesso às seguintes operações:

```text
--- Menu da Conta ---
1. Consultar Saldo
2. Consultar Cheque Especial
3. Depositar Dinheiro
4. Sacar Dinheiro
5. Pagar Boleto
6. Verificar Uso do Cheque Especial
0. Sair
```

---

## 🏦 Regras do Cheque Especial

- Se o valor inicial da conta for **menor ou igual a R$ 500,00**, o limite do cheque especial será de **R$ 50,00**.
- Se for **maior que R$ 500,00**, o limite será de **50% do valor inicial**.
- Ao utilizar o cheque especial, será aplicada uma **taxa de 20%** assim que houver saldo disponível.

---

## 📦 Como Executar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/seu-repositorio
```

2. Compile o projeto com Maven:

```bash
mvn clean package
```

3. Execute a aplicação:

```bash
java -jar target/nome-do-arquivo.jar
```

---

## 💬 Considerações Finais

Este projeto foi desenvolvido com o intuito de praticar conceitos sólidos de programação orientada a objetos, encapsulamento, reutilização de código, e aplicação de padrões de projeto como Singleton, Factory e Strategy. Ele pode servir como base para aplicações maiores, podendo futuramente incluir recursos como persistência em banco de dados, interface gráfica ou API REST.

🚀 **Contribuições são bem-vindas!**  
Sinta-se à vontade para abrir _issues_ ou enviar _pull requests_ com sugestões e melhorias.

---

## 🧑‍💻 Autor

**Elvis Assis**  
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-0A66C2?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/elvis-assis)  
[![GitHub](https://img.shields.io/badge/-GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/elvisasis)
