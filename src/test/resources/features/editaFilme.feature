#language: pt
Funcionalidade: Cadastrando novo filme


  Esquema do Cenário: Editando um filme cadastrado
  Dado que estou na lista de filmes e contém o filme '<filmeAntigo>'
  Quando atualizo o filme com o nome de '<filmeAntigo>' para '<filmeNovo>'
  Entao a lista de filme não contém '<filmeAntigo>' e contém agora '<filmeNovo>'
  Exemplos:
    | filmeAntigo | filmeNovo |
    | Top gun     | Barbie    |



