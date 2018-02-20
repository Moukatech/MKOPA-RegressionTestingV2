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

WebUI.delay(Delay)

WebUI.click(findTestObject('Page Header and Menu/Dealers/link_AddDealer'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_DealershipType'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_DealershipType', [('DealershipType') : DealershipType]))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_RecruitingAgent'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_RecruitingAgent', [('RecruitingAgent') : RecruitingAgent]))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_SalesArea'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_SalesArea', [('SalesArea') : SalesArea]))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_SalesSub-Area'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_SalesSub-Area', [('SubArea') : SubArea]))

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_BusinessName', [('BusinessName') : BusinessName]), BusinessName)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_PostalAddress', [('PostalAddress') : PostalAddress]), PostalAddress)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_BusinessPermit', [('BusinessPermit') : BusinessPermit]), BusinessPermit)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_BusinessPin', [('BusinessPin') : BusinessPin]), BusinessPin)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_BankName', [('BankName') : BankName]), BankName)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_BranchName', [('BranchName') : BranchName]), BranchName)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_AccountNumber', [('AccountNo') : AccountNo]), AccountNo)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_SwiftCode', [('SwiftCode') : SwiftCode]), SwiftCode)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_Surname', [('Surname') : Surname]), Surname)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_OtherNames', [('OtherNames') : OtherNames]), OtherNames)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_IDNumber', [('IDNo') : IDNo]), IDNo)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_IDType'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_IDType', [('IDType') : IDType]))

WebUI.delay(Delay)

WebUI.check(findTestObject('Dealers Module/Add Dealer/checkbox_IDCopyReceived'))

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_Citizenship', [('Citizenship') : Citizenship]), Citizenship)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_Gender'))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_Gender', [('Gender') : Gender]))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/dropdown_Language', [('Language') : Language]))

WebUI.delay(Delay)

WebUI.click(findTestObject('Dealers Module/Add Dealer/select_Language', [('Language') : Language]))

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_PhoneNumber', [('PhoneNo') : PhoneNo]), PhoneNo)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_Alternatephone', [('AlternatePhone') : AlternatePhone]), AlternatePhone)

WebUI.setText(findTestObject('Dealers Module/Add Dealer/text_EmailAddress', [('Email') : Email]), Email)

WebUI.click(findTestObject('Dealers Module/Add Dealer/button_save'))

WebUI.verifyElementVisible(findTestObject('Dealers Module/Dealers Page/grid_dealer', [('BusinessName') : BusinessName]))

