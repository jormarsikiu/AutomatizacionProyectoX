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

//Open Top Menu
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//Select Bussiness Menu
String botonBussiness = '$("a[href*=\'/dashboard/Business/index/MAP-003\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonBussiness)

//Open Item Menu
String botonItem = '$("a[href*=\'/Management/Item\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonItem)

//Open Item Edit





//****************************Full Form 1*****************************************//
//Código del tipo de entidad
String open_entity_bp = '$("#EntityTypeCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_entity_bp)

WebUI.delay(3)

String entity_bp = 'jQuery(\'#select2-EntityTypeCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(entity_bp)

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
if (status == '0') {
	String status_bi = '$(\'#IsActive\').click()'

	CustomKeywords.'jquery.jquery_generic.execJS'(status_bi)
}

//En venta
if (forSale == '0') {
	String forSale_bi = '$(\'#ForSale\').click()'

	CustomKeywords.'jquery.jquery_generic.execJS'(forSale_bi)
}

//Sujeto a impuesto
if (isTaxable == '0') {
	String isTaxable_bi = '$(\'#IsTaxable\').click()'

	CustomKeywords.'jquery.jquery_generic.execJS'(isTaxable_bi)
}

//****************************Full Form 1 Grups****************************************//
String botongroups = '$("a[href*=\'/Management/Item/_EntityGroups\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botongroups)

WebUI.delay(5)

//Registro padre
String open_parentGroup = '$("#selectParentGroups").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_parentGroup)

WebUI.delay(3)

String parentGroup_bp = 'jQuery(\'#select2-selectParentGroups-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(parentGroup_bp)

//Registro hijo
String open_childrenGroups = '$("#selectChildrenGroups").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_childrenGroups)

WebUI.delay(3)

String childrenGroups_bp = 'jQuery(\'#select2-selectChildrenGroups-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(childrenGroups_bp)

//Aceptar
String butonacept_bp1 = '$(".btn-success")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp1)

//****************************Full Form 1 ListPrices*****************************************//
String botonprices = '$("a[href*=\'/Management/Item/_PriceList\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonprices)

//Lista de precios
String open_priceListCode = '$("#PriceListCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_priceListCode)

WebUI.delay(3)

String priceListCode_bi = 'jQuery(\'#select2-PriceListCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(priceListCode_bi)

//Aceptar
String butonacept_bp2 = '$(".btn-success")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp2)

//****************************Full Form 1 Adicionales*****************************************//
//Atributo Entidad (1)
String open_attributes1 = '$("#selectAttributes").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_attributes1)

WebUI.delay(3)

String attributes_bp1 = 'jQuery(\'#select2-selectAttributes-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp1)

//Atributo Entidad (2)
String open_attributes2 = '$("#selectAttributes").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_attributes2)

WebUI.delay(3)

String attributes_bp2 = 'jQuery(\'#select2-selectAttributes-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp2)

//Almacen
String open_warehouse = '$("#selectWarehouse").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_warehouse)

WebUI.delay(3)

String warehouse_bp = 'jQuery(\'#select2-selectWarehouse-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(warehouse_bp)

//Guardar
String butonsave = '$(".pull-right").click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonsave)

//**********************Validacion********************************//
//Se verifica en el index si se cambio el nombre del articulo
String elemento_a_verificar = itemName

WebUI.callTestCase(findTestCase('Validates_Edits'), [('test') : 'Articulo', ('seachvalue') : elemento_a_verificar, ('table') : '#tableItem', ('buttonnext') : '#tableItem_next'],
	FailureHandling.STOP_ON_FAILURE)
