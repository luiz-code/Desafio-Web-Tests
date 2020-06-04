#language:pt

@run
Funcionalidade: Pesquisar item na lista
  Eu como usuário do site magazine luiza
  Desejo validar o comportamento do site ao pesquisar produto na lista

  Cenário: Validar comportamento ao inserir dado do produto
    Dado    Que usuário acessa website
    Quando  Usuario pesquisa produto inserindo nome incorreto
    Então   Vejo mensagem de erro
    Quando  Usuário pesquisa produto inserindo nome completo
    Então   Vejo usuário acessar página do produto
    Quando  Usuário pesquisa produto inserindo código correto
    Então   Vejo usuário acessar também a página do produto