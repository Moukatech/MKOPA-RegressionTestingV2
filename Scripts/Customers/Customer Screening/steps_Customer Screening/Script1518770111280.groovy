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

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/Link-Customer'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Customers/link_Screening'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Customers/link_Customers Awaiting Screening'))

WebUI.click(findTestObject('Customer Module/Customers Awaiting Screening/link_Screen Customer', [('account') : account]))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Screen Customer/dropdown_Customer Received Call'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Screen Customer/label_Customer Received Call', [('receivedCall') : receivedCall]))

WebUI.delay(2)

WebUI.setText(findTestObject('Customer Module/Screen Customer/input_Payment Phone Number'), '')

WebUI.setText(findTestObject('Customer Module/Screen Customer/input_Notes'), '')

WebUI.click(findTestObject('Customer Module/Screen Customer/button_Save Comment'))

WebUI.check(findTestObject('Customer Module/Screen Customer/radio_Pay Deposit Question'))

WebUI.setText(findTestObject('Customer Module/Screen Customer/input_Deposit Question Response Summary'), '')

WebUI.click(findTestObject('Customer Module/Screen Customer/dropdown_Source Of Lighting'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Customer Module/Screen Customer/label_Lighting'))

WebUI.setText(findTestObject('Customer Module/Screen Customer/input_Response source of Lighting'), '')

WebUI.click(findTestObject('Customer Module/Screen Customer/dropdown_CCR'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Screen Customer/label_CCR Opinion'))

WebUI.setText(findTestObject('Customer Module/Screen Customer/input_CCR opinion'), '')

WebUI.click(findTestObject('Customer Module/Screen Customer/button_Save'))

