import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/SoftwareTesting/index.php/admin/login')

WebUI.setText(findTestObject('Page_Login Admin/input_Email_email'), 'dian')

WebUI.setEncryptedText(findTestObject('Page_Login Admin/input_Password_password'), 'MMS/zmTQxAM=')

WebUI.sendKeys(findTestObject('Page_Login Admin/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Tokobuah Admin -/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Tokobuah Admin -/a_New Product'))

WebUI.setText(findTestObject('Object Repository/Page_Tokobuah Admin - Products/input_Name_name'), 'Anggur')

WebUI.setText(findTestObject('Object Repository/Page_Tokobuah Admin - Products/input_Price_price'), '111111111111')

WebUI.setText(findTestObject('Object Repository/Page_Tokobuah Admin - Products/textarea_Description_description'), 'Enak')

WebUI.uploadFile(findTestObject('Page_Tokobuah Admin - Products/input_Photo_image'), '/Users/didimuscandra/Pasphoto.jpeg')

WebUI.click(findTestObject('Object Repository/Page_Tokobuah Admin - Products/input_Description_btn'))

WebUI.verifyElementText(findTestObject('Page_Tokobuah Admin - Products/div_Berhasil disimpan'), 'Gagal disimpan')

