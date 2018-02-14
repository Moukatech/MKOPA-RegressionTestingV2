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

WebUI.callTestCase(findTestCase('Inventory Module/Common/List Warehouses Operations'), [('wareHouseCode') : 'SC001'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_RepairTransfersOut', [('repair_transfers_out') : repair_transfers_out]))

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/button_NewTransfer'))

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/dropdown_DeviceType'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/select_DeviceType', [('select_devicetype') : select_devicetype]))

WebUI.delay(1)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/dropdown_WarehouseTo'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/select_WarehouseTo', [('select_warehouseto') : select_warehouseto]))

WebUI.setText(findTestObject('Inventory Module/Repair Pool Transfers Out/input_ModeOfTransfer', [('input_modeoftransfer') : input_modeoftransfer]), 
    input_modeoftransfer)

WebUI.setText(findTestObject('Inventory Module/Repair Pool Transfers Out/input_PlannedQuantity'), input_plannedquantity)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/button_AddRepairPoolTransfer'))

WebUI.verifyAlertPresent(3)

WebUI.acceptAlert()

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/click_TopMostOrder'))

WebUI.setText(findTestObject('Inventory Module/Repair Pool Transfers Out/input_SerialNumber', [('input_serialnumber') : input_serialnumber]), 
    input_serialnumber)

WebUI.click(findTestObject('Inventory Module/Repair Pool Transfers Out/button_AddRepairPoolTransferItem'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Repair Pool Transfers Out/success_MessageAlert'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

