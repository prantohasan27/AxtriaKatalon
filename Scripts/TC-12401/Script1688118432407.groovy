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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://salesiqint.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Login  Salesforce/input_Username_username'), 'vinod.bendre@axtria.com.int')

WebUI.setEncryptedText(findTestObject('Object Repository/TC-12401/Page_Login  Salesforce/input_Password_pw'), 'uXlRb1kGYHM+iH3zWjUAbA==')

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Login  Salesforce/input_Password_rememberUn'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_Quota Refinement'))

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/input_Edit nav items_SearchTree'), 
    'pranto')

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Pranto_QR_Test'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_New Quota Refinement'))

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/input_Name_quotaName'), 'Mahmudur Rahman')

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/lightning-spinner_View Refinement_loader-ba_ef34d4'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Select Business Unit'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_Hac'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Select Team'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_Alpha'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Select Product'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_All'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Select Time Period'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_Monthly'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/input_Date_date'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_23'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/input_vinod Bendre_goal-group'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Save'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/input_Super Admin Integration_roster-group'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Save'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Next'))

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_Select a date for_slds-textarea re_514500'), 
    'p')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_p'), 'ph')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_ph'), 'phT')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_phT'), 'phTe')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_phTe'), 'phTes')

WebUI.setText(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/textarea_phTes'), 'phTest')

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_phTest_slds-checkbox_faux'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/span_Approval Window_slds-checkbox_faux'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Next_1'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Generate Cycle'))

WebUI.click(findTestObject('Object Repository/TC-12401/Page_Lightning Experience  Salesforce/button_Submit'))

