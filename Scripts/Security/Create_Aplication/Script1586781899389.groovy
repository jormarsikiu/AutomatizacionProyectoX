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
import org.openqa.selenium.Keys as Keys

WebUI.waitForPageLoad(20)

//**********Open Setting-Addministration-Aplication***********************//
String menu_crear_aplication = '''$("a[href*='Application/Index']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(menu_crear_aplication)

//********************Open form Application**********************//
String crear_aplication = "jQuery('#IdFormCreateApplication').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(crear_aplication)

WebUI.delay(3)

//****************************Full Form 1*****************************************//

String entitycode_ca = "jQuery(\'#EntityCode\').val('$entitycode')"
CustomKeywords.'jquery.jquery_generic.execJS'(entitycode_ca)

String applicationname_ca = "jQuery(\'#ApplicationName\').val('$applicationname')"
CustomKeywords.'jquery.jquery_generic.execJS'(applicationname_ca)

String shortname_ca = "jQuery(\'#ShortName\').val('$shortname')"
CustomKeywords.'jquery.jquery_generic.execJS'(shortname_ca)

String version_ca = "jQuery(\'#Version\').val('$version')"
CustomKeywords.'jquery.jquery_generic.execJS'(version_ca)

String colorfondo_ca = "jQuery(\'#Style\').val('$colorfondo')"
CustomKeywords.'jquery.jquery_generic.execJS'(colorfondo_ca)

String url_ca = "jQuery(\'#Url\').val('$url')"
CustomKeywords.'jquery.jquery_generic.execJS'(url_ca)

/*Opcional Cels*/
Strint ruta =  'C:\\Users\\kaizen\\git\\AutomatizacionProyectoX\\Image\\1.png'
WebUI.uploadFile(findTestObject('#File'), ruta)

String tipoaplicacion_ca = "jQuery(\'.select2-search__field\').val('$typeaplication').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(tipoaplicacion_ca)

String icon_ca = "jQuery(\'.select2-search__field\').val('$icon').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(icon_ca)

/*
String botonGuardar= '''$('.btn-outline-success').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonGuardar)
*/

