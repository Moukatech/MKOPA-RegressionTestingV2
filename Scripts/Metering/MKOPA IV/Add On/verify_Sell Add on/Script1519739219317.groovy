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

WebUI.click(findTestObject('MKOPA IV Module/Customers Dashboard/image_hamburger_menu'))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Customers Dashboard/button_Sell AddOn'))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/Dropdown_Sell add on'))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/select_Add On', [('addOnName') : addOnName]))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/Dropdown-Dealership'))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/select_Dealership', [('dealership') : dealership]), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/Dropdown-Sale Outlet'))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/select_Sale Outlet', [('salesOutlet') : salesOutlet]))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/Dropdown-Sale Operator'))

WebUI.delay(delay)

WebUI.click(findTestObject('Customer Module/Sell Add On/select_Sales operator', [('salesOperator') : salesOperator]))

WebUI.setText(findTestObject('Customer Module/Sell Add On/input-Comment'), comment)

not_run: WebUI.click(findTestObject('Customer Module/Sell Add On/Button-Sell'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Customer Module/Sell Add On/message_Add-on registered successfully'), 2)

WebUI.click(findTestObject('Customer Module/Sell Add On/link_Click to customer page'))

WebUI.click(findTestObject('Customer Module/Customer List/link_Product Information'))

WebUI.verifyElementPresent(findTestObject('Customer Module/Customer List/link_AddOn', [('addOnName') : addOnName]), 2)

WebUI.closeBrowser()

