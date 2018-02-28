import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726*-'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : customerAccount], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/hamburger-Hamburger Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/link_Block AC'))

WebUI.delay(2)

WebUI.setText(findTestObject('Customer Module/Customer List/input_Amount to unblock'), ammount)

WebUI.setText(findTestObject('Customer Module/Customer List/input_Days to unblock'), days)

WebUI.click(findTestObject('Customer Module/Customer List/dropDwn_Block Reason'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer List/select_block reason'))

WebUI.setText(findTestObject('Customer Module/Customer List/input_block description'), description)

WebUI.click(findTestObject('Customer Module/Customer List/button_block Account'))

WebUI.verifyElementPresent(findTestObject('Customer Module/Customer List/success message-block'), 2)

WebUI.click(findTestObject('Customer Module/Customer List/button_Close'))

WebUI.closeBrowser()

