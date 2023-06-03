package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.US_Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class MyStepdefs {
    US_Pages pages=new US_Pages();
    String equals;

    @Given("kullanici google anasayfasina gider")
    public void kullaniciGoogleAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
    }

    @Then("kullanici search butonuna tiklar")
    public void kullanici_search_butonuna_tiklar() {
        pages.searchButton.click();

    }
    @Then("kullanici sonuc sayisini alir")
    public void kullanici_sonuc_sayisini_alir() {
        String result=pages.result.getText();
        System.out.println(result);

    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Given("kullanici amazon anasayfasina gider")
    public void kullaniciAmazonAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici arayacagi metni girer ve arar")
    public void kullaniciArayacagiMetniGirerVeArar() {
        pages.amazonSearch.sendKeys("Cypress Book"+Keys.ENTER);
    }


    @Then("kullanici para turlerini {string} olarak girer")
    public void kullaniciParaTurleriniOlarakGirer(String karisaltirmaDegerleri) {
        pages.searchTextBox.sendKeys(karisaltirmaDegerleri+Keys.ENTER);
    }

    @Then("kullanici karsilatirma degerini alir")
    public void kullaniciKarsilatirmaDegeriniAlir() {
        equals=(pages.kasilastirmaDegeri.getText().replaceAll(",","."));

    }

    @Then("Kullanici karsilastirme degerini dogrular")
    public void kullaniciKarsilastirmeDegeriniDogrular() {
        Assert.assertTrue(Double.parseDouble(equals)<1.5);

    }

    @Then("kullanici arayacagi metni {string} girer")
    public void kullaniciArayacagiMetniStringGirer() {

    }

    @Then("kullanici arayacagi metni {string} girer ve arar")
    public void kullanici_arayacagi_metni_girer_ve_arar(String aranacakMetin) {

        pages.searchTextBox.sendKeys(aranacakMetin+Keys.ENTER);
    }

    @Then("kullanici arayacagi para degerlerini {string} girer ve arar")
    public void kullaniciArayacagiParaDegerleriniGirerVeArar(String karsilastirilacakpara) {
        pages.searchTextBox.sendKeys(karsilastirilacakpara+Keys.ENTER);
    }

    @Then("kullanici sonuc degerini alir")
    public void kullaniciSonucDegeriniAlir() {
        equals=pages.kasilastirmaDegeri.getText().replaceAll(",",".");

    }

    @Then("kullanici aldigi degeri dogrular")
    public void kullaniciAldigiDegeriDogrular() {
        Assert.assertTrue(Double.parseDouble(equals)<1.5);
    }
}