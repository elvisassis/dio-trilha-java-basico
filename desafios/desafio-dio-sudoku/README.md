# Sudoku CLI - Jogo de Sudoku no Terminal

Este é um projeto de Sudoku desenvolvido em **Java 21**, com uma interface de linha de comando simples e interativa. O jogo permite ao usuário iniciar um novo desafio, inserir ou remover números, visualizar o estado atual do tabuleiro, e muito mais.

---

## 🧩 Funcionalidades

O jogo oferece as seguintes opções no menu principal:

1. **Iniciar um novo jogo**  
   Gera um novo tabuleiro de Sudoku válido com dicas iniciais (`fixed = true`) e espaços a serem preenchidos (`fixed = false`).

2. **Colocar um novo número**  
   Permite inserir um número em uma posição não fixa do tabuleiro.

3. **Remover um número**  
   Remove um número que foi inserido pelo usuário.

4. **Visualizar jogo atual**  
   Exibe o estado atual do tabuleiro com os números fixos e os números adicionados pelo jogador.

5. **Verificar o status do jogo**  
   Verifica se o Sudoku foi resolvido corretamente.

6. **Limpar jogo**  
   Remove todos os números inseridos pelo usuário, mantendo apenas os valores fixos.

7. **Finalizar jogo**  
   Encerra o jogo atual e limpa o tabuleiro.

8. **Sair**  
   Encerra o programa.

---

## 🛠 Requisitos

- **Java 21** instalado  
- IDE recomendada: IntelliJ IDEA ou qualquer outra que suporte Java 21

---

## 🚀 Como Executar

### 1. Clonar o projeto
```bash
git clone https://github.com/elvisassis/desafio-dio-sudoku.git
cd desafio-dio-sudoku
```

### 2. Executar via IntelliJ IDEA

- Vá em `Run > Edit Configurations`
- Em **Program Arguments**, adicione uma string gerada com o formato:
  ```
  0,0;5,true 1,0;3,false 2,0;8,false ...
  ```
  > Essa string representa a configuração inicial do tabuleiro e pode ser gerada pelo utilitário `SudokuArgsGenerator`.

- Rode a aplicação (`Shift + F10` ou botão verde ▶️)

---

## 📦 Utilitário: SudokuArgsGenerator

O projeto inclui uma classe que gera Sudokus válidos e aleatórios:

```bash
public class SudokuArgsGenerator {
    public static void main(String[] args) {
        ...
    }
}
```

Esse gerador:

- ✅ Cria um **Sudoku totalmente válido e aleatório**
- 🎯 **"Esconde" parte dos números como desafio**, mantendo apenas alguns como dicas fixas (`fixed = true`)
- 🧵 **Gera uma string no formato esperado pelo jogo**:
- 🔒 Garante que **todos os campos `false` têm uma resposta correta** embutida na estrutura do tabuleiro (baseada na solução gerada internamente)


```
coluna,linha;valor,fixed
```

Exemplo:
```
0,0;5,true 1,0;3,false ...
```

Você pode copiar essa saída e usar como argumento do programa na IDE.

---

## 📷 Exemplo de Tela

```
Seu jogo se encontra da seguinte forma:
+---+---+---+
| 5 |   | 3 |
|   | 6 |   |
| 7 |   | 1 |
+---+---+---+
...
```

---

## 👤 Autor

<p align="left">
  <a href="kesleiassis@gmail.com">
    <img src="https://img.shields.io/badge/email-kesleiassis@gmail.com-blue?style=for-the-badge&logo=gmail" alt="email badge">
  </a>
  <a href="https://linkedin.com/in/elvis-assis">
    <img src="https://img.shields.io/badge/LinkedIn-Perfil-blue?style=for-the-badge&logo=linkedin" alt="LinkedIn badge">
  </a>
</p>

---

