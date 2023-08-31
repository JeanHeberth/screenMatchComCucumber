#language: pt
Funcionalidade: Editando um filme cadastrado

  @editar
  Esquema do Cenário: Editando um filme cadastrado
    Dado que estou na lista de filmes e contém o filme '<filmeAntigo>'
#    E e o filme '<filmeAntigo>' está na lista
    Quando  atualizo o filme com o nome de '<filmeAntigo>' para '<filmeNovo>'
    Entao o filme '<filmeNovo>' deve ser encontrado na lista
    Exemplos:
      | filmeAntigo | filmeNovo |
      | Top gun     | Barbies   |



