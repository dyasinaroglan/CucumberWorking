Feature: Saucedemo visit

  Scenario: Sepete ürün ekleme

    Given "https://www.saucedemo.com" sitesine gidin
    When  username kısmına "standard_user" yazdırın
    And Password kutusuna "secret_sauce" yazdirin
    And Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    And  AddToCart butonuna basınız
    And  Alışveriş sepetine tıklayın
    Then Sectiginiz urunun basarili olarak sepete eklendigini control edin
    And sayfayı kapatın