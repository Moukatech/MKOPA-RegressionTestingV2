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

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/Link-Customer'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/link_Registrations'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Customers/link_New Registration'))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Surname'), surname)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Other Names'), otherNames)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Gender'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Gender', [('gender') : gender]))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Id Number'), idNumber)

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Id Number Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Id Number Type', [('idNumberType') : idNumberType]))

WebUI.check(findTestObject('Customer Module/Register Customer/check_Id Copy Received'))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Citizenship'), citizenship)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Mobile Phone Number'), mobilePhoneNumber)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Dealership'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Dealership', [('dealership') : dealership]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Sign Up Outlet'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Sign Up Outlet', [('signUpOutlet') : signUpOutlet]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Sign Up Operator'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Sign Up Operator', [('signUpOperator') : signUpOperator]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Sales Channel'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_salesChannelInfo', [('salesChannel') : salesChannel]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_PaymentPlanType'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Payment Plan Type', [('paymentPlanType') : paymentPlanType]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Payment Plan'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Payment Plan', [('paymentPlan') : paymentPlan]))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Comment'), comment)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Date of Birth'), dateOfBirth)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Marital Status'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Marital Status', [('maritalStatus') : maritalStatus]))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Alternate Phone Number'), alternatePhoneNumber)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Payment Phone Number'), paymentPhoneNumber)

WebUI.click(findTestObject('Customer Module/Register Customer/dropdown_Language'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Register Customer/label_Language', [('language') : language]))

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Town'), Town)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Exclude From CRB Report'), excludeFromCRBReport)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Zuku Decoder Serial'), zukuDecoderSerial)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Zuku Smart Card'), zukuSmartCard)

WebUI.setText(findTestObject('Customer Module/Register Customer/input_Test'), test)

WebUI.click(findTestObject('Customer Module/Register Customer/button_Save'))

WebUI.delay(15)

WebUI.click(findTestObject('Customer Module/Check Identity for New Registration/dropdown_Do Details Match'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Check Identity for New Registration/label_Details Match'))

WebUI.click(findTestObject('Customer Module/Check Identity for New Registration/button_Complete Identity Check'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'csvCreatorPackage.paymentFileGenerator.paymentFileGenerator'(account, mobilePhoneNumber, amount, receiptNumber)

WebUI.callTestCase(findTestCase('Common/steps_Upload Payments File'), [('Comment') : uploadComment], FailureHandling.STOP_ON_FAILURE)

