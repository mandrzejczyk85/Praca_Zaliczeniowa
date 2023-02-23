Feature: Usuwanie Adresu
  Scenario Outline: Usuwanie "Pierwszego" Adresu
    Given     Uzytkownik znajduje sie na stronie glownej
    When      Uzytkownik klika w opcje Sign In w górnej czesci strony
    And       Uzytkownik loguje się do utworzonego wczesniej konta "<email>", "<haslo>"
    And       Uzytkownik przechodzi do dzialu z ubraniami Clothes
    And       Uzytkownik wybiera produkt np HUMMINGBIRD PRINTED SWEATER
    And       Uzytkownik wybiera domyślny rozmiar oraz ilosc i przechodzi do kasy
    Then      Uzytkownik przechodzi do strony wyboru adresu, tam go usuwa klikajac delete i przechodzi do strony glownej klikajac w lewym gornym rogu logo MY STORE
    And       Uzytkownik przechodzi do koszyka z zakupami
    And       Uzytkownik usuwa zakupy z koszyka, wylogowuje sie i zamyka przegladarke

    Examples:
    |email              |haslo |
    |testerski@tester.pl|aaaaa |