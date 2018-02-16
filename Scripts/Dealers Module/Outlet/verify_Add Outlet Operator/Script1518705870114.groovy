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

WebUI.mouseOver(findTestObject('Page Header and Menu/Dealers/Link_Dealers'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Dealers/Link_List Dealers'))

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Details', [('dealerNo') : dealerAcc]))

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Manage Operator'))

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Add Outlet Operator'))

WebUI.delay(2)

WebUI.setText(findTestObject('Dealers Module/Add Operator/input_Surname'), surname)

WebUI.setText(findTestObject('Dealers Module/Add Operator/input_OtherNames'), otherNames)

WebUI.setText(findTestObject('Dealers Module/Add Operator/input_Idenification Number'), idNumber)

WebUI.click(findTestObject('Dealers Module/Add Operator/dropDwn_ID type'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/select_ID type', [('idType') : idType]))

WebUI.setText(findTestObject('Dealers Module/Add Operator/input_PhoneNumber'), phoneNumber)

WebUI.click(findTestObject('Dealers Module/Add Operator/link_calender'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/label_DateOfBirth', [('dob') : dob]))

WebUI.click(findTestObject('Dealers Module/Add Operator/dropDwn_Gender'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/select_Gender', [('gender') : gender]))

WebUI.click(findTestObject('Dealers Module/Add Operator/dropDwn_Language'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/select_Language', [('language') : language]))

WebUI.check(findTestObject('Dealers Module/Add Operator/check_OutletId'))

WebUI.click(findTestObject('Dealers Module/Add Operator/dropDwn_Operator Type'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/select_Operater Type', [('operatorType') : operatorType]))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Operator/button_Save'))

WebUI.verifyElementPresent(findTestObject('Dealers Module/Operator details/label_Operator name', [('surname') : surname]), 
    2)

