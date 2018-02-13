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

String consignmentNo = randomGenerator('QWERTYUIOP1234567890LKJHGFDSAZXCVBNM', 9)

location = System.getenv('USERPROFILE')

String fileLocation = location + '/git/MKOPA-RegressionTestingV2/Manifest Files/wrongformat.docx'

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Operations'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page Header and Menu/Inventory/link_Inventory Items'))

WebUI.delay(2)

WebUI.click(findTestObject('Page Header and Menu/Inventory/link_Upload Manifest'))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/dropdown_Select Manifest Type '))

WebUI.delay(2)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/label_Manifest Type', [('manifestType') : manifestType]))

WebUI.setText(findTestObject('Inventory Module/Device Manifest Upload/input_Shipping Date'), shippingDate)

WebUI.setText(findTestObject('Inventory Module/Device Manifest Upload/input_Consignment No'), consignmentNo)

WebUI.setText(findTestObject('Inventory Module/Device Manifest Upload/input_Loan Draw'), loanDraw)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/dropdown_Select Item Type'))

WebUI.delay(5)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/label_itemType', [('itemType') : itemType]))

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/dropdown_Select Supplier'))

WebUI.delay(5)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/label_supplier', [('supplier') : supplier]))

WebUI.check(findTestObject('Inventory Module/Device Manifest Upload/checkerbox_Send to Production'))

WebUI.uploadFile(findTestObject('Inventory Module/Device Manifest Upload/button_Select'), fileLocation)

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/button_Upload'))

String randomGenerator(String chars = 'QWERTYUIOPLKJHGFDSAZXCVBNM', Integer length = 9) {
	Random rand = new Random()

	StringBuilder sb = new StringBuilder()

	for (int i = 0; i < length; i++) {
		sb.append(chars.charAt(rand.nextInt(chars.length())))
	}
	
	return sb.toString()
}


