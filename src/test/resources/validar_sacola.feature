#language:pt

@run
Funcionalidade: Validar sacola de compra
  Eu como usuário do site magazine luiza, desejo verificar comportamento quando seleciono carrinho de compra

  Cenário: Validar mensagem de carrinho sem item
    Dado    Que o usuário acessa o website
    Quando  Usuário seleciona sacola sem item
    Então   Vejo sacola vazia

  Cenário: Selecionar produto específico
    Dado    Que usuário acessa lista do produto
    E       Seleciona produto específico
    Quando  Usuário selecionar sacola
    Então   Vejo produto na saco