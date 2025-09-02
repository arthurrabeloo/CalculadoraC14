# Projeto Calculadora e Pilha com Testes Unitários

## Requisitos atendidos
- 20 testes unitários para a **Calculadora** (10 positivos e 10 negativos).
- 10 testes unitários para a **Pilha** (positivos e negativos).
- Framework de testes: **JUnit 5**.
- Automação de build: **Maven**.
- Versionamento: **Git**.

---

## 📌 Funcionalidades implementadas

### 🔹 Calculadora
A classe `Calculadora` implementa operações matemáticas básicas:
- `somar(int a, int b)`
- `subtrair(int a, int b)`
- `multiplicar(int a, int b)`
- `dividir(int a, int b)` (lança exceção em divisão por zero)
- `ehPar(int numero)`
- `potencia(int base, int expoente)`

Foram criados **20 testes unitários** cobrindo casos positivos e negativos.

---

### 🔹 Pilha
A classe `Pilha<T>` implementa uma estrutura de dados do tipo **stack** (LIFO), com as seguintes operações:
- `push(T elemento)` → adiciona elemento no topo (lança erro se cheia).
- `pop()` → remove e retorna o topo (lança exceção se vazia).
- `peek()` → retorna o topo sem remover (lança exceção se vazia).
- `isEmpty()` → verifica se está vazia.
- `isFull()` → verifica se está cheia.
- `size()` → retorna a quantidade de elementos.

Foram criados **10 testes unitários** cobrindo:
- Inserção e remoção (`push` e `pop`).
- Consulta do topo (`peek`).
- Exceções em pilha vazia (`EmptyStackException`).
- Exceção em pilha cheia (`StackOverflowError`).
- Verificação de tipos genéricos (String, Integer, Double).
- Validação de capacidade inválida.

---

## 📌 Execução dos testes
Para rodar todos os testes da **Calculadora** e da **Pilha**:

```bash
mvn test
