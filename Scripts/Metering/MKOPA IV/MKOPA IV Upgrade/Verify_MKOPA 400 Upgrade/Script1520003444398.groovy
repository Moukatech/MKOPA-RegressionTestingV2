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

not_run: WebUI.callTestCase(findTestCase('Metering/MKOPA IV/MKOPA IV Upgrade/step_MKOPA 400 Upgrade'), [('loan_Status') : 'Finished Payment'
        , ('delay') : '5', ('dealership') : 'SC001 M-KOPA Shop Meru (01063)', ('outlet') : 'SC001 Meru Rimbere Enterprise'
        , ('plan_Type') : 'Loan', ('operator') : 'Njoki Maureen', ('payment_Plan') : 'M-KOPA +400 v4 (M-KOPA +400 ZERO deposit + 50 for 850 days)'
        , ('request_Notes') : 'QA Testing Notes', ('page_Load') : '15'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(page_Load)

not_run: WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Metering/MKOPA IV/MKOPA IV Upgrade/step_FinishUpgrade'), [('delay') : '5', ('old_ProductAccount') : '23008785 ( SHS d20g v1 )'
        , ('return_Dealer') : 'S', ('return_DealerSelection') : 'SC001 M-KOPA Shop Meru', ('page_Load') : '10', ('return_OutletSelection') : 'SC001 Meru Rimbere Enterprise'
        , ('return_Operator') : 'Kananu', ('return_DeviceComment') : 'Return Device Comment'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(30)

not_run: WebUI.closeBrowser()

not_run: WebUI.callTestCase(findTestCase('Metering/MKOPA IV/MKOPA IV Upgrade/step_VerifyAccountUpgraded'), [('delay') : '3'
        , ('old_ProductAccount') : '23008785 ( SHS d20g v1 )'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(8)

not_run: CustomKeywords.'csvCreatorPackage.paymentFileGenerator.paymentFileGenerator'('38,499', '0715298183', '23008785', 
    '')

not_run: WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Common/steps_Upload Payments File'), [('Comment') : 'Nice and paid on time'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Metering/MKOPA IV/MKOPA IV Upgrade/steps_Customer Screening'), [('account') : '23008785'
        , ('receivedCall') : 'Yes', ('payDepositQuestion') : 'true', ('lighting') : 'Kerosene, candles, solar lantern  (20)'
        , ('opinion') : 'Very Good (20)', ('paymentPhoneNumber') : '0712908700', ('Notes') : 'Nice initiative', ('depositQuestionResponse') : 'Have paid the deposit'
        , ('responseSourceLighting') : 'Kerosene', ('opinionCCR') : 'Good'], FailureHandling.STOP_ON_FAILURE)

