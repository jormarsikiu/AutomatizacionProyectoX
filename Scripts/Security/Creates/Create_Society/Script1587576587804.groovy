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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.waitForPageLoad(20)

//**********Open Setting-Addministration-Society***********************//
String menu_crear_society = '$("a[href*=\'society/Index\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(menu_crear_society)

//********************Open form Society**********************//
String form_crear_society = '''$("a[href*=\'/Settings/Society/CreateSociety\']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(form_crear_society)

WebUI.delay(5)

String modal = WebUI.executeJavaScript('return document.getElementById("IdFormCreateModal").style.display;', null)

if (modal == 'block') {
    //****************************Full Form 1*****************************************//
	
    String code_s = "jQuery('#EntityCode').val('$code')"

    CustomKeywords.'jquery.jquery_generic.execJS'(code_s)

    String societyName_s = "jQuery('#SocietyName').val('$societyName')"

    CustomKeywords.'jquery.jquery_generic.execJS'(societyName_s)

    String shortName_s = "jQuery('#ShortName').val('$shortName')"

    CustomKeywords.'jquery.jquery_generic.execJS'(shortName_s)

    String comercial_s = "jQuery('#ComercialActivity').val('$comercialActivity')"

    CustomKeywords.'jquery.jquery_generic.execJS'(comercial_s)

    String corporation_s = "jQuery('#Corporation').val('$corporation')"

    CustomKeywords.'jquery.jquery_generic.execJS'(corporation_s)

    WebUI.uploadFile(findTestObject('Object Repository/Page_Panel Security/File'), rutaImage)

    String open_icon_s = '$("#Icon").select2("open")'

    CustomKeywords.'jquery.jquery_generic.execJS'(open_icon_s)

    String icon_s = 'jQuery(\'#select2-Icon-results li\').first().trigger({type:\'mouseup\'});'

    CustomKeywords.'jquery.jquery_generic.execJS'(icon_s)

    if (status == '0') {
        String status = '$(\'.switchery-small\').click()'

        CustomKeywords.'jquery.jquery_generic.execJS'(status)
    }
    
    String next = '$("a[href*=\'next\']")[0].click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(next)

    //****************************Full Form 2*****************************************//
    //Pais
    String open_country = '$("#CountryCode").select2("open")'

    CustomKeywords.'jquery.jquery_generic.execJS'(open_country)

    WebUI.delay(3)

    String select_country = 'jQuery(\'#select2-CountryCode-results li\').first().trigger({type:\'mouseup\'});'

    CustomKeywords.'jquery.jquery_generic.execJS'(select_country)

    //Region
    String open_county = '$("#CountyCode").select2("open")'

    CustomKeywords.'jquery.jquery_generic.execJS'(open_county)

    WebUI.delay(3)

    String select_county = 'jQuery(\'#select2-CountyCode-results li\').first().trigger({type:\'mouseup\'});'

    CustomKeywords.'jquery.jquery_generic.execJS'(select_county)

    //Estado
    String open_state = '$("#StateCode").select2("open")'

    CustomKeywords.'jquery.jquery_generic.execJS'(open_state)

    WebUI.delay(3)

    String select_state = 'jQuery(\'#select2-StateCode-results li\').first().trigger({type:\'mouseup\'});'

    CustomKeywords.'jquery.jquery_generic.execJS'(select_state)

    //Municipio
    String open_townshipCode = '$("#TownshipCode").select2("open")'

    CustomKeywords.'jquery.jquery_generic.execJS'(open_townshipCode)

    WebUI.delay(3)

    String select_stownshipCode = 'jQuery(\'#select2-TownshipCode-results li\').first().trigger({type:\'mouseup\'});'

    CustomKeywords.'jquery.jquery_generic.execJS'(select_stownshipCode)

    //zip
    String zipcode_bp = "jQuery('#ZipCode').val('$zipcode')"

    CustomKeywords.'jquery.jquery_generic.execJS'(zipcode_bp)

    CustomKeywords.'jquery.jquery_generic.execJS'(next)

    //****************************Full Form 3*****************************************//
    String townName_s = "jQuery('#TownName').val('$townName')"

    CustomKeywords.'jquery.jquery_generic.execJS'(townName_s)

    String fiscalAddress_s = "jQuery('#FiscalAddress').val('$fiscalAddress')"

    CustomKeywords.'jquery.jquery_generic.execJS'(fiscalAddress_s)

    String complementaryAddress_s = "jQuery('#ComplementaryAddress').val('$complementaryAddress')"

    CustomKeywords.'jquery.jquery_generic.execJS'(complementaryAddress_s)

    String taxAddress_s = "jQuery('#TaxAddress').val('$taxAddress')"

    CustomKeywords.'jquery.jquery_generic.execJS'(taxAddress_s)

    String finish = '$("a[href*=\'finish\']")[0].click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(finish)
}


//**********************Validacion********************************//
WebUI.delay(10)
//Si existe la tabla
String existe = "let elemento= (jQuery('#SocietiesTable').length > 0); return elemento;"
Boolean elemento_existe = CustomKeywords.'jquery.jquery_generic.execJS'(existe)

if (elemento_existe == true)
{
	String validacion = '0'
	String pagina_validacion = '0'
	
	String alerta = "let user= jQuery('#SocietiesTable tr').is(':contains($societyName)'); return user;"
	Boolean bool_validate = CustomKeywords.'jquery.jquery_generic.execJS'(alerta)
	print(bool_validate)
	
	if(bool_validate==true){
		validacion = '1'
		
	}else{
	
		int pagina = 2;
		while(bool_validate==false)
		{
			String siguiente = '''$('#SocietiesTable_next').click()'''
			CustomKeywords.'jquery.jquery_generic.execJS'(siguiente)
			WebUI.delay(20)
			
			String alert2 = "let user2 = jQuery('#SocietiesTable tr').is(':contains($email)'); return user2;"
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
		WebUI.comment('Automatización Exitosa: Sociedad Creada visible en pagina 1')
	}
	else if (validacion == '2')
	{
		
		WebUI.comment('Automatización Exitosa: Sociedad Creada visible en pagina ${pagina_validacion} ') 
	}
	else if (validacion == '3')
	{
		WebUI.comment('Automatización Fallida: Sociedad no encontrada en el Index')
	}

}
else{
	
	WebUI.comment('Automatización Fallida: Articulo No fue guardado')
}
