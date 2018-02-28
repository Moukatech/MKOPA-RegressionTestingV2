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

WebUI.callTestCase(findTestCase('Common/CheckerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/Link-Customer'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/link_Products'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/link_Approvals'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Customers/link_Approve AddOn cancellation'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Cancel AddOn/link_Approve', [('customerAccount') : cutomerAccount]))

WebUI.setText(findTestObject('Customer Module/Cancel AddOn/input_comment'), comment)

WebUI.click(findTestObject('Customer Module/Cancel AddOn/button_Approve'))

WebUI.verifyElementNotPresent(findTestObject('Customer Module/Cancel AddOn/link_Approve', [('customerAccount') : cutomerAccount]), 
    2)

