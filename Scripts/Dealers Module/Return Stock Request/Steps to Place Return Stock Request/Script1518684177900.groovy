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

WebUI.callTestCase(findTestCase('Dealers Module/Search Dealers/steps search dealers'), [('accountnumber') : dealernumber
        , ('businessname') : businessname, ('phonenumber') : phonenumber], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dealers Module/Search For Dealer/Link_to Account'))

WebUI.click(findTestObject('Dealers Module/Dealer Account/Link_Return Stock Request'))

WebUI.click(findTestObject('Dealers Module/Return Stock Request/Dropdown_returnType'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Return Stock Request/select_returntype', [('returntype') : returnType]))

WebUI.sendKeys(findTestObject('Dealers Module/Return Stock Request/input_Return Reason'), 'test')

WebUI.click(findTestObject('Dealers Module/Return Stock Request/Dropdown_outlet'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Return Stock Request/select_Outlet', [('outlet') : outlet]))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Return Stock Request/Dropdown_OutletProductType'))

WebUI.delay(2)

WebUI.click(findTestObject('Dealers Module/Return Stock Request/select_outProductType', [('outletproducttype') : outletProductType]))

WebUI.click(findTestObject('Dealers Module/Return Stock Request/select_serialNumber', [('serialnumber') : serialnumber]))

WebUI.click(findTestObject('Dealers Module/Return Stock Request/Button_Add'))

WebUI.click(findTestObject('Dealers Module/Return Stock Request/Button_Place Return Request'))

