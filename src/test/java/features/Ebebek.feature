Feature: Ebebek

  Scenario: Ebebek Search

    Given "https://www.e-bebek.com/" sayfasına gidin
    When "ZIBIN" icin arama yapar
    And Arama içeriğinin "Zıbın" olduğunu doğrular
    And ilk sonuc sayfasinda listelenen urunleri yazdirir
    Then sayfayı kapatir


