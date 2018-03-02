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

WebUI.callTestCase(findTestCase('Customers/Register Customer/steps_Customer Registration'), [('gender') : 'Male', ('surname') : 'Makeba'
        , ('otherNames') : 'Zahra Mekatilili', ('idNumber') : '20191099', ('idNumberType') : 'National ID', ('citizenship') : 'Kenya'
        , ('mobilePhoneNumber') : '0714000168', ('dealership') : 'SC001 M-KOPA Shop Meru (01063)', ('signUpOutlet') : 'Sc001 M-Kopa Shop Meru'
        , ('signUpOperator') : '(0) Mwita Moses', ('salesChannel') : 'Normal', ('paymentPlan') : 'M-KOPA 5 v1 (M-KOPA 5: 2999 +50/day)'
        , ('dateOfBirth') : '1994-06-13', ('maritalStatus') : 'Single', ('alternatePhoneNumber') : '0718999591', ('paymentPlanType') : 'Loan'
        , ('paymentPhoneNumber') : '0714000168', ('language') : 'English', ('Town') : 'Nairobi', ('excludeFromCRBReport') : ''
        , ('zukuDecoderSerial') : '', ('zukuSmartCard') : '', ('test') : '', ('comment') : 'I have Created a Customer'], 
    FailureHandling.STOP_ON_FAILURE)

