Feature: HerOkuApp site visit and click

  Scenario: HerOkuApp visit
    Given "https://the-internet.herokuapp.com/add_remove_elements/" go to site
    When Add element butonuna tıklayınız
    And  Delete butonunun görünür olduğunu doğrulayınız
    And Delete butonuna tıklayınız
    Then sayfayı kapatalım
