Feature: Facebook

  Scenario: : Facebook unsuccessful login

    Given siteye git "https://www.facebook.com/"
    When Facebook email textBox and password textBox gir
      | email    | kullanıcı1@gmail.com |
      | password | kullanıcı123         |

    And  facebook login butonuna tıklayınız
    Then başarısız girişi doğrulayınız
    And  siteden çıkınız
