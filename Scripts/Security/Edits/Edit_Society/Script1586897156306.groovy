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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

//**********Open Setting-Addministration-Society***********************//
String menu_society = '''$("a[href*='society/Index']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(menu_society)

//********************Open Edit Society**********************//

WebUI.delay(5)
String id1 = 'a[href*=\"/Settings/Society/Edit?code='
String id2 = code
String id3 = '\"]'
String id4 = (id1 + id2) + id3 
String edit_society= "jQuery('$id4')[0].click()"
print(edit_society + '\n')

CustomKeywords.'jquery.jquery_generic.execJS'(edit_society)


String modal = WebUI.executeJavaScript('return document.getElementById("IdFormCreateModal").style.display;', null)
if (modal == 'block'){

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
	
    String icon_s = '$("#Icon").val($("#Icon option:eq(1)").val());'
    CustomKeywords.'jquery.jquery_generic.execJS'(icon_s)
	
	
	if (status == '0'){
		String status = '''$('.switchery-small').click()'''
		CustomKeywords.'jquery.jquery_generic.execJS'(status)
	}
	
	String next = '$("a[href*=\'next\']")[0].click()'	
	CustomKeywords.'jquery.jquery_generic.execJS'(next)
	
	//****************************Full Form 2*****************************************//
	
	//Pais
	String open_country = '''$("#CountryCode").select2("open")'''
	CustomKeywords.'jquery.jquery_generic.execJS'(open_country)
	WebUI.delay(3)
	String select_country = "jQuery('#select2-CountryCode-results li').last().trigger({type:'mouseup'});"
	CustomKeywords.'jquery.jquery_generic.execJS'(select_country)
	
	//Region
	String open_county = '''$("#CountyCode").select2("open")'''
	CustomKeywords.'jquery.jquery_generic.execJS'(open_county)
	WebUI.delay(3)
	String select_county = "jQuery('#select2-CountyCode-results li').last().trigger({type:'mouseup'});"
	CustomKeywords.'jquery.jquery_generic.execJS'(select_county)
	
	//Estado
	String open_state = '''$("#StateCode").select2("open")'''
	CustomKeywords.'jquery.jquery_generic.execJS'(open_state)
	WebUI.delay(3)
	String select_state = "jQuery('#select2-StateCode-results li').last().trigger({type:'mouseup'});"
	CustomKeywords.'jquery.jquery_generic.execJS'(select_state)
	
	//Municipio
	String open_townshipCode = '''$("#TownshipCode").select2("open")'''
	CustomKeywords.'jquery.jquery_generic.execJS'(open_townshipCode)
	WebUI.delay(3)
	String select_stownshipCode = "jQuery('#select2-TownshipCode-results li').last().trigger({type:'mouseup'});"
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

/***********************Verification**************************/
//Se verifica en el index si se cambio el nombre de la sociedad
String elemento_a_verificar = societyName

WebUI.callTestCase(findTestCase('Validates_Edits'), [('test') : 'Sociedad', ('seachvalue') : elemento_a_verificar, ('table') : '#SocietiesTable', ('buttonnext') : '#SocietiesTable_next'],
	FailureHandling.STOP_ON_FAILURE)
