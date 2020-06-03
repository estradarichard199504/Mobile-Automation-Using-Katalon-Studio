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

Mobile.startApplication('C:\\Users\\Richard\\Desktop\\Automation\\Katalon\\estradarichard199504-github\\Mobile-Automation-Using-Katalon-Studio\\androidapp\\APIDemos.apk', 
    true)

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Animation'), 0)

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Bouncing Balls'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Cloning'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - RUN'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - RUN'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Custom Evaluator'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - PLAY'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - PLAY'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Default Layout Animations'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - 1'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - 2'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - ADD BUTTON'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Animations/android.widget.TextView0 - Events'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - PLAY'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - CANCEL'), 0)

Mobile.tap(findTestObject('Animations/android.widget.Button0 - END'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

