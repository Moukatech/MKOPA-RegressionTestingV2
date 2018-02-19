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

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-Products'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Page Header and Menu/Products/Link-PaymentPlans'))

WebUI.delay(3)

WebUI.click(findTestObject('Page Header and Menu/Products/Link-ListLoanPaymentPlans'))

WebUI.click(findTestObject('Products Module/Loan Payment Plan List/link_Details', [('planName') : planName]))

WebUI.verifyElementVisible(findTestObject('Products Module/Loan Payment Plan Details/grid_LoanPaymentPlanDetails'))

WebUI.click(findTestObject('Products Module/Loan Payment Plan Details/link_Close'))

WebUI.verifyElementVisible(findTestObject('Products Module/Close Loan Payment Plan/grid_CloseLoanPaymetPlan'))

WebUI.setText(findTestObject('Products Module/Close Loan Payment Plan/input_Notes', [('notes') : notes]), notes)

WebUI.click(findTestObject('Products Module/Close Loan Payment Plan/button_Save'))

WebUI.verifyElementVisible(findTestObject('Products Module/Close Loan Payment Plan/message_Approval'))

WebUI.callTestCase(findTestCase('Products/Payment Plans/Loan Payment Plan/step_CloseNonePrimaryPaymentPlan'), [('plan_toApprove') : 'TV Delivery & Installation v1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Products Module/Close Loan Payment Plan/input_Notes', [('notes') : notes]), notes)

WebUI.check(findTestObject('Products Module/Approve Loan pament Plan Closure/checkbox_IsApproved'))

WebUI.click(findTestObject('Products Module/Close Loan Payment Plan/button_Save'))

WebUI.closeBrowser()

