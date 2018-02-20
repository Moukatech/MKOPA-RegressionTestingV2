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

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/link_OutletProducts'))

WebUI.delay(delay)

WebUI.click(findTestObject('Products Module/Add Outlet Product/link_OutletProductApproval'))

WebUI.click(findTestObject('Products Module/Outlet Product Type Approvals/link_OutletProductTypeApproval', [('producttype') : producttype]))

WebUI.click(findTestObject('Products Module/Approve Outlet Product Type/dropdown_ApprovalStatus'))

WebUI.click(findTestObject('Products Module/Approve Outlet Product Type/option_ApprovalStatus', [('approval_Status') : approval_Status]))

WebUI.delay(delay)

WebUI.setText(findTestObject('Products Module/Approve Outlet Product Type/input_ApproverNotes'), approver_Notes)

WebUI.click(findTestObject('Products Module/Approve Outlet Product Type/button_Save'))

WebUI.getText(findTestObject('Products Module/Outlet Product Details/message_OutletProductDetails', [('producttype') : producttype]))

WebUI.verifyElementPresent(findTestObject('Products Module/Outlet Product Details/message_OutletProductDetails', [('producttype') : producttype]), 
    0)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Products/Add Outlet Product/verify_OutletProductApprovedList'), [('outlet_Product') : 'Outlet Product NameApproval'], 
    FailureHandling.STOP_ON_FAILURE)

