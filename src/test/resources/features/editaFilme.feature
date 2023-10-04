#language: pt
Funcionalidade: Editando um filme cadastrado

  @editar
  Esquema do Cenário: Editando um filme cadastrado
    Dado que estou na lista de filmes
    E aciono o botao de editar do "<filmeAntigo>"
    Quando atualizo o filme para "<filmeNovo>"
    Entao o filme "<filmeNovo>" deve ser encontrado na lista
    Exemplos:
      | filmeAntigo | filmeNovo |
      | Top gun     | Barbies   |



