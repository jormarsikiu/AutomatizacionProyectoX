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

/*Dayana tomar elementos de selects*/
/*
WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_codigo_entidad'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_ApplicationName'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_ShortName'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_Versin_Version'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_color_fondo_Style'), 'ffff')

WebUI.setText(findTestObject('Object Repository/Page_Panel Administration/ap_input_Ruta URL_Url'), '/area/1')

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_input_Choose a item'))

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_input_span_Desktop'))

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_input_span_Choose a item_1'))

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_input_span_Music'))

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_input_small'))

WebUI.click(findTestObject('Object Repository/Page_Panel Administration/ap_button_Limpiar'))

WebUI.closeBrowser()
*/
