Feature: Test Internetowej Strony Zakupowej
  Scenario Outline: Sprawdzenie poprawności dodania pierwszego nowego adresu
    Given   Uzytkownik znajduje się na stronie glownej
    When    Uzytkownik klika w opcje Sign In na gorze strony
    And     Uzytkownik wpisuje poprawny aders "<email>" oraz "<haslo>"
    And     Uzytkownik klika w kafelek - ADD FIRST ADDRESS
    And     Uzytkownik wypelnia dane adresowe jak "<alias>", "<imie>", "<nazwisko>", "<adres>", "<miasto>", "<kod pocztowy>","<kraj>" oraz "<telefon>"
    Then    Uzytkownik sprawdza poprawnosc danych adresowych "<alias>","<imie>","<nazwisko>","<adres>","<miasto>","<kod pocztowy>","<kraj>","<telefon>"
    And     Uzytkownik wylogowuje sie i zamyka przegladarke



    Examples:
    |email              |haslo|alias|imie   |nazwisko |adres    |miasto   |kod pocztowy |kraj           |telefon  |
    |testerski@tester.pl|aaaaa|Dom  |Tester |Testerski|Prosta 51|Warszawa |01-001       |United Kingdom |501234567|