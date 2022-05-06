Feature: Amazon arama

  Scenario Outline: Amazon java arama

    Given kullanıcı amazon sayfasına gider "https://www.amazon.com/"
    And "<products>" için arama yapar
    And  resimleri indirir
    And  sayfayı kapatır

    Examples:
      | products |
      | mango    |
