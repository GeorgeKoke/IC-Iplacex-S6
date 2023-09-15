Feature: Realizacion de casos ingresando nombre de usuario y contraseña
	Scenario: varificacion de ingreso de sesion
	Given Abrir Chrome
	When ingresa Username "georgeKoke" y Password "admin123"
	Then inicia sesion

	Scenario: varificacion de ingreso de sesion con credenciales erroneas
	Given Abrir Chrome
	When ingresa Username "juanperez" y Password "contraseña123"
	Then inicia sesion
	
	Scenario: varificacion de ingreso de sesion con credenciales vacias
	Given Abrir Chrome
	When ingresa Username "" y Password ""
	Then inicia sesion