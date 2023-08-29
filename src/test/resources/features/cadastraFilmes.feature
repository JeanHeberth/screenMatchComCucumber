#language: pt
Funcionalidade: Cadastrando novo filme

#
#  Scenario: Um usuário válido consegue se cadastrar um novo filme
#    Given o usuário válido
#    When cadastro um novo filme
#    Then é redirecionado para a página de filmes


  Esquema do Cenário: Cadastrando um filme válido
  Dado que estou na pagina de cadastrar filme
  Quando cadastro o filme com o nome de '<nomeDoFilme>' duração <duracao> ano <ano> e genero '<genero>'
  Entao é redirecionado para a página de filmes
  Exemplos:
  | nomeDoFilme          | duracao | ano  | genero   |
  | Top gun              | 180     | 2020 | Ação     |
  | Velozes e furiosos   | 180     | 2020 | Ação     |
  | O amor sempre espera | 180     | 2020 | Romance  |
  | O Grito              | 180     | 2020 | Suspense |



