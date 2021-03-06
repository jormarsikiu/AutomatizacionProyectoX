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

//************************Login**********************************************//
WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(20)

//************************Open Top Menu**********************************************//
String botonmenu = 'jQuery(\'.ti-layout-menu-v\').parent().click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonmenu)

//************************Select Bussiness Menu*************************************//
String botonBussiness = '$("a[href*=\'/dashboard/Business/index/MAP-003\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonBussiness)

//************************Open Bussiness Partner Menu***********************************//
String botonBusinessPartner = '$("a[href*=\'/Management/BusinessPartner\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonBusinessPartner)

//************************Edit Bussiness Partner Form*************************************//
	
WebUI.delay(5)

String id1 = 'a[href*="/Management/BusinessPartner/Edit?entityCode='

String id2 = idBusinessPartner

String id3 = '"]'

String id4 = (id1 + id2) + id3

String createBusinessPartner = "jQuery('$id4')[0].click()"

print(createBusinessPartner + '\n')

CustomKeywords.'jquery.jquery_generic.execJS'(createBusinessPartner)

WebUI.waitForPageLoad(20)

//****************************Full Form 1 Socio de Negocio*****************************************//
//Entity Code
String open_entity_bp = '$("#EntityTypeCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_entity_bp)

WebUI.delay(3)

String entity_bp = 'jQuery(\'#select2-EntityTypeCode-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(entity_bp)

//Impuesto
String taxCode_bp = "jQuery('#TaxCode').val('$taxCode')"

CustomKeywords.'jquery.jquery_generic.execJS'(taxCode_bp)

//Nombre
String pname_bp = "jQuery('#PartnerName').val('$partnerName')"

CustomKeywords.'jquery.jquery_generic.execJS'(pname_bp)

//Nombre Corto
String shortname_bp = "jQuery('#ShortName').val('$shortName')"

CustomKeywords.'jquery.jquery_generic.execJS'(shortname_bp)

//Actividad Comercial
String comercial_bp = "jQuery('#ComercialActivity').val('$comercialActivity')"

CustomKeywords.'jquery.jquery_generic.execJS'(comercial_bp)

if (status == '0') {
    String status = '$(\'.switchery-small\').click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(status)
}

//****************************Full Form 1 Address*****************************************//
//Eliminar formulario
String butondelete = '$(".btn-danger")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butondelete)

//open +
String botonaddress = '$("a[href*=\'/Management/BusinessPartner/_Address\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonaddress)

WebUI.delay(8)

//Tipo
String open_type_bp = '$("#AddressEntityTypeCode").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_type_bp)

WebUI.delay(3)

String type_bp = 'jQuery(\'#select2-AddressEntityTypeCode-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(type_bp)

WebUI.delay(3)

if (delivery == '1') {
    String delivery_bp = '$(\'#IsDefaultDelivery\').click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(delivery_bp)
}

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
String butonacept_bp = '$(".btn-success")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp)

//****************************Full Form 1 Contabilidad*****************************************//
//Eliminar formulario
String butondelete2 = '$(".btn-danger")[1].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butondelete2)

//open +
String botonaccount = '$("a[href*=\'/Management/BusinessPartner/_Accountings\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(botonaccount)

WebUI.delay(3)

//Registro Padre
String open_parentAccounting_bp = '$("#selectParentAccounting").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_parentAccounting_bp)

WebUI.delay(3)

String parentAccounting_bp = 'jQuery(\'#select2-selectParentAccounting-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(parentAccounting_bp)

//Registro Hijo
String open_childrenAccounting = '$("#selectChildrenAccounting").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_childrenAccounting)

WebUI.delay(3)

String childrenAccounting_bp = 'jQuery(\'#select2-selectChildrenAccounting-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(childrenAccounting_bp)

//Aceptar
CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp)

//****************************Full Form 1 Grupos*****************************************//
//Eliminar formulario
String butondelete3 = '$(".btn-danger")[2].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butondelete3)

//open +
String botongrups = '$("a[href*=\'/Management/BusinessPartner/_EntityGroups\']")[0].click()'

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
CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp)

//****************************Full Form 1 Adicionales*****************************************//
//Eliminar Condiciones
String deletecondition = '$(\'#selectBusinessCondition\').empty();'

CustomKeywords.'jquery.jquery_generic.execJS'(deletecondition)

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

//Eliminar Impuesto
String deletetaxes = '$(\'#selectTaxes\').empty();'

CustomKeywords.'jquery.jquery_generic.execJS'(deletetaxes)

//Impuesto (1)
String open_taxes1 = '$("#selectTaxes").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_taxes1)

WebUI.delay(3)

String taxes1 = 'jQuery(\'#select2-selectTaxes-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(taxes1)

//Impuesto (2)
CustomKeywords.'jquery.jquery_generic.execJS'(open_taxes1)

WebUI.delay(3)

String taxes2 = 'jQuery(\'#select2-selectTaxes-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(taxes2)

//Eliminar atributo
String deleteattrib = '$(\'#selectAttributes\').empty();'

CustomKeywords.'jquery.jquery_generic.execJS'(deleteattrib)

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

//Eliminar lista de precios
String deleteprices = '$(\'#selectPrices\').empty();'

CustomKeywords.'jquery.jquery_generic.execJS'(deleteprices)

//Lista de Precios (1)
String open_prices = '$("#selectPrices").select2("open")'

CustomKeywords.'jquery.jquery_generic.execJS'(open_prices)

WebUI.delay(3)

String prices1 = 'jQuery(\'#select2-selectPrices-results li\').first().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(prices1)

//Lista de Precios(2)
CustomKeywords.'jquery.jquery_generic.execJS'(open_prices)

WebUI.delay(3)

String prices2 = 'jQuery(\'#select2-selectPrices-results li\').last().trigger({type:\'mouseup\'});'

CustomKeywords.'jquery.jquery_generic.execJS'(prices2)

//Guardar
String butonsave = '$(".pull-right").click()'

CustomKeywords.'jquery.jquery_generic.execJS'(butonsave)

WebUI.comment('Automatización: Usuario Editado Exitosamente')

WebUI.closeBrowser()

/***********************Verification**************************/

//Se verifica en el index si se cambio el nombre del socio de negocio
String elemento_a_verificar = partnerName

WebUI.callTestCase(findTestCase('Validates_Edits'), [('test') : 'Socio de Negocios', ('seachvalue') : elemento_a_verificar, ('table') : '#tablePrner', ('buttonnext') : '#tablePrner_next'],
	FailureHandling.STOP_ON_FAILURE)
