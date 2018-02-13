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

WebUI.callTestCase(findTestCase('Inventory Module/Receipt of Large Consignment/verify_Large Consignment Upload'), [('itemType') : itemType
        , ('supplier') : supplier, ('manifestType') : manifestType, ('loanDraw') : loanDraw, ('shippingDate') : shippingDate
        , ('condition') : condition, ('selectId') : selectId, ('consignmentNo') : consignmentNo], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726*-'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Inventory Module/Receive Consignment/steps_Warehouse Operations'), [('code') : code, ('receiptId') : receiptId
        , ('consignmentNo') : consignmentNo, ('receiptDate') : receiptDate, ('receiptCartonUnit') : receiptCartonUnit], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Receive Consignment/button_Receive'))

WebUI.click(findTestObject('Inventory Module/Cartons Pending Receipt/button_Finish Receiving Consignment'))

WebUI.callTestCase(findTestCase('Inventory Module/Receive Consignment/steps_Finish Receive Consignment'), [('comment') : comment], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Inventory Module/Consignment Received/successMsg_Consignment has been Received'))

WebUI.closeBrowser()

