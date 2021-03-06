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

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_RepairPoolTransfersIn', [('repair_transfers_out') : transfersOut]))

WebUI.delay(1)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/click_OrderInTransit'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/click_SerialNumberToReceive'))

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/dropdown_Status'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/select_Status', [('select_status') : status]))

WebUI.delay(2)

WebUI.setText(findTestObject('Inventory Module/Repair Pool Transfers In/input_Comment'), comment)

WebUI.delay(1)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/button_Receive'))

WebUI.delay(3)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/click_OrderInTransit'))

WebUI.delay(1)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers In/button_Finish'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Repair Pool Transfers In/confirm_StatusIsReceived'))

WebUI.closeBrowser()

