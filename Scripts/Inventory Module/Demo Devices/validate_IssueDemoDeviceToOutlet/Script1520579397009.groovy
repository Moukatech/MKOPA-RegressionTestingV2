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

WebUI.callTestCase(findTestCase('Inventory Module/Common/step_Demo Devices'), [('request_Notes') : 'QA Testing', ('delay') : '5'
        , ('serial_Number') : findTestData('Inventory/List Demo Devices').getValue(1, 1), ('code') : findTestData('Inventory/List Demo Devices').getValue(2, 1)
        , ('demo_device') : findTestData('Inventory/List Demo Devices').getValue(3, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Demo Devices List/link_IssueDemoDevice'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Issue Demo Device/grid_IsuueDemoDevice'), 0)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/dropdown_EntityBeingAllocated', [('EntityType') : EntityType]))

WebUI.delay(3)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/select_EntityType', [('EntityType') : EntityType]))

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/button_Save'))

WebUI.delay(3)

WebUI.getText(findTestObject('Inventory Module/Issue Demo Device/message_blanksave'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Inventory Module/Issue Demo Device/message_blanksave'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

