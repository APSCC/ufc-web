## JSF - Validadores
### Exercício

Utilizando como base os exercícios [9](exercicio-9) e [10](exercicio-10), `utilize os validadores` JSF para implementar as seguintes regras de negócio.

* Em página Alunos que deve ter o CRUD de Aluno ([9](exercicio-9)):
  * Campo email deve seguir o padrao [`usuario`]@[`dominio`]
* Em página de Disciplina que deve ter o CRUD de Disciplina ([9](exercicio-9)):
  * Não permitir cadastro de disciplina com nome dá existente
* Em Matricular aluno(s) em disciplina(s) ([10](exercicio-10)):
  * O campo `período` deve necessariamente ter o formato [`ano`].[`semestre`] (exemplo: `2017.1`). Não permitir formato diferente
* Em Dar nota ao aluno em determinada disciplina e período ([10](exercicio-10)):
  * Não permitir dar nota para aluno em disciplina e período onde o aluno já tenha nota
