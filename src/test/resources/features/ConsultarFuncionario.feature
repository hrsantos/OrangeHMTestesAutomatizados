#language: pt
#enconding: UTF-8
@consultarFuncionario
Funcionalidade: Consultar funcionario cadastrado

  Cenario: consultar funcionario
		Quando eu clicar na aba admin
		E eu clicar na aba pim
		E eu clicar na no link employee list
		E informar no campo employee name "Fiona Grace"
		E clicar no botao search 
		Entao o sistema ira exibir os funcionarios "Fiona"