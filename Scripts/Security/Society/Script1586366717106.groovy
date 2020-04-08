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

WebUI.waitForPageLoad(20)

//**********Open Setting-Addministration-Aplication***********************//
String menu_crear_aplication = '''$("a[href*='society/Index']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(menu_crear_aplication)

//********************Open form Application**********************//
String crear_aplication = "jQuery('#IdFormCreateSociety').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(crear_aplication)

WebUI.delay(3)

//****************************Full Form 1*****************************************//

String code_s = "jQuery(\'#SocietyFormModel_EntityCode\').val('$code')"
CustomKeywords.'jquery.jquery_generic.execJS'(code_s)

String societyName_s = "jQuery(\'#SocietyFormModel_SocietyName\').val('$societyName')"
CustomKeywords.'jquery.jquery_generic.execJS'(societyName_s)

String shortName_s = "jQuery(\'#SocietyFormModel_ShortName\').val('$shortName')"
CustomKeywords.'jquery.jquery_generic.execJS'(shortName_s)

String comercial_s = "jQuery(\'#SocietyFormModel_ComercialActivity\').val('$comercialActivity')"
CustomKeywords.'jquery.jquery_generic.execJS'(comercial_s)

String corporation_s = "jQuery(\'#SocietyFormModel_Corporation\').val('$corporation')"
CustomKeywords.'jquery.jquery_generic.execJS'(corporation_s)

Strint ruta =  'C:\\Users\\kaizen\\git\\AutomatizacionProyectoX\\Image\\1.png'
WebUI.uploadFile(findTestObject('#File'), ruta)

String icon_s = "jQuery(\'#SocietyFormModel_Icon\').val('$icon').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(icon_s)

/*Descomente para desactivar Status
String status = '''$('.switchery-small').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(status)
*/

String next = '''$("a[href*='next']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(next)

//****************************Full Form 2*****************************************//

String countryCode_s = "jQuery(\'#Codes_CountryCode\').val('$countryCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(countryCode_s)

String countyCode_s = "jQuery(\'#Codes_CountyCode\').val('$countyCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(countyCode_s)

String stateCode_s  = "jQuery(\'#Codes_StateCode\').val('$stateCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(stateCode_s)

String townshipCode_s = "jQuery(\'#Codes_TownshipCode\').val('$townshipCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(townshipCode_s)

String zip_s = "jQuery(\'#SocietyFormModel_ZipCode\').val('$zipcode')" 
CustomKeywords.'jquery.jquery_generic.execJS'(zip_s)

String next = '''$("a[href*='next']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(next)

//****************************Full Form 3*****************************************//

String townName_s = "jQuery(\'#SocietyFormModel_TownName\').val('$townName')"
CustomKeywords.'jquery.jquery_generic.execJS'(townName_s)

String fiscalAddress_s = "jQuery(\'#SocietyFormModel_FiscalAddress\').val('$fiscalAddress')"
CustomKeywords.'jquery.jquery_generic.execJS'(fiscalAddress_s)

String complementaryAddress_s = "jQuery(\'#SocietyFormModel_ComplementaryAddress\').val('$complementaryAddress')"
CustomKeywords.'jquery.jquery_generic.execJS'(complementaryAddress_s)
 
String taxAddress_s = "jQuery(\'#SocietyFormModel_TaxAddress\').val('$taxAddress')"
CustomKeywords.'jquery.jquery_generic.execJS'(taxAddress_s)

String finish = '''$("a[href*='finish']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(finish)
