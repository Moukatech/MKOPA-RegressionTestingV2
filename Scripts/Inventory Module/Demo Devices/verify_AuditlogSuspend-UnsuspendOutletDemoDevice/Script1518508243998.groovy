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

WebUI.callTestCase(findTestCase('Inventory Module/Demo Devices/verify_SuspendDemoDevices'), [('delay') : '5', ('last_Credit') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Inventory Module/Device Search/verify_DeviceSearch'), [('serialnumber') : '0715010701-000359'
        , ('searchBy') : 'SerialNumber'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Device Landing Page/tab_AuditLog'))

WebUI.delay(15)

WebUI.scrollToElement(findTestObject('Inventory Module/Device Landing Page/grid_SuspendedDemoDevice'), 0)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Device Landing Page/grid_SuspendedDemoDevice'))

WebUI.verifyElementVisible(findTestObject('Inventory Module/Device Landing Page/grid_UnsuspendedDemoDevice'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Inventory Module/Demo Devices/verify_UnSuspendDemoDevices'), [('delay') : '5'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Inventory Module/Device Search/verify_DeviceSearch'), [('serialnumber') : '0715010701-000359'
        , ('searchBy') : 'SerialNumber'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Device Landing Page/tab_AuditLog'))

WebUI.delay(15)

WebUI.scrollToElement(findTestObject('Inventory Module/Device Landing Page/grid_SuspendedDemoDevice'), 0)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Device Landing Page/grid_SuspendedDemoDevice'))

WebUI.verifyElementVisible(findTestObject('Inventory Module/Device Landing Page/grid_UnsuspendedDemoDevice'))

WebUI.closeBrowser()

