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

WebUI.mouseOver(findTestObject('Page Header and Menu/Payments/Link-Payments'))

WebUI.delay(delay)

WebUI.mouseOver(findTestObject('Page Header and Menu/Payments/Refund'))

WebUI.delay(delay)

WebUI.click(findTestObject('Page Header and Menu/Payments/Link-ApproveCustomerRefund'))

WebUI.click(findTestObject('Payments Module/Refunds Pending Approval/link_ApprovePendingRefund', [('accountNumber') : '24323310']))

WebUI.click(findTestObject('Payments Module/Approve Refund/dropdown_ApprovalStatus'))

WebUI.delay(delay)

WebUI.click(findTestObject('Payments Module/Approve Refund/option_ApprovalStatus', [('approvalStatus') : approvalStatus]))

WebUI.setText(findTestObject('Payments Module/Approve Refund/input_ApprovalNotes'), approvalNotes)

WebUI.click(findTestObject('Payments Module/Approve Refund/button_SaveRefundApproval'))

WebUI.delay(delay)

WebUI.getText(findTestObject('Payments Module/Approve Refund/message_RefundSuccessfull'))

String success = 'Refund Approved Successfully'

WebUI.verifyElementText(findTestObject('Payments Module/Approve Refund/message_RefundSuccessfull'), success)

WebUI.takeScreenshot()

