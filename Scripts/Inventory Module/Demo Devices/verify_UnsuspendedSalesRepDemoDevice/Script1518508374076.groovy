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

WebUI.callTestCase(findTestCase('Inventory Module/Common/step_SaleRepDemoDeviceManagement'), [('delay') : '3', ('device_serialNumber') : '0715010701000105'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Demo Device Management/tab_CreditsSent'))

WebUI.delay(delay)

WebUI.getText(findTestObject('Inventory Module/Demo Device Management/label_LastCreditsSent'))

WebUI.click(findTestObject('Inventory Module/Demo Device Management/tab_StatesSent'))

WebUI.getText(findTestObject('Inventory Module/Demo Device Management/label_States'))

WebUI.click(findTestObject('Inventory Module/Demo Device Management/link_UnsuspendLink'))

WebUI.click(findTestObject('Inventory Module/Demo Device Management/button_ConfirmUnSuspend'))

WebUI.acceptAlert()

WebUI.refresh()

WebUI.getText(findTestObject('Inventory Module/Demo Device Management/link_SuspendDevice'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Suspend device', true)

WebUI.closeBrowser()

