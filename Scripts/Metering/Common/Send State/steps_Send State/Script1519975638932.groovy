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

WebUI.callTestCase(findTestCase('Metering/Common/Device Landing Page/steps_Device Landing Page'), [('customerToSearch') : customerToSearch
        , ('windowTitle') : windowsTitle, ('deviceSerial') : deviceSerial], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Device Details Page/link_manually set state'))

WebUI.delay(5)

WebUI.click(findTestObject('Customer Module/manually set state/dropDown_State to send'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/manually set state/label_state to send', [('stateToSend') : stateToSend]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Customer Module/manually set state/input_reason'), reason)

WebUI.click(findTestObject('Customer Module/manually set state/button_Send'))

WebUI.verifyAlertPresent(10)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Device Details/button_States Sent'))

