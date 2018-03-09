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

WebUI.callTestCase(findTestCase('Inventory Module/Common/List Warehouses Operations'), [('wareHouseCode') : wareHouseCode], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_Receive Returned Devices '))

WebUI.click(findTestObject('Inventory Module/Receive Device Returns/link_Receive Customer Returns'))

WebUI.click(findTestObject('Inventory Module/Customer Device Returns to Receive/link_Receive', [('deviceSerial') : deviceSerial]))

WebUI.check(findTestObject('Inventory Module/Customer Device Returns to Receive/check_Good Condition'))

WebUI.setText(findTestObject('Inventory Module/Customer Device Returns to Receive/input_Receive Notes'), notes)

WebUI.click(findTestObject('Inventory Module/Customer Device Returns to Receive/button_Save'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Customer Device Returns to Receive/errorMsg_Enter Receive Notes'), 
    2)

WebUI.closeBrowser()

