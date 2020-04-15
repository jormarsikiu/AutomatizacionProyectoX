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

//Open Top Menu
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//Select Bussiness Menu
String botonBussiness = '''$("a[href*='/dashboard/Business/index/MAP-003']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonBussiness)

//Open Item Menu
String botonItem= '''$("a[href*='/Management/Item']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonItem)

//Open Item Form
String botonform= '''$("a[href*='/Management/Item/_ItemForm']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonform)


//****************************Full Form 1*****************************************//

//Código del tipo de entidad
String entity_bi = "jQuery('#EntityTypeCode').val('$entityCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(entity_bi)

//Código
String itemcode_bi = "jQuery('#ItemCode').val('$itemcode')"
CustomKeywords.'jquery.jquery_generic.execJS'(itemcode_bi)

//Nombre
String itemName_bi = "jQuery('#ItemName').val('$itemName')"
CustomKeywords.'jquery.jquery_generic.execJS'(itemName_bi)

//Nombre corto
String shortName_bi = "jQuery('#ShortName').val('$shortName')"
CustomKeywords.'jquery.jquery_generic.execJS'(shortName_bi)

//SKU
String SKU_bi = "jQuery('#SKU').val('$SKU')"
CustomKeywords.'jquery.jquery_generic.execJS'(SKU_bi)

//Fecha de venta
String saleDate_bi = "jQuery('#SaleDate').val('$saleDate')"
CustomKeywords.'jquery.jquery_generic.execJS'(saleDate_bi)

//Precio de venta
String salesPrice_bi = "jQuery('#SalesPrice').val('$salesPrice')"
CustomKeywords.'jquery.jquery_generic.execJS'(salesPrice_bi)

//Precio de costo
String costPrice_bi = "jQuery('#CostPrice').val('$costPrice')"
CustomKeywords.'jquery.jquery_generic.execJS'(costPrice_bi)

//Punto de pedido
String reorderPoint_bi = "jQuery('#ReorderPoint').val('$reorderPoint')"
CustomKeywords.'jquery.jquery_generic.execJS'(reorderPoint_bi)

//Status
if (status == '0'){
	String status_bi = '''$('#IsActive').click()'''
	CustomKeywords.'jquery.jquery_generic.execJS'(status_bi)
}

//En venta
if (forSale == '0'){
	String forSale_bi = '''$('#ForSale').click()'''
	CustomKeywords.'jquery.jquery_generic.execJS'(forSale_bi)
}

//Sujeto a impuesto 
if (isTaxable == '0'){
	String isTaxable_bi = '''$('#IsTaxable').click()'''
	CustomKeywords.'jquery.jquery_generic.execJS'(isTaxable_bi)
}


//****************************Full Form 1 Grups****************************************//
String botonform= '''$("a[href*='/Management/Item/_EntityGroups']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonform)


//****************************Full Form 1 ListPrices*****************************************//
String botonform= '''$("a[href*='/Management/Item/_PriceList']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonform)

//****************************Full Form 1 Adicionales*****************************************//

//Atributos de Entidad
String attributes_bp1 = "jQuery('#selectAttributes').val('$attributes1').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp1)

String attributes_bp2 = "jQuery('#selectAttributes').val('$attributes2').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp2)

//Almacen
String warehouse_bp = "jQuery('#selectWarehouse').val('$warehouse').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(warehouse_bp)

//Guardar
String butonsave= '$(".pull-right").click()'
CustomKeywords.'jquery.jquery_generic.execJS'(butonsave)



