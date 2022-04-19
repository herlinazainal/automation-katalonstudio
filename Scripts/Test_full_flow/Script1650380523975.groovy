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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), 
    'standard_user')

WebUI.setEncryptedText(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_login-button'))

WebUI.click(findTestObject('Swaglabs/Dashboard/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Swaglabs/Dashboard/button_Add to cart'))

WebUI.click(findTestObject('Swaglabs/Dashboard/a_1'))

WebUI.click(findTestObject('Swaglabs/Dashboard/button_Checkout'))

WebUI.setText(findTestObject('Swaglabs/Dashboard/input_Checkout Your Information_firstName'), 'Laura')

WebUI.setText(findTestObject('Swaglabs/Dashboard/input_Checkout Your Information_lastName'), 'Clauvee')

WebUI.setText(findTestObject('Swaglabs/Dashboard/input_Checkout Your Information_postalCode'), '55280')

WebUI.click(findTestObject('Swaglabs/Dashboard/input_Cancel_continue'))

WebUI.click(findTestObject('Swaglabs/Dashboard/button_Finish'))

WebUI.click(findTestObject('Swaglabs/Dashboard/button_Back Home'))

WebUI.click(findTestObject('Swaglabs/Dashboard/button_Open Menu'))

WebUI.click(findTestObject('Swaglabs/Dashboard/a_Logout'))

WebUI.closeBrowser()

