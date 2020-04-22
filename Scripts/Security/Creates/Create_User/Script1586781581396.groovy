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

//**********Open Setting-Addministration-User***********************//
String menu_crear_user = '$("a[href*=\'user/Index\']")[0].click()'

CustomKeywords.'jquery.jquery_generic.execJS'(menu_crear_user)

//********************Open form User**********************//
String form_crear_user = 'jQuery(\'#IdFormCreateUser\').click()'

CustomKeywords.'jquery.jquery_generic.execJS'(form_crear_user)

WebUI.delay(3)

//****************************Full Form 1*****************************************//
String firstName_u = "jQuery('#FirstName').val('$firstName')"

CustomKeywords.'jquery.jquery_generic.execJS'(firstName_u)

String lastName_u = "jQuery('#LastName').val('$lastName')"

CustomKeywords.'jquery.jquery_generic.execJS'(lastName_u)

String avatar_u = "jQuery('#Avatar').val('$avatar')"

CustomKeywords.'jquery.jquery_generic.execJS'(avatar_u)

String email_u = "jQuery('#Email').val('$email')"

CustomKeywords.'jquery.jquery_generic.execJS'(email_u)

String password_u = "jQuery('#Password').val('$password')"

CustomKeywords.'jquery.jquery_generic.execJS'(password_u)

String confirmPassword_u = "jQuery('#ConfirmPassword').val('$confirmPassword')"

CustomKeywords.'jquery.jquery_generic.execJS'(confirmPassword_u)

String phone_u = "jQuery('#PhoneNumber').val('$phone')"

CustomKeywords.'jquery.jquery_generic.execJS'(phone_u)

if (status == '0') {
    String status = '$(\'#IsActive\').click()'

    CustomKeywords.'jquery.jquery_generic.execJS'(status)
}

String next = '$("a[href*=\'next\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(next)

//****************************Full Form 2 ROLES *****************************************//
//MAXIMO 2 ROLES

if (n_role == '1')
{
    String role1 = "jQuery('#' + '$idRole1' + '-selectable').click()"
    CustomKeywords.'jquery.jquery_generic.execJS'(role1)

}
else{
	String role1 = "jQuery('#' + '$idRole1' + '-selectable').click()"
	CustomKeywords.'jquery.jquery_generic.execJS'(role1)
	String role2 = "jQuery('#' + '$idRole2' + '-selectable').click()"
	CustomKeywords.'jquery.jquery_generic.execJS'(role2)
}


//****************************Full Form 3 ROLES *****************************************//
//MAXIMO 2 SOCIEDADES

if (n_society == '1')
{
    String society1 = "jQuery('#' + '$idsociety1' + '-selectable').click()"
    CustomKeywords.'jquery.jquery_generic.execJS'(society1)
}
else{
	String society1 = "jQuery('#' + '$idsociety1' + '-selectable').click()"
	CustomKeywords.'jquery.jquery_generic.execJS'(society1)
	String society2 = "jQuery('#' + '$idsociety2' + '-selectable').click()"
	CustomKeywords.'jquery.jquery_generic.execJS'(society2)
}

String finish = '$("a[href*=\'finish\']")[0].click()'
CustomKeywords.'jquery.jquery_generic.execJS'(finish)



/**********************************************************************************/
//PROBAR 2 FORMA PARA MAS SOCIEDADES
/*
 for(int i=1; i<n_role;i++)
 {
	 String idRole = "idRole"+i
	 print(idRole)
	 String role = "jQuery('#' + '$idRole' + '-selectable').click()"
	 CustomKeywords.'jquery.jquery_generic.execJS'(role)
	 
 }
 
 for(int i=1; i<n_society;i++)
 {
	 String idsociety = "idsociety"+i
	 String society = "jQuery('#' + '$idsociety' + '-selectable').click()"
	 CustomKeywords.'jquery.jquery_generic.execJS'(society)
	 
 }
 
 */

