package manifestUploads

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

def generateRandom(String chars,int length) {
	Random rand = new Random()

	StringBuilder sb = new StringBuilder()

	for (int i = 0; i < length; i++) {
		sb.append(chars.charAt(rand.nextInt(chars.length())))
	}

	return sb.toString()
}

@Keyword
def  wrongfileFormat() {



	//Creating a parameterized File Location Path
	String path = System.getenv('USERPROFILE')
	File fileGenerated=new File(path+"/git/MKOPA-RegressionTestingV2/Manifest Files/wrongformat.docx")

	//Checks if the file exists
	if(!fileGenerated.exists())
	{

		def serialNo=generateRandom('1234567890', 10)	
		def codeNumber=generateRandom('1234567890', 6)	
		def boxNumber=generateRandom('QWERTYUIOPLKJHGFDSAZXCVBNM1234567890',6)

		fileGenerated.append("UNIT SERIAL NO.,BOX # \r\n")
		fileGenerated.append(serialNo +'-'+ codeNumber +',' + boxNumber)}

	//Deletes the file if it exists
	 else {fileGenerated.delete()
		//Generates the file and stores it in the location

		
		def serialNo=generateRandom('1234567890', 10)	
		def codeNumber=generateRandom('1234567890', 6)	
		def boxNumber=generateRandom('QWERTYUIOPLKJHGFDSAZXCVBNM1234567890',6)
		
				fileGenerated.append("UNIT SERIAL NO.,BOX # \r\n")
				fileGenerated.append(serialNo +'-'+ codeNumber +',' + boxNumber)}
}

