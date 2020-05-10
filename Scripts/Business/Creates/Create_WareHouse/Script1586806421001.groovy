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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

//************************Open Top Menu**********************************************//
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//************************Select Bussiness Menu*************************************//
String botonBussiness = '$("a[href*=\'/dashboard/Business/index/MAP-003\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonBussiness)

//************************Open WareHouse Menu Menu***********************************//
String createWareHouse = '$("a[href*=\'/Management/WareHouse\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(createWareHouse)

//************************Create WareHouse Form*************************************//
String botonWareHouse = '$("a[href*=\'/Management/Warehouse/Form\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonWareHouse)

WebUI.waitForPageLoad(20)

//****************************Full Form 1 Almacen*****************************************//
//Almacen 
String wareHouseCode_bp = "jQuery('#WareHouseCode').val('$wareHouseCode')"

CustomKeywords.'jquery.jquery_generic.execJS'(wareHouseCode_bp)

//Nombre
String wareHousename_bp = "jQuery('#WareHouseName').val('$wareHouseName')"

CustomKeywords.'jquery.jquery_generic.execJS'(wareHousename_bp)

//Codigo de tipo de entidad
String open_entity_bp = '$("#EntityTypeCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_entity_bp)

WebUI.delay(3)

String entity_bp = 'jQuery(\'#select2-EntityTypeCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(entity_bp)

//Nombre Corto
String shortName_bp = "jQuery('#ShortName').val('$shortName').change()"

CustomKeywords.'jquery.jquery_generic.execJS'(shortName_bp)

if (status == '0') {
    String status = '$(\'#IsActive\').click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(status)
}

//****************************Full Form 1 Direccion*****************************************//
WebUI.delay(3)

//Open +
String botonaddress = '$("a[href*=\'/Management/Warehouse/_Address\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonaddress)

WebUI.delay(3)

//Pais
String open_country = '$("#CountryCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_country)

WebUI.delay(3)

String select_country = 'jQuery(\'#select2-CountryCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(select_country)

//Region
String open_county = '$("#CountyCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_county)

WebUI.delay(3)

String select_county = 'jQuery(\'#select2-CountyCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(select_county)

//Estado
String open_state = '$("#StateCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_state)

WebUI.delay(3)

String select_state = 'jQuery(\'#select2-StateCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(select_state)

//Municipio
String open_townshipCode = '$("#TownshipCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_townshipCode)

WebUI.delay(3)

String select_stownshipCode = 'jQuery(\'#select2-TownshipCode-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(select_stownshipCode)

//Direccion1
String address1_bp = "jQuery('#Address1').val('$address1')"

CustomKeywords.'jquery.jquery_generic.execJS'(address1_bp)

//Direccion 2
String address2_bp = "jQuery('#Address2').val('$address2')"

CustomKeywords.'jquery.jquery_generic.execJS'(address2_bp)

//Direccion 3
String address3_bp = "jQuery('#Address3').val('$address3')"

CustomKeywords.'jquery.jquery_generic.execJS'(address3_bp)

//Ciudad
String townName_bp = "jQuery('#TownName').val('$townName')"

CustomKeywords.'jquery.jquery_generic.execJS'(townName_bp)

//Latitud
String latitude_bp = "jQuery('#Latitude').val('$latitude')"

CustomKeywords.'jquery.jquery_generic.execJS'(latitude_bp)

//Longitud
String long_bp = "jQuery('#Length').val('$longitud')"

CustomKeywords.'jquery.jquery_generic.execJS'(long_bp)

//zip
String zipcode_bp = "jQuery('#ZipCode').val('$zipcode')"

CustomKeywords.'jquery.jquery_generic.execJS'(zipcode_bp)

//Aceptar
String butonacept_bp1 = '$(".btn-success")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp1)

//****************************Full Form 1 Grupo*****************************************//
//open +
String botongrups = '$("a[href*=\'/Management/Warehouse/_EntityGroups\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botongrups)

WebUI.delay(3)

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
String butonacept_bp2 = '$(".btn-success")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp2)

//****************************Full Form 1 Adicionales*****************************************//
//Condicion Comercial (1)
String open_businessCondition = '$("#selectBusinessCondition").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_businessCondition)

WebUI.delay(3)

String businessCondition1 = 'jQuery(\'#select2-selectBusinessCondition-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(businessCondition1)

//Condicion Comercial (2)
CustomKeywords.'jquery.jquery_generic.execJS'(open_businessCondition)

WebUI.delay(3)

String businessCondition2 = 'jQuery(\'#select2-selectBusinessCondition-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(businessCondition2)

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

//Guardar
String butonsave = '$(".pull-right").click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonsave)

//**********************Validacion********************************//
WebUI.callTestCase(findTestCase('Validates'), [('test') : 'Almacen', ('seachvalue') : wareHouseCode, ('table') : '#tableWareHouse', ('buttonnext') : '#tableWareHouse_next'],
	FailureHandling.STOP_ON_FAILURE)
