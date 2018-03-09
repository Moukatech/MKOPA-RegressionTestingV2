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

WebUI.callTestCase(findTestCase('Dealers Module/Common/Steps to particuler dealers page'), [('dealernumber') : dealerAcc], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dealers Module/Dealer List/link_Manage Outlets'))

WebUI.click(findTestObject('Dealers Module/Dealer Outlets/link_Details', [('outletCode') : outletCode]))

WebUI.click(findTestObject('Dealers Module/Dealer Outlets/link_Add Products'))

WebUI.check(findTestObject('Dealers Module/Outlet Details/check_Outlet Product', [('outletProduct') : outletProduct]))

WebUI.click(findTestObject('Dealers Module/Outlet Details/button_Save'))

WebUI.click(findTestObject('Dealers Module/Outlet Details/link_Back to Outlet list'))

WebUI.click(findTestObject('Dealers Module/Outlet Details/link_Products', [('outletCode') : outletCode]))

WebUI.verifyElementPresent(findTestObject('Dealers Module/Outlet Details/link_OutletProduct', [('outletProduct') : outletProduct]), 
    2)

WebUI.closeBrowser()

