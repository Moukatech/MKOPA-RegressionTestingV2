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

WebUI.callTestCase(findTestCase('Inventory Module/Receive Consignment/verify_Receive of Consignment'), [('itemType') : itemType
        , ('supplier') : supplier, ('manifestType') : manifestType, ('consigmentNo') : consignmentNo, ('loanDraw') : loanDraw
        , ('condition') : condition, ('selectId') : selectId, ('shippingDate') : shippingDate, ('code') : code, ('receiptId') : receiptId
        , ('receiptDate') : receiptDate, ('receiptCartonUnit') : receiptCartonUnit, ('comment') : comment, ('imei') : imei
        , ('statusMessage') : statusMessage], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726*-'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Inventory Module/Send State Link/steps_Send State'), [('imei') : imei, ('reason') : reason
        , ('state') : state, ('searchBy') : searchBy], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

newState = WebUI.getText(findTestObject('Inventory Module/Device Details/td_new State'))

WebUI.verifyEqual(newState, sentState)

WebUI.closeBrowser()

