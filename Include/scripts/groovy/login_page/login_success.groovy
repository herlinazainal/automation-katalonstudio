package login_page
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login_success {
	
	@Given("user has been navigated into the login page")
	def navigated_to_login_page() {
		WebUI.openBrowser('https://www.saucedemo.com/')
		WebUI.maximizeWindow()		
	}

	@When("user click on username field and input the (.*)")
	def input_the_username(String username) {
		WebUI.setText(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_user-name'), username)
	}

	@And("click on password field and input the (.*)")
	def input_the_password(String password) {
		WebUI.setEncryptedText(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_password'), password)
	}
	
	@And("click on Login button")
	def click_login_button() {
		WebUI.click(findTestObject('Swaglabs/Login Page/input_standard_userlocked_out_userproblem_userperformance_glitch_user_login-button'))
	}
	
	@Then("user will navigates into the home dashboard page")
	def navigates_to_home_dashboard() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Swaglabs/Dashboard/div_Sauce Labs Backpack'), 20)
		WebUI.closeBrowser()
	}
}