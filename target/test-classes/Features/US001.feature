Feature:

  @eml
  Scenario: Kullanici google aramasi yapar
    Given kullanici google anasayfasina gider
    Then kullanici arayacagi metni "babayigit" girer ve arar
    Then kullanici sonuc sayisini alir
    Then kullanici sayfayi kapatir

    @ltf
  Scenario: Kullanici Google Para Karsilastirmasini Yapar
    Given kullanici google anasayfasina gider
    Then kullanici arayacagi para degerlerini "usd to euro" girer ve arar
    Then kullanici sonuc degerini alir
    Then kullanici aldigi degeri dogrular
    Then kullanici sayfayi kapatir