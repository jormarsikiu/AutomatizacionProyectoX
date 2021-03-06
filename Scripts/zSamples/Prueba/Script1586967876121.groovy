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

Date date = new Date()

String datePart = date.format('yyyy/MM/dd')

String edit = "jQuery('#IDNombre').val('$datePart')"

CustomKeywords.'jquery.jquery_generic.execJS'(edit)

//Imprimir alerta

String alerta = '\n\t\n\treturn false;\n\t'

Boolean var1 = CustomKeywords.'jquery.jquery_generic.execJS'(alertas)

if (var1==true){
	
	WebUI.executeJavaScript('alert(\'True\')', null)
	
	WebUI.delay(3)
}
else{
	WebUI.executeJavaScript('alert(\'False\')', null)
	
	WebUI.delay(3)
}
/*

$("#select2-CountryCode-results li:contains(Venezuela)").trigger({type:'mouseup'});
$("#select2-CountyCode-results li:contains(Capital)").trigger({type:'mouseup'});
$("#select2-StateCode-results li:contains(Miranda)").trigger({type:'mouseup'});
$("#select2-TownshipCode-results li:contains(Municipio Baruta)").trigger({type:'mouseup'});

$("#select2-selectParentAccounting-results li:contains(P Facturation)").trigger({type:'mouseup'});
$("#select2-selectChildrenAccounting-results li:contains(P Semestraly)").trigger({type:'mouseup'});

$("#select2-selectParentGroups-results li:contains(Unit conversion)").trigger({type:'mouseup'});
$("#select2-selectChildrenGroups-results li:contains(Energy)").trigger({type:'mouseup'});

$("#select2-selectAttributes-results li:contains(Packaged product)").trigger({type:'mouseup'});

*/