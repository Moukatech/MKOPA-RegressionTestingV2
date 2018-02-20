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

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Dealers/Link_Dealers'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Dealers/Link_List Dealers'))

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Details', [('dealerNo') : dealerAcc]))

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Manage Outlets'))

WebUI.click(findTestObject('Dealers Module/Dealer Outlets/link_Add Outlet'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Outlet/dropDown_Recruiting Agent'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Outlet/select_Recruiting agent', [('recrutingAgent') : recruitingAgent]))

WebUI.delay(2)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Outlet Name'), outletName)

WebUI.click(findTestObject('Dealers Module/Add Outlet/dropDwn_Sales Area'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Outlet/select_Sales Area', [('salesArea') : salesArea]))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Outlet/dropDwn_Sales Sub-Area'))

WebUI.delay(3)

WebUI.click(findTestObject('Dealers Module/Add Outlet/select_Sales Sub-area', [('salesSubArea') : salesSubArea]))

WebUI.delay(2)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Town'), town)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Street'), street)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Address 1'), address1)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Address 2'), address2)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Description'), outletDescription)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Latitude'), latitude)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Longitude'), longitude)

WebUI.setText(findTestObject('Dealers Module/Add Outlet/input_Phone Number'), phoneNumber)

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Add Outlet/button_Save'))

WebUI.check(findTestObject('Dealers Module/Outlet Details/check_Outlet Product', [('outletProduct') : outletProduct]))

WebUI.click(findTestObject('Dealers Module/Outlet Details/button_Save'))

