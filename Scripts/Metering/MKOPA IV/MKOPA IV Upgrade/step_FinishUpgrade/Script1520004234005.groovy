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

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : '23008785'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Create New Product/dropdown_ProductAccount'))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Create New Product/option_ProductAccount', [('old_ProductAccount') : old_ProductAccount]))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('MKOPA IV Module/Customers Dashboard/image_hamburger_menu'))

WebUI.delay(page_Load)

WebUI.click(findTestObject('MKOPA IV Module/Create New Product/button_FinishUpgrade'))

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/input_ReturnDealer'))

WebUI.sendKeys(findTestObject('MKOPA IV Module/Return Current Device/input_ReturnDealer'), return_Dealer)

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/option_ReturnDealer', [('return_DealerSelection') : return_DealerSelection]))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/dropdown_returnOutlet'))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/option_ReturnOutlet', [('return_OutletSelection') : return_OutletSelection]))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/dropdown_Operator'))

WebUI.delay(delay)

WebUI.click(findTestObject('MKOPA IV Module/Return Current Device/option_Operator', [('return_Operator') : return_Operator]))

WebUI.setText(findTestObject('MKOPA IV Module/Return Current Device/input_ReturnDeviceComment'), return_DeviceComment)

WebUI.click(findTestObject('MKOPA IV Module/Create New Product/button_UpgradeButton'))

