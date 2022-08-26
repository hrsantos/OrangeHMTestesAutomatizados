
#language: pt
#enconding: UTF-8

@cadastrarFuncionario
Funcionalidade: CadastrarFuncionario

Cenario: cadastrar funcionario
	Quando eu clicar na aba PIM
	E eu clicar no botao add
	E informar no campo first name "Tester01"
	E informar no campo middle name "T1"
	E informar no campo last name "T1"
	E clicar no botao save
	Entao o sistema cadastra o usuario "Tester01"