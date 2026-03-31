# 📚 Sistema Acadêmico em Java (POO)

Este projeto foi desenvolvido com o objetivo de praticar os conceitos de **Programação Orientada a Objetos (POO)** em Java, como:

- Herança
- Encapsulamento
- Polimorfismo
- Construtores
- Sobrescrita de métodos (override)

---

## 🧱 Estrutura do Projeto

O sistema é composto pelas seguintes classes:

### 🔹 Pessoa (classe base)
Contém atributos comuns a todos:
- Nome
- CPF
- Idade
- Sexo
- RG
- Ex-aluno

---

### 🔹 Funcionario (herda de Pessoa)
Adiciona:
- Chapa
- Data de admissão
- Salário

---

### 🔹 Professor (herda de Funcionario)
Adiciona:
- Carga horária
- Titulação
- Situação

---

### 🔹 Administrativo (herda de Funcionario)
Adiciona:
- Setor
- Horas semanais
- Situação

---

### 🔹 Aluno (herda de Pessoa)
Adiciona:
- RA
- Curso
- Situação

---

## ⚙️ Conceitos Utilizados

### ✅ Herança
As classes reutilizam atributos e métodos da classe `Pessoa`.

### ✅ Encapsulamento
Atributos privados (ex: CPF, salário) são acessados via getters e setters.

### ✅ Polimorfismo
Método `status()` sobrescrito em várias classes.

### ✅ Construtores
Cada classe possui construtores para inicialização dos objetos.

---

## 🖥️ Exemplo de Uso
---
java


        Professor p = new Professor(
            40,
            "Mestrado",
            12,
            "01/01/2020",
            5000,
            "João",
            "123.456.789-00"
        );

        Administrativo adm = new Administrativo(
            "Financeiro",
            10,
            "01/02/2021",
            3000,
            "Carlos",
            "111.222.333-44"
        );

        Aluno a = new Aluno(
            12345,
            "Engenharia",
            "Ativo",
            "Maria",
            "999.888.777-66"
        );

        p.status();
        System.out.println("-----------");
        adm.status();
        System.out.println("-----------");
        a.status();
    }



# 📌 Método status()

Cada classe implementa seu próprio método status() utilizando @Override, exibindo suas informações:

Pessoa → dados básicos
Funcionario → adiciona dados profissionais
Professor e Administrativo → adicionam dados específicos
Aluno → dados acadêmicos
🚀 Objetivo

Este projeto tem como objetivo consolidar o aprendizado de POO em Java, simulando um sistema simples de cadastro acadêmico.

# 🛠️ Tecnologias
Java

# 👨‍💻 Autor

Guilherme Costa
