
# Java

Projeto criado para estudar/revisar os principais conceitos iniciais da linguagem Java.

Java é uma das linguagens de programação mais populares e utilizadas no mundo, conhecida por sua portabilidade, robustez e versatilidade. Desenvolvida pela Sun Microsystems (atualmente Oracle) em 1995, Java segue o paradigma de orientação a objetos e possui uma série de conceitos fundamentais que a tornam poderosa para desenvolvimento de aplicações desktop, web, mobile e embarcadas.

### **Plataforma Independente (Write Once, Run Anywhere - WORA)**

Java é compilada para um **bytecode** que é executado pela **Java Virtual Machine (JVM)**, permitindo que o mesmo código rode em qualquer sistema operacional (Windows, Linux, macOS) desde que haja uma JVM instalada. Isso garante **portabilidade**.

Esses três componentes são partes essenciais do ecossistema Java, cada um com uma função específica:

### **JVM (Java Virtual Machine)**

- É a **máquina virtual** que executa o bytecode Java
- Fornece o ambiente de execução para programas Java
- É responsável pela portabilidade do Java ("write once, run anywhere")
- Realiza otimizações durante a execução (JIT compilation)

### **JRE (Java Runtime Environment)**

- É o **ambiente de execução** Java
- Inclui a JVM + bibliotecas padrão (Java Class Library) necessárias para executar aplicações Java
- Não contém ferramentas de desenvolvimento, apenas o necessário para rodar programas
- Exemplo: necessário para usuários que só executam aplicações Java

### **JDK (Java Development Kit)**

- É o **kit de desenvolvimento** Java completo
- Inclui o JRE + ferramentas de desenvolvimento (compilador javac, debugger, documentação, etc.)
- Necessário para desenvolvedores que criam aplicações Java
- Contém tudo o que está no JRE mais as ferramentas de desenvolvimento

Resumo visual:

```bash
JDK = JRE + Ferramentas de desenvolvimento (Compilador, debugger, etc)
JRE = JVM + Bibliotecas padrão para execução de aplicações Java
```

## Tipos primitivos de dados

Os tipos primitivos de dados da linguagem Java são oito:

    1. byte - número inteiro de 8 bits (intervalo: -128 a 127)
    2. short - número inteiro de 16 bits (intervalo: -32.768 a 32.767)
    3. int - número inteiro de 32 bits (intervalo: -2^31 a 2^31-1)
    4. long - número inteiro de 64 bits (intervalo: -2^63 a 2^63-1)
    5. float - número de ponto flutuante de 32 bits (precisão simples)
    6. double - número de ponto flutuante de 64 bits (precisão dupla)
    7. char - caractere Unicode de 16 bits (intervalo: '\u0000' a '\uffff')
    8. boolean - valor lógico (true ou false)

Cada um destes tipos primitivos tem um tamanho fixo na memória e não são objetos.



## Stack utilizada

IDE utilizada: [Intellij IDEA Community](https://www.jetbrains.com/pt-br/idea/download)

Java Development Kit - JDK: Versão 17.

