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

//Open Top Menu
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//Select Bussiness Menu
String botonBussiness = '''$("a[href*='/dashboard/Business/index/MAP-003']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonBussiness)

//Open Bussiness Partner Menu
String botonBusinessPartner = '''$("a[href*='/Management/BusinessPartner']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonBusinessPartner)

//Create Bussiness Partner Menu
String createBusinessPartner = '''$("a[href*='/Management/BusinessPartner/Form']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(createBusinessPartner)

//Full Form - Address

String code_bp = "jQuery(\'#PartnerCode\').val('$Code')" 
CustomKeywords.'jquery.jquery_generic.execJS'(code_bp)

String taxCode_bp = "jQuery(\'#TaxCode\').val('$taxCode')" 
CustomKeywords.'jquery.jquery_generic.execJS'(taxCode_bp)

String pname_bp = "jQuery(\'#PartnerName\').val('$partnerName')" 
CustomKeywords.'jquery.jquery_generic.execJS'(pname_bp)

String shortname_bp = "jQuery(\'#ShortName\').val('$shortName')" 
CustomKeywords.'jquery.jquery_generic.execJS'(shortname_bp)

String comercial_bp = "jQuery(\'#ComercialActivity\').val('$comercialActivity')" 
CustomKeywords.'jquery.jquery_generic.execJS'(comercial_bp)


