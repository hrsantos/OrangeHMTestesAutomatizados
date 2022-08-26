#language: pt
#enconding: UTF-8
Funcionalidade: Logar no sistema

  Cenario: fazer login
    Quando eu informar no campo username "Admin"
    E eu informar no campo password "admin123"
    E eu clicar no botao login
    Entao o sistema apresenta o usuario logado

  Cenario: usuario invalido
    Quando eu informar no campo username "Ad"
    E eu informar no campo password "Blabla"
    E eu clicar no botao login
    Entao o sistema apresenta a mensagem invalid credencials
