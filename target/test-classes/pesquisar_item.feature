#language:pt

@run
Funcionalidade: Pesquisar item na lista
  Eu como usuário do site magazine luiza
  Desejo validar o comportamento do site ao pesquisar produto na lista

  Cenário: Validar comportamento ao inserir dado do produto
    Dado    Que usuario acessa website
    Quando  Usuario pesquisa produto inserindo dado incorreto
    Então   Vejo mensagem de erro
    Quando  Usuario pesquisa produto inserindo dado correto
    Então   Vejo usuario acessar página do produto
