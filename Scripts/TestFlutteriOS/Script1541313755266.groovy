import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/DannyYang/dev/projects/DevOps/MobileTestAPP/flutter-calculator-master/build/ios/iphonesimulator/Runner.app', 
    true)

Mobile.tap(findTestObject('FlutterTest/XCUIElementTypeButton - 7'), 0)

Mobile.tap(findTestObject('FlutterTest/XCUIElementTypeButton - '), 0)

Mobile.tap(findTestObject('FlutterTest/XCUIElementTypeButton - 3'), 0)

Mobile.tap(findTestObject('FlutterTest/XCUIElementTypeButton -  (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/FlutterTest/Result'), 5)

//Mobile.verifyElementText(findTestObject('Object Repository/FlutterTest/Result'), '10')

// TODO: 暫時無法驗證屬性
//Mobile.verifyElementAttributeValue(findTestObject('Object Repository/FlutterTest/Result'), 'label', 10, 5)

Mobile.closeApplication()

