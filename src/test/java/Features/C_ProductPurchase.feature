Feature: Zakup Produktu
 Scenario Outline: Sprawdzenie poprawności wykonania zakupu produktu
   Given  Uzytkownik znajduje sie na glownej stronie
   And    Uzytkownik klika w opcje Sign In w gornej czesci strony
   And    Uzytkownik loguje sie do utworzonego wczesniej konta "<email>", "<haslo>"
   And    Uzytkownik przechodzi do dzialu z ubraniami
   And    Uzytkownik wybiera produkt HUMMINGBIRD PRINTED SWEATER
   And    Uzytkownik wybiera "<rozmiar>" i "<ilosc>" koszulek, sprawdza czy widnieje "<rabat>" 20% oraz dodaje do koszyka i przechodzi do kasy
   And    Uzytkownik potwierdza adres wysylki
   And    Uzytkownik wybiera metode dostawy
   And    Uzytkownik wybiera opcje zaplaty, potwierdza zapoznanie sie z regulaminem i sklada zamowienie
   Then   Uzytkownik przechodzi do zakladki ORDER HISTORY AND DETAILS w zakladce Your account i sprawdza czy jego zamówienie znajduje się w historii zamówien
   And    Uzytkownik wylogowuje sie Sign out i zamyka przegladarke


   Examples:
   |email               |haslo|rozmiar|ilosc|rabat    |
   |testerski@tester.pl |aaaaa|M      |5    |SAVE 20% |