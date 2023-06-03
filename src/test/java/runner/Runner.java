package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/cucumber-reports.html",  // raporun adının ne olarak cıkmasını istiyorsak cucumber-reports --> ismini degistirebilirsiniz.
                    "json:target/json-reports/cucumber.json", // rapor sonucunu json formatında istenirse yapilir. cıkan sonuc kopyalanır browser dan jsonpath.com a gidilip yapistirilir.
                    "junit:target/xml-report/cucumber.xml" // xml rapor hazırlamak için kullanilir. json ve xml makina diliyle rapor yazar. herkes istemez pek kuılanilmaz. bazı işverenler isteyebilir.
            },
            features = "src/test/resources/features",
            glue = "stepdefinitions",
            tags = "@ltf",

            dryRun = false     // eksik adim varmi diye kontrol ettigimizde "false" i "true" yapiyoruz.
            // sonuc pass yazsada cikan sonuc test'in degil, yapilandirma nin yapildini gosterir.
    )

    public class Runner {
}


