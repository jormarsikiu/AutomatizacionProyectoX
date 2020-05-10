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
String botonTransacctions = '$("a[href*=\'/documents/transactiondraft/index\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(botonTransacctions)

//************************Create Draft Form*************************************//
String createDraft = '$("a[href*=\'/Documents/TransactionDraft/CreateDraftFormAsync\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(createDraft)

WebUI.delay(20)

//Obtener id draft
String iddraft = '''let val = $('#DraftCode').val(); return val;'''
String IDdraft = CustomKeywords.'jquery.jquery_generic.execJS'(iddraft)

//Código de cliente - Emite
String codclient =  '''$('#GetClientCode').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(codclient)
String openclient = '''$(".select2-hidden-accessible").select2("open")'''
CustomKeywords.'jquery.jquery_generic.execJS'(openclient)
String selectclient = "jQuery('.select2-hidden-accessible').select2().val('$client').get(0)"
CustomKeywords.'jquery.jquery_generic.execJS'(selectclient)
String aceptclient = "jQuery('.editable-submit').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(aceptclient)

//Código de cliente - Receptor
String customer =  '''$('#customerDir').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(customer)
String opencustomer = '''$(".select2-hidden-accessible").select2("open")'''
CustomKeywords.'jquery.jquery_generic.execJS'(opencustomer)
String selectcustomer = "jQuery('.select2-hidden-accessible').select2().val('$customer').get(0)"
CustomKeywords.'jquery.jquery_generic.execJS'(selectcustomer)
String aceptclient2 = "jQuery('.editable-submit').click()"
CustomKeywords.'jquery.jquery_generic.execJS'(aceptclient2)

//Fecha de borrador
String draftdate = "jQuery('#DraftDate').val('$draft_date')"
CustomKeywords.'jquery.jquery_generic.execJS'(draftdate)

//Fecha de vencimiento del borrador
String draftdatedue = "jQuery('#DraftDateDue').val('$draft_date_due')"
CustomKeywords.'jquery.jquery_generic.execJS'(draftdatedue)

//Boton de Agregar item
String buttonadd = '''$('#addItem').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(buttonadd)

//click Elegir item
String clickadd = '''$('.editable-empty')[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(clickadd)

//openitem
String openitem = '''$('.select2-hidden-accessible').select2("open")'''
CustomKeywords.'jquery.jquery_generic.execJS'(openitem)

//additem
String additem = "jQuery('.select2-results__options li:contains($item)').trigger({type:'mouseup'});"
CustomKeywords.'jquery.jquery_generic.execJS'(additem)

//aceptitem
String aceptitem = '''$('.editable-submit').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(aceptitem)

//click elegir cantidad
String selectQuantity = '''$('.editable-empty')[0].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(selectQuantity)

//add cantidad
String addQuantity = "jQuery('.input-mini').val($quantity)"
CustomKeywords.'jquery.jquery_generic.execJS'(addQuantity)

//acept cantidad
String acepquantity = '''$('.editable-submit').click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(acepquantity)

//Boton Guardar
String buttonsave = '''$('.btn-outline-info')[1].click()'''
CustomKeywords.'jquery.jquery_generic.execJS'(buttonsave)

/*************************Validates****************************/

WebUI.delay(20)
//Si existe la tabla
String existe = "let elemento= (jQuery('#tableDraft').length > 0); return elemento;"
Boolean elemento_existe = CustomKeywords.'jquery.jquery_generic.execJS'(existe)
String validacion = '0'
int pagina_validacion = 0
int pagina = 0

if (elemento_existe == true)
{
	String alerta = "let var= jQuery('#tableDraft tr').is(':contains($iddraft)'); return var;"
	Boolean bool_validate = CustomKeywords.'jquery.jquery_generic.execJS'(alerta)
	
	
	if(bool_validate==true){
		validacion = '1'
		pagina = 1
		
		
	}else{
	
		pagina = 1;
		int i=0
		while(bool_validate==false)
		{
			String siguiente = '''$('#tableDraft_next').click()'''
			CustomKeywords.'jquery.jquery_generic.execJS'(siguiente)
			WebUI.delay(20)
					
			String alert2 = "let val = jQuery('#tableDraft tr').is(':contains($IDdraft)'); return val;"
			Boolean bool2 = CustomKeywords.'jquery.jquery_generic.execJS'(alert2)
			
			i=i+1
			pagina_validacion=pagina+i
			
			String activenext='''let next = $('#tableDraft_next').is('.disabled'); return next;'''
			Boolean next = CustomKeywords.'jquery.jquery_generic.execJS'(activenext)
			
			if(bool2==true){
				bool_validate=true
				WebUI.delay(3)
				validacion = '2'
			}
			else if(next==true){
				validacion = '3'
				break;
			}
			

		}
		
	}
	
	WebUI.delay(5)
	WebUI.closeBrowser()
	
	if (validacion == '1')
	{
		WebUI.comment('Automatización Exitosa: Borrador Creado visible en pagina 1')
	}
	else if (validacion == '2')
	{
		WebUI.comment('Automatización Exitosa: Borrador Creado visible en pagina ' +pagina_validacion)
	}
	else if (validacion == '3')
	{
		WebUI.comment('Automatización Fallida: Borrador no encontrado en el Index')
	}
	
}
else{
	
	WebUI.comment('Automatización Fallida: Borrador No fue guardado')
}