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
import com.kms.katalon.core.logging.KeywordLogger

String validacion = '0'
String pagina_validacion = '0'

String alerta = "let user= jQuery('#tableUser tr').is(':contains($email)'); return user;"
Boolean bool_validate = CustomKeywords.'jquery.jquery_generic.execJS'(alerta)
print(bool_validate)

if(bool_validate==true){
	validacion = '1'
	
}else{

	int pagina = 2;
	while(bool_validate==false)
	{
		String siguiente = '''$('#tableUser_next').click()'''
		CustomKeywords.'jquery.jquery_generic.execJS'(siguiente)
		WebUI.delay(20)
		
		String alert2 = "let user2 = jQuery('#tableUser tr').is(':contains($email)'); return user2;"
		Boolean bool2 = CustomKeywords.'jquery.jquery_generic.execJS'(alert2)
		print(bool2)
		
		if(bool2==true){
			bool_validate=true
			WebUI.delay(3)
			validacion = '2'
			pagina_validacion=pagina
			pagina = pagina+1
			break;
		}
		else{
			bool_validate=false
			validacion='3'
			break;
		}
	}
}

WebUI.delay(5)
WebUI.closeBrowser()

if (validacion == '1')
{
	WebUI.comment('Automatización Exitosa: Usuario Creado visible en la pagina 1')
}
else if (validacion == '2')
{
	WebUI.comment('Automatización Exitosa: Usuario Creado visible en la pagina ${pagina_validacion}')
}
else if (validacion == '3')
{
	WebUI.comment('Automatización Fallida: Usuario No Creado No visible en el Index')
}
