import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.10.92/ashishtenant/login/')

WebUI.setText(findTestObject('Object Repository/Page_Infornest/input_Username_username'), 'ashishtenant')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Infornest/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Infornest/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Infornest  Worksites/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Infornest  Worksites/a_Yes'))

WebUI.closeBrowser()

