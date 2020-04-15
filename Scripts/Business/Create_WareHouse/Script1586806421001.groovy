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


//Open WareHouse Menu
String botonWareHouse= '''$("a[href*='/Management/WareHouse']")[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(botonWareHouse)

//****************************Full Form 1 Almacen*****************************************//
//Almacen 
String wareHouseCode_bp = "jQuery('#WareHouseCode').val('$wareHouseCode')"
CustomKeywords.'jquery.jquery_generic.execJS'(wareHouseCode_bp)

//Nombre
String wareHousename_bp = "jQuery('#c').val('$wareHouseName')"
CustomKeywords.'jquery.jquery_generic.execJS'(wareHousename_bp)

//Codigo de tipo de entidad
String entityTypeCode_bp = "jQuery('#EntityTypeCode').val('$entityTypeCode').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(entityTypeCode_bp)

//Nombre Corto
String shortName_bp = "jQuery('#ShortName').val('$shortName').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(shortName_bp)

/*Descomente para desactivar Status
 String status = '''$('#IsActive').click()'''
 CustomKeywords.'jquery.jquery_generic.execJS'(status)
 */

//****************************Full Form 1 Direccion*****************************************//
//Open +
String botonaddress = '$("a[href*=\'/Management/Warehouse/_Address\']")[0].click()'
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

//****************************Full Form 1 Grupo*****************************************//

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

//Atributos de Entidad
String attributes_bp1 = "jQuery('#selectAttributes').val('$attributes1').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp1)

String attributes_bp2 = "jQuery('#selectAttributes').val('$attributes2').change()"
CustomKeywords.'jquery.jquery_generic.execJS'(attributes_bp2)