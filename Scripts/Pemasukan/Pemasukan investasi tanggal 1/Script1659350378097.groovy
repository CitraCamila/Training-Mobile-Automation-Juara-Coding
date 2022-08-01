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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.chad.financialrecord')

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Tab Pemasukan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 01 Agt 2022'), 0)

Mobile.tapAndHold(findTestObject('android.view.Tanggal- 1'), 0, 0)

Mobile.tap(findTestObject('android.widget.Button - OK Tanggal'), 0)

Mobile.tap(findTestObject('android.widget.Spinner Kategori'), 0)

Mobile.tap(findTestObject('android.widget.TextView - Kategori Investasi'), 0)

Mobile.setText(findTestObject('android.widget.EditText Jumlah'), '700000', 0)

Mobile.setText(findTestObject('android.widget.EditText Keterangan'), 'Reksadana', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIMPAN'), 0)

txtkategori = Mobile.getText(findTestObject('android.widget.TextView - Investasi'), 0)

Mobile.verifyElementText(findTestObject('android.widget.TextView - Investasi'), txtkategori)

txtket = Mobile.getText(findTestObject('android.widget.TextView - Reksadana'), 0)

System.out.println(txtket)

Mobile.verifyElementText(findTestObject('android.widget.TextView - Reksadana'), txtket)

