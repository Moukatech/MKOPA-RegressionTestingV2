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

not_run: WebUI.callTestCase(findTestCase('Inventory Module/Common/List Warehouses Operations'), [('wareHouseCode') : 'WaHo008'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_TransfersOut', [('transfers_out') : transfers_out]))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/button_NewTransfer'))

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_DeviceType'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/select_DeviceType', [('select_devicetype') : select_devicetype]))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_WarehouseTo', [('select_warehouseto') : select_warehouseto]))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/select_WarehouseTo', [('select_warehouseto') : select_warehouseto]))

not_run: WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_ModeOfTransfer', [('input_modeoftransfer') : input_modeoftransfer]), 
    input_modeoftransfer)

not_run: WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_PlannedQuantity'), input_plannedquantity)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/button_AddTransfer'))

not_run: WebUI.verifyAlertPresent(3)

not_run: WebUI.acceptAlert()

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/click_TopMostOrder'))

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/dropdown_Packaging'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/select_Packaging', [('select_packaging') : select_packaging]))

not_run: WebUI.setText(findTestObject('Inventory Module/Transfers Out/input_SerialNumber', [('input_serialnumber') : input_serialnumber]), 
    input_serialnumber)

not_run: WebUI.click(findTestObject('Inventory Module/Transfers Out/button_AddTransferItem'))

not_run: WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('Inventory Module/Transfers Out/label_TransferDetails', [('input_serialnumber') : input_serialnumber]), 
    0)

not_run: WebUI.closeBrowser()

not_run: WebUI.delay(5)

WebUI.callTestCase(findTestCase('Inventory Module/Warehouse Transfers In/verify_Warehouse Transfers In'), [('transfers_in') : '04a58263-0097-e411-80ed-00155d83faa4'
        , ('select_status') : 'ReceivedOk', ('input_comment') : 'automation test'], FailureHandling.STOP_ON_FAILURE)

