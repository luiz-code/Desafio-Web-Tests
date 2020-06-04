$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pesquisar_item.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 4,
  "name": "Pesquisar item na lista",
  "description": "Eu como usuário do site magazine luiza\r\nDesejo validar o comportamento do site ao pesquisar produto na lista",
  "id": "pesquisar-item-na-lista",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Validar comportamento ao inserir dado do produto",
  "description": "",
  "id": "pesquisar-item-na-lista;validar-comportamento-ao-inserir-dado-do-produto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "Que usuário acessa website",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "Usuario pesquisa produto inserindo nome incorreto",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "Vejo mensagem de erro",
  "keyword": "Então "
});
formatter.step({
  "line": 12,
  "name": "Usuário pesquisa produto inserindo nome completo",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "Vejo usuário acessar página do produto",
  "keyword": "Então "
});
formatter.step({
  "line": 14,
  "name": "Usuário pesquisa produto inserindo código correto",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "Vejo usuário acessar também a página do produto",
  "keyword": "Então "
});
formatter.match({
  "location": "validar_pesquisa.Abrir_navegador()"
});
formatter.result({
  "duration": 12341703200,
  "status": "passed"
});
formatter.match({
  "location": "validar_pesquisa.Inserir_nome_incorreto()"
});
formatter.result({
  "duration": 6677957600,
  "status": "passed"
});
formatter.match({
  "location": "validar_pesquisa.Valida_mensagem_de_erro()"
});
formatter.result({
  "duration": 860397800,
  "status": "passed"
});
formatter.match({
  "location": "validar_pesquisa.Pesquisa_nome_produto()"
});
formatter.result({
  "duration": 6216269700,
  "status": "passed"
});
formatter.match({
  "location": "validar_pesquisa.Acessa_página_do_produto()"
});
formatter.result({
  "duration": 883956100,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat StepDefinitions.validar_pesquisa.Acessa_página_do_produto(validar_pesquisa.java:98)\r\n\tat ✽.Então Vejo usuário acessar página do produto(pesquisar_item.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "validar_pesquisa.Pesquisa_código_produto()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "validar_pesquisa.Novo_acesso_página_do_produto()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("validar_sacola.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 4,
  "name": "Validar sacola de compra",
  "description": "Eu como usuário do site magazine luiza, desejo verificar comportamento quando seleciono carrinho de compra",
  "id": "validar-sacola-de-compra",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Validar mensagem de carrinho sem item",
  "description": "",
  "id": "validar-sacola-de-compra;validar-mensagem-de-carrinho-sem-item",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 8,
  "name": "Que o usuário acessa o website",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "Usuário seleciona sacola sem item",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "Vejo sacola vazia",
  "keyword": "Então "
});
formatter.match({
  "location": "validar_sacola_vazia.Abrir_navegador()"
});
formatter.result({
  "duration": 7074899200,
  "status": "passed"
});
formatter.match({
  "location": "validar_sacola_vazia.Seleciona_sacola()"
});
formatter.result({
  "duration": 2772154500,
  "status": "passed"
});
formatter.match({
  "location": "validar_sacola_vazia.Sacola_sem_item()"
});
formatter.result({
  "duration": 5664511000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Selecionar produto específico",
  "description": "",
  "id": "validar-sacola-de-compra;selecionar-produto-específico",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 13,
  "name": "Que usuário acessa lista do produto",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "Seleciona produto específico",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "Usuário selecionar sacola",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "Vejo produto na sacola",
  "keyword": "Então "
});
formatter.match({
  "location": "validar_produto_na_sacola.Acesso_ao_produto()"
});
formatter.result({
  "duration": 8991938300,
  "status": "passed"
});
formatter.match({
  "location": "validar_produto_na_sacola.Seleciona_produto_específico()"
});
formatter.result({
  "duration": 228191000,
  "status": "passed"
});
formatter.match({
  "location": "validar_produto_na_sacola.Seleciona_sacola()"
});
formatter.result({
  "duration": 968835900,
  "status": "passed"
});
formatter.match({
  "location": "validar_produto_na_sacola.Valida_produto_na_sacola()"
});
formatter.result({
  "duration": 6835717700,
  "status": "passed"
});
});