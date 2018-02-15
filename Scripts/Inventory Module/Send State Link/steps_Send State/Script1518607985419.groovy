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

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Operations'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory Items'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_Send State'))

WebUI.setText(findTestObject('Inventory Module/Send State/input_Enter Imei'), imei)

WebUI.click(findTestObject('Inventory Module/Send State/dropdown_State to Send'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Send State/label_State', [('state') : state]))

WebUI.setText(findTestObject('Inventory Module/Send State/input_Enter Reason'), reason)

WebUI.click(findTestObject('Inventory Module/Send State/button_Submit'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_DeviceSearch'))

WebUI.click(findTestObject('Inventory Module/Device Search/dropdown_SearchBy'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Device Search/select_SearchBy', [('searchBy') : searchBy]))

WebUI.setText(findTestObject('Inventory Module/Device Search/input_serialnumber'), imei)

WebUI.click(findTestObject('Inventory Module/Device Search/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Device Details/button_States Sent'))

