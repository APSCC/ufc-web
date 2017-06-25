## JSF - Autenticaço e Escopos de Beans
### Exercício

Evolua o projeto trabalhado no [Exercício 12](exercicio-12.md) implementando os seguintes requisitos.
* Na página principal, o menu lateral deve conter 2 links: Login e Disciplinas. 
* Essas duas funcionalidades devem estar acessíveis sem a necessidade de autenticação. 
* A página de login deve conter um formulário de login que fará autenticação no sistema. 
* A página de Disciplinas deve conter uma tabela com os dados de todas as disciplinas (incluindo os alunos matriculados). Utilize um bean de escopo global para isso. 
* Após a realização do login, o usuário deve ser direcionado para a página principal da área administrativa. Garanta que as páginas da área administrativa só são acessíveis caso o usuário esteja logado (utilize bean com escopo de sessão para armazenar o usuário logado). 
* O menu lateral da área administrativa deve conter os links: Alunos, Professores e Disciplinas. Cada link deve levar a uma página de CRUD dessas entidades. 
* Cada uma dessas entidades deve ter um atributo usuário (do tipo Usuario) que deve receber como valor o usuário que cadastrou o objeto ou o último usuário a editar (use ManagedProperty no bean para acessar bean de sessão). 
* Para cadastrar o professor na disciplina, utilize o componente Autocomplete (simple) do Primefaces. 
* Para cadastrar os alunos na disciplina, utilize o componente Autocomplete (Multiple) do Primefaces. 
