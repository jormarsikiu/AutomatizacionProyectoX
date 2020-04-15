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

//************************Create Bussiness Partner Menu*************************************//
String createBusinessPartner = '$("a[href*=\'/Management/BusinessPartner/Form\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(createBusinessPartner)


//****************************Full Form 1 Socio de Negocio*****************************************//

String entity_bp = "jQuery('#EntityTypeCode').val('$entityCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(entity_bp)

String code_bp = "jQuery('#PartnerCode').val('$code')"
CustomKeywords.'jquery.jquery_generic.execJS'(code_bp)

String taxCode_bp = "jQuery('#TaxCode').val('$taxCode')"
CustomKeywords.'jquery.jquery_generic.execJS'(taxCode_bp)

String pname_bp = "jQuery('#PartnerName').val('SocioNegocio1')"
CustomKeywords.'jquery.jquery_generic.execJS'(pname_bp)

/*String pname_bp = "jQuery('#PartnerName').val('$partnerName')"
CustomKeywords.'jquery.jquery_generic.execJS'(pname_bp)*/

String shortname_bp = "jQuery(\'#ShortName\').val('$shortName')"
CustomKeywords.'jquery.jquery_generic.execJS'(shortname_bp)

String comercial_bp = "jQuery('#ComercialActivity').val('$comercialActivity')"
CustomKeywords.'jquery.jquery_generic.execJS'(comercial_bp)

if (status == '0'){
	String status = '''$('.switchery-small').click()'''
	CustomKeywords.'jquery.jquery_generic.execJS'(status)
}

//****************************Full Form 1 Address*****************************************//
//open +

String botonaddress = '$("a[href*=\'/Management/BusinessPartner/_Address\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonaddress)

//Pais
String country_p = "jQuery('#CountryCode').val('$country').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(country_p)

//Region
String county_bp = "jQuery('#CountyCode').val('$county').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(county_bp)

//Estado
String state_bp = "jQuery('#StateCode').val('$state').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(state_bp)

//Municipio
String townshipCode_bp = "jQuery('#TownshipCode').val('$townshipCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(townshipCode_bp)

//Direccion1
String address1_bp = "jQuery('#Address1').val('$address1')"
CustomKeywords.'jquery.jquery_generic.execJS'(address1_bp)

//Direccion 2
String address2_bp = "jQuery('#Address2').val('$address2')"
CustomKeywords.'jquery.jquery_generic.execJS'(address2_bp)

//Direccion 3
String address3_bp = "jQuery('#Address3').val('$address3')"
CustomKeywords.'jquery.jquery_generic.execJS'(address3_bp)

//Tipo
String typeCode_bp = "jQuery('#AddressEntityTypeCode').val('$typeCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(typeCode_bp)

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


//****************************Full Form 1 Contabilidad*****************************************//
//open +
String botonaccount = '$("a[href*=\'/Management/BusinessPartner/_Accountings\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonaccount)

//Registro Padre
String parentAccounting_bp = "jQuery('#selectParentAccounting').val('$parentAccounting').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(parentAccounting_bp)

//Registro hijo
String childrenAccounting_bp = "jQuery('#selectChildrenAccounting').val('$childrenAccounting').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(childrenAccounting_bp)

//Aceptar
String butonacept_bp2 = '$(".btn-success")[1].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(butonacept_bp2)


//****************************Full Form 1 Grupos*****************************************//
//open +
String botongrups = '$("a[href*=\'/Management/BusinessPartner/_EntityGroups\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botongrups)

//Registro Padre
String parentGroups_bp = "jQuery('#selectParentGroups').val('$parentGroups').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(parentGroups_bp)


//Registro hijo
String childrenGroups_bp = "jQuery('#selectChildrenGroups').val('$childrenGroups').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(childrenGroups_bp)


//****************************Full Form 1 Adicionales*****************************************//

//Condicion Comercial
String businessCondition_bp = "jQuery('#selectBusinessCondition').val('$businessCondition').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(businessCondition_bp)

//Impuesto
String taxes_bp = "jQuery('#selectTaxes').val('$taxes').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(taxes_bp)

//Atributos de Entidad
String attributes_bp1 = "jQuery('#selectAttributes').val('$attributes1').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp1)

String attributes_bp2 = "jQuery('#selectAttributes').val('$attributes2').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp2)

//Lista de Precios
String prices_bp = "jQuery('#selectPrices').val('$prices').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(prices_bp)

//Guardar
String butonsave= '$(".pull-right").click()'
CustomKeywords.'jquery.jquery_generic.execJS'(butonsave)










