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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\Android-Solodroid_E-CommerceApp Demo_3.2.0.apk\\Solodroid_E-CommerceApp Demo_3.2.0.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/add to cart/add to cart'), 0)

Mobile.setText(findTestObject('Object Repository/checkout/android.widget.EditText'), '1', 0)

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/checkout/android.widget.EditText - Your Name'), 'clae', 0)

Mobile.setText(findTestObject('Object Repository/checkout/android.widget.EditText - your.emailgmail.com'), 'clae@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/checkout/android.widget.EditText - 628123456789'), '081291201021', 0)

Mobile.setText(findTestObject('Object Repository/checkout/address'), 'indonesia', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/checkout/android.widget.CheckedTextView - DHL Express'), 0)

Mobile.tap(findTestObject('Object Repository/checkout/checkout button'), 0)


Mobile.closeApplication()

