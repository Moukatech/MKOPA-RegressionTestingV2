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

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/link_checkstock'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/dropDwn_Item Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/select_Item type', [('itemType') : itemType]))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/dropDwn_Packaging'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/select_packaging', [('packaging') : packaging]))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouse Operations/button_Load'))

WebUI.delay(2)

WebUI.check(findTestObject('Inventory Module/Check stock/check_MarkAsOk', [('serialNumber') : serialNumber]))

WebUI.click(findTestObject('Inventory Module/Check stock/Button_ProcessStock'))

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('Inventory Module/Check stock/label_PackagingBoxNumber', [('serialNumber') : serialNumber]), 
    3)

WebUI.click(findTestObject('Inventory Module/Check stock/link_Warehouse Operations(short)'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/WareHouses/link_Operations', [('code') : wareHouseCode]))

not_run: WebUI.verifyLessThan(tobechecked, tobechecked)

