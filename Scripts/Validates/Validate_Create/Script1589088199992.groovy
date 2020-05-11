import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/* EJEMPLO
 String tabla = '#tableUser'
 String valor = 'automated.test633@grupokaizen.net'
 String botonsiguiente = '#tableUser_next'
 String tipo =  'Usuario'
 */

String tabla = table
String valor = seachvalue
String botonsiguiente = buttonnext
String tipo = test

WebUI.delay(15)

//Buscar tabla en el index
String existe = "let elemento= (jQuery('$tabla').length > 0); return elemento;"
Boolean tabla_existe = CustomKeywords.'jquery.jquery_generic.execJS'(existe)
String validacion = '0'
int pagina_validacion = 0
int pagina = 0


//Si la tabla existe 
if (tabla_existe == true)
{
	//Buscar valor en la tabla
	String alerta = "let val= jQuery('$tabla tr').is(':contains($valor)'); return val;"
	Boolean bool_validate = CustomKeywords.'jquery.jquery_generic.execJS'(alerta)
	
	//Si el valor  encontrado esta en la pagina 1
	if(bool_validate==true){
		validacion = '1'
		pagina = 1
	
	//Si el valor no fue encontrado 
	}else{
		pagina = 1;
		int i=0
		//Mientras el valor no este en la pagina 1
		while(bool_validate==false)
		{	
			//Buscar el boton seguiente si esta inactivo
			String activenext="let next = jQuery('$botonsiguiente').is('.disabled'); return next;"
			Boolean next = CustomKeywords.'jquery.jquery_generic.execJS'(activenext)
			print(next)
			
			//Si el boton siguiente esta inactivo y el valor no fue encontrado validacion 3
			if (next==true){
				validacion = '3'
				bool_validate==true
				break;
			}
			//Si el boton siguiente esta activo 
			else{
				//Dale al boton siguiente 
				String siguiente = "jQuery('$botonsiguiente').click()"
				CustomKeywords.'jquery.jquery_generic.execJS'(siguiente)
				WebUI.delay(15)
				
				//Buscar en la tabla nueva el valor 		
				String alert2 = "let val2 = jQuery('$tabla tr').is(':contains($valor)'); return val2;"
				Boolean bool2 = CustomKeywords.'jquery.jquery_generic.execJS'(alert2)
				
				//Valores en donde esta la pagina
				i=i+1
				pagina_validacion=pagina+i
				
				//buscar si el boton siguiente esta desactivado 
				String activenext2="let next = jQuery('$botonsiguiente').is('.disabled'); return next;"
				String next2 = CustomKeywords.'jquery.jquery_generic.execJS'(activenext2)
				
				//Si el valor fue encontrado la validacion es 2
				if(bool2==true){
					bool_validate=true
					WebUI.delay(3)
					validacion = '2'
					
				}//Si el boton siguiente esta desactivo la validacion es 3 y se sale
				else if(next2==true){
					validacion = '3'
					bool_validate=true
					break;
				}
			}
			
		}
		
	}
	
	WebUI.delay(5)
	WebUI.closeBrowser()
	
	
	if (validacion == '1')
	{
		WebUI.comment('Automatización Exitosa: '+tipo+' Creado en pagina 1')
	}
	else if (validacion == '2')
	{
		WebUI.comment('Automatización Exitosa: '+tipo+' Creado en pagina ' +pagina_validacion)
	}
	else if (validacion == '3')
	{
		WebUI.comment('Automatización Fallida: '+tipo+' No encontrado en el Index')
	}
	
}
else{
	
	WebUI.comment('Automatización Fallida:  '+tipo+' No fue guardado')
}