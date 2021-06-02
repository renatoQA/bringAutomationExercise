Feature: Feature to create a trip on a ryanair website

  Scenario: Create a trip lisbon and paris and edit de informations
    Given that I access Ryanairs url
    When I fill the field FROM with Lisbon, "<Departure>"
    And I fill the field TO with Paris Beauvais, "<Return>"
    And I choose the date "<DateOne>" ,two-thousand and twenty one in the Depart field
    And I choose the date "<Month>","<DateTwo>",two-thousand and twenty one in the Return field
    And select two adults and one child in the Passengers field
    Then i click on search button
    Given that I change a departure "<dateOne>"
    And i change a return "<dateTwo>"
    And i select the tarifa value travel light
    And i click on login later button
    And i fill the informations of passenger one,"<NameOne>" and "<LastNameOne>"
    And i fill the informations of passenger two,"<NameTwo>" and "<LastNameTwo>"
    And i fill the informations of passenger three,"<NameThree>" and "<LastNameThree>"
    Then i click on continue button
    Given that i click on Okay button
    Then I choose first flight accommodations, "<SeatOne>", "<SeatTwo>", "<SeatThree>"
    And I click on continue button
    And i click on no thanks button
    Then i click on Overview button
    
    Examples:
    
    | Departure | Return | DateOne   | DateTwo  | Month |dateOne | dateTwo | NameOne | LastNameOne | NameTwo | LastNameTwo | NameThree | LastNameThree |SeatOne | SeatTwo|SeatThree|
    | Lisbon    | Paris  | 2021-06-06|2021-10-30| Oct   |Monday  | Sunday  | Sonia   | 	Pereira    | Diogo   | Bettencourt |  Ines     | Marçal        |seat-03A|seat-03B|seat-03C |
 