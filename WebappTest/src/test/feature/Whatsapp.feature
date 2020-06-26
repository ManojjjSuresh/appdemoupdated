Feature: Whatsapp test

@TC01
Scenario: User should be notified if whatsapp application is open in some other tab of the same browser
Given Login screen of whatsapp web application is displayed
When User opens whatsapp web application in a new tab
And Switches back to previous tab
Then A popup with the message 'Whatsapp is open in another window. Click "Use Here" to use WhatsApp in this window' should be displayed with 'CLOSE' & 'USE HERE' options


@TC02
Scenario: Login page of whatsapp should get loaded by clicking on 'USE HERE' and in the previous tab the popup should be displayed
Given A popup with the message Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE & USE HERE is displayed
When User clicks on USE HERE option
Then Login page of whatsapp should get loaded
And In the previous tab popup with message  Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE & USE HERE should be displayed


@TC03
Scenario: Login page of whatsapp should get loaded by clicking on 'USE HERE' and in the previous tab the popup should be displayed
Given A popup with the message Whatsapp is open in another window Click Use Here to use WhatsApp in this window and options CLOSE & USE HERE is displayed
When User clicks on CLOSE option
Then Login page of whatsapp should get loaded
