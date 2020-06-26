$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/feature/Whatsapp.feature");
formatter.feature({
  "line": 1,
  "name": "Whatsapp test",
  "description": "",
  "id": "whatsapp-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9464627046,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be notified if whatsapp application is open in some other tab of the same browser",
  "description": "",
  "id": "whatsapp-test;user-should-be-notified-if-whatsapp-application-is-open-in-some-other-tab-of-the-same-browser",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login screen of whatsapp web application is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens whatsapp web application in a new tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Switches back to previous tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "A popup with the message \u0027Whatsapp is open in another window. Click \"Use Here\" to use WhatsApp in this window\u0027 should be displayed with \u0027CLOSE\u0027 \u0026 \u0027USE HERE\u0027 options",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.login_screen_of_whatsapp_web_application_is_displayed()"
});
formatter.result({
  "duration": 9911284582,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_opens_whatsapp_web_application_in_a_new_tab()"
});
formatter.result({
  "duration": 5276150237,
  "status": "passed"
});
formatter.match({
  "location": "steps.switches_back_to_previous_tab()"
});
formatter.result({
  "duration": 69762378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Use Here",
      "offset": 69
    }
  ],
  "location": "steps.a_popup_with_the_message_whatsapp_is_open_in_another_window_click_something_to_use_whatsapp_in_this_window_should_be_displayed_with_close_use_here_options(String)"
});
formatter.result({
  "duration": 145685207,
  "status": "passed"
});
formatter.after({
  "duration": 634294060,
  "status": "passed"
});
formatter.before({
  "duration": 4851070125,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login page of whatsapp should get loaded by clicking on \u0027USE HERE\u0027 and in the previous tab the popup should be displayed",
  "description": "",
  "id": "whatsapp-test;login-page-of-whatsapp-should-get-loaded-by-clicking-on-\u0027use-here\u0027-and-in-the-previous-tab-the-popup-should-be-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "A popup with the message Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE \u0026 USE HERE is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on USE HERE option",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Login page of whatsapp should get loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "In the previous tab popup with message  Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE \u0026 USE HERE should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "steps.a_popup_with_the_message_whatsapp_is_open_in_another_window_click_use_here_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed()"
});
formatter.result({
  "duration": 99814941,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[contains(text(), \u0027Use Here\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.106)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MAHESH-PC\u0027, ip: \u0027192.168.1.102\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.106, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\mahesh\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:50890}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 6899592b12f3b398e43d162f2db10167\n*** Element info: {Using\u003dxpath, value\u003d//*[contains(text(), \u0027Use Here\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Cucumber.steps.a_popup_with_the_message_whatsapp_is_open_in_another_window_click_use_here_to_use_whatsapp_in_this_window_and_options_close_use_here_is_displayed(steps.java:77)\r\n\tat ✽.Given A popup with the message Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE \u0026 USE HERE is displayed(src/test/feature/Whatsapp.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "steps.user_clicks_on_use_here_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "steps.login_page_of_whatsapp_should_get_loaded()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "steps.in_the_previous_tab_popup_with_message_whatsapp_is_open_in_another_window_click_use_here_to_use_whatsapp_in_this_window_and_options_close_use_here_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 448549627,
  "status": "passed"
});
});