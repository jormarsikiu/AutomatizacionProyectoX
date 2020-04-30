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

//************************Open Top Menu**********************************************//
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//************************Select Sales Menu*************************************//
String botonSales = '$("a[href*=\'/dashboard/Sales/index/SAL-002\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonSales)

//************************Open Transacctions Draft Menu***********************************//
String botonTransacctions = '$("a[href*=\'/documents/transactioninvoice/index\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonTransacctions)

//************************Create Draft Form*************************************//
String createDraft = '$("a[href*=\'/Documents/TransactionInvoice/CreateInvoiceFormAsync\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(createDraft)

WebUI.waitForPageLoad(20)


//Código de cliente - Emite
String codclient =  '''$('#GetClientCode').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(codclient)
String openclient = '''$(".select2-hidden-accessible").select2("open")'''
CustomKeywords.'jquery.jquery_generic.execJS'(openclient)
String selectclient = "jQuery('.select2-hidden-accessible').select2().val('$client').get(0)"
CustomKeywords.'jquery.jquery_generic.execJS'(selectclient)

//Código de cliente - Receptor
String customer =  '''$('#customerDir').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(customer)
String opencustomer = '''$(".select2-hidden-accessible").select2("open")'''
CustomKeywords.'jquery.jquery_generic.execJS'(opencustomer)
String selectcustomer = "jQuery('.select2-hidden-accessible').select2().val('$customer').get(0)"
CustomKeywords.'jquery.jquery_generic.execJS'(selectcustomer)

//Fecha de borrador
String draftdate = "jQuery('#DraftDate').val('$draft_date')"
CustomKeywords.'jquery.jquery_generic.execJS'(draftdate)

//Fecha de vencimiento del borrador
String draftdatedue = "jQuery('#DraftDateDue').val('$draft_date_due')"
CustomKeywords.'jquery.jquery_generic.execJS'(draftdatedue)

//Boton de Agregar item
String buttonadd = '''$('#addItem').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(buttonadd)

//Boton Guardar
String buttonsave = '''$('.btn-outline-info').click())'''
CustomKeywords.'jquery.jquery_generic.execJS'(buttonsave)