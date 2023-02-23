Feature: Stworzenie nowego konta
  Scenario Outline: Sprawdzenie poprawności dodania nowego konta
    Given     Uzytkownik znajduje się na glownej stronie
    And       Uzytkownik klika w opcję Sign In w gornej czesci strony
    And       Uzytkownik klika w - No account? Create one here - poniżej przycisku Sign In
    Then      Uzytkownik uzupelnia dane do rejestracji konta "<imie>", "<nazwisko>", "<email>", "<haslo>" i klika przycisk Save
    And       Uzytkownik wylogowuje sie i zamyka chrome

    Examples:
    |imie |nazwisko  |email           |haslo|
    |Manny|Maniak    |mannny@maaniak.pl |aaaaa|

    # powyższe dane są już zajęte, lecz nadal aktualne
    # tzn nie można na nich już założyć nowego konta
    # wpisz swoje dane do testowania, mogą być wymyślone
    # w pozostałych krokach (B,C,D) używaj tych samych danych co przy zakładaniu nowego konta