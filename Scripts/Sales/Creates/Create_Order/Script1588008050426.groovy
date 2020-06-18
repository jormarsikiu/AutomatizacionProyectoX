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

//************************Select Documents Menu*************************************//
String openDocuments = '$(".fa.fa-book").click()'
CustomKeywords.'jquery.jquery_generic.execJS'(openDocuments)

//************************Select Transactions Menu*************************************//
String openTransaction = '$(".fa.fa-credit-card").click()'
CustomKeywords.'jquery.jquery_generic.execJS'(openTransaction)


//************************Open Transacctions Order Menu***********************************//
String botonTransacctions = '$("a[href*=\'/documents/transactionorder\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonTransacctions)

//************************Create Order Form*************************************//
String createDraft = '$("a[href*=\'/Documents/TransactionOrder/CreateOrderFormAsync\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(createDraft)

WebUI.waitForPageLoad(20)

//NO ABRE EL MODAL