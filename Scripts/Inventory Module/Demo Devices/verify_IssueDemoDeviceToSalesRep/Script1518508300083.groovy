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
        , ('serial_Number') : '0715010701-000309', ('code') : 'SC001', ('demo_device') : '903a220c-6c89-e311-942c-000c29c12997'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Demo Devices List/link_IssueDemoDevice'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Issue Demo Device/grid_IsuueDemoDevice'), 0)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/dropdown_EntityBeingAllocated', [('EntityType') : EntityType]))

WebUI.delay(3)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/select_EntityType', [('EntityType') : EntityType]))

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/dropdown_SalesRep', [('SalesRep') : SalesRep]))

WebUI.delay(3)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/select_SalesRep', [('SalesRep') : SalesRep]))

WebUI.setText(findTestObject('Inventory Module/Issue Demo Device/text_seraialnumber', [('SerialNo') : SerialNo]), SerialNo)

WebUI.click(findTestObject('Inventory Module/Issue Demo Device/button_Save'))

WebUI.getText(findTestObject('Inventory Module/Demo Device Allocation Success/message_DemoDeviceAllocationSuccess'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Demo Device Allocation Success/message_DemoDeviceAllocationSuccess'), 
    0)

WebUI.closeBrowser()

