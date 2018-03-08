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

WebUI.callTestCase(findTestCase('Inventory Module/Item Types/steps_Item Types'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_Add Item Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Add Item Type/dropDwn_Select Classification'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Add Item Type/select_Classification', [('classification') : classification]))

WebUI.delay(2)

WebUI.setText(findTestObject('Inventory Module/Add Item Type/input_Part Number'), partNumber)

WebUI.setText(findTestObject('Inventory Module/Add Item Type/input_Part Description'), partDescription)

WebUI.setText(findTestObject('Inventory Module/Add Item Type/input_Item Description'), itemDescription)

WebUI.click(findTestObject('Inventory Module/Add Item Type/dropDwn_SelectFimware'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Add Item Type/select_Firmware', [('firmware') : firmware]))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Add Item Type/button_Cretate'))

WebUI.verifyElementPresent(findTestObject('Inventory Module/Add Item Type/sucess message'), 2)

WebUI.closeBrowser()

