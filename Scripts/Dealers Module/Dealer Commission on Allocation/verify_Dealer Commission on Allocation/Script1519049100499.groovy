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

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Customers/Register Customer/steps_Loan Customer Registration and Deposit Payment'), [('gender') : gender, ('surname') : surname
        , ('otherNames') : otherNames, ('idNumber') : idNumber, ('idNumberType') : idNumberType, ('citizenship') : citizenship
        , ('mobilePhoneNumber') : mobilePhoneNumber, ('dealership') : dealership, ('signUpOutlet') : signUpOutlet, ('signUpOperator') : signUpOperator
        , ('salesChannel') : salesChannel, ('paymentPlan') : paymentPlan, ('dateOfBirth') : dateOfBirth, ('maritalStatus') : maritalStatus
        , ('alternatePhoneNumber') : alternatePhoneNumber, ('paymentPlanType') : paymentPlanType, ('paymentPhoneNumber') : paymentPhoneNumber
        , ('language') : language, ('Town') : Town, ('excludeFromCRBReport') : '', ('zukuDecoderSerial') : '', ('zukuSmartCard') : ''
        , ('test') : '', ('comment') : comment, ('amount') : amount, ('receiptNumber') : receiptNumber, ('account') : account
        , ('uploadComment') : uploadComment], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Customers/Register Customer/steps_Customer Screening'), [('account') : account, ('receivedCall') : receivedCall
        , ('payDepositQuestion') : payDepositQuestion, ('lighting') : lighting, ('opinion') : opinion, ('paymentPhoneNumber') : paymentPhoneNumber
        , ('Notes') : Notes, ('depositQuestionResponse') : depositQuestionResponse, ('responseSourceLighting') : responseSourceLighting
        , ('opinionCCR') : opinionCCR], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Dealers Module/Search Dealers/steps search dealers'), [('businessname') : businessName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dealers Module/DealerSearchResults/link_To Account'))

initialCommission = WebUI.getText(findTestObject('Dealers Module/Dealers Page/label_Total Commission Earned'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Customers/Customer Device Allocation/steps_Customer Device Allocation'), [('account') : account
        , ('businessName') : dealer, ('outlet') : outlet, ('outletAccessId') : outletAccessId, ('deviceToAllocate') : deviceToAllocate], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.callTestCase(findTestCase('Dealers Module/Search Dealers/steps search dealers'), [('businessname') : businessName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dealers Module/DealerSearchResults/link_To Account'))

finalCommission = WebUI.getText(findTestObject('Dealers Module/Dealers Page/label_Total Commission Earned'))

WebUI.verifyNotEqual(initialCommission, finalCommission)

WebUI.closeBrowser()

