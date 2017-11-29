package com.org.testPractice.automate.ui.wrappers;

public interface SeleniumInterface {

public void startApp(String browserName, String appUrl);

public void type(WebElement element, String data);

public WebElement findObject(String locatorType, String locatorValue);

public List<WebElement> findObjects(String locatorType, String locatorValue);

public void click(WebElement element);

public void selectByText(WebElement element, String optionVal);

public void selectByPos(WebElement element, int indexVal);

public void moveToFrame(WebElement element);

public void moveToWindow(int index);

public void acceptAlert();

public void dismissAlert();

public void getTitleText();

public void getElementText(WebElement element);

public void getAlertText();

public boolean verifyAttributeValue(WebElement element, String expectedText);

public boolean verifyText(WebElement element, String expectedText);

public void verifyAlertText(String expectedText);

public void verifyTitle(String expectedText);

public boolean verifyElementDisplayed(WebElement element);

public boolean verifyElementSelected(WebElement element);

public boolean verifyElementEnabled(WebElement element);

public void verifyDropDownOptions(WebElement element, List<String> expectedOptions);

public void waitForAnElement(WebElement element, int timeInSeconds, ExpectedConditions expectedCondition);

public void takeSnap();

}
