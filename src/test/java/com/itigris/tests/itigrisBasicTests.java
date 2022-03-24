package com.itigris.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Проверка элементов публичной части сайтов компании")
public class itigrisBasicTests extends BaseTest {

    /*
    @BeforeEach
    void preconditionBrowser() {
        baseUrl = "https://itigris.com";
        browserSize = "1920x1080";
    }

    @AfterEach
    void closeBrowser() {
        Selenide.closeWebDriver();
    }

*/

    //todo Фактический результат: В футере itigris.com стоит 2020 год. Ожидаемый результат: 2022
    @Test
    @DisplayName("Проверка текста на странице Team")
    void searshTextElement() {
        open("/team");
        $("#header-nav").shouldHave(text("ITIGRIS"));
        //$(byText("тратата")).shouldBe(visible); //negative test
        $(byText("Meet Our Team")).shouldBe(visible);
        $(".my-6").shouldHave(text("Michael Khurgin"));
        $(By.linkText("info@itigris.com")).isDisplayed();
        sleep(3000);
        //$$("#the-footer").find(text("© 2022 ITigris Ltd.")).shouldBe(visible); //negative test
        $$("#the-footer").find(text("© 2020 ITigris Ltd.")).shouldBe(visible);
    }

    @Test
    @DisplayName("Проверка названия в карточке кейса Essilor")
    void searchCasesTest() {
        open("/cases");
        $(byText("Our Success Stories")).isDisplayed();
        $("[href='/cases?project=essilor']").click();
        //$$("body").find(text("Alcon")).shouldBe(visible); //negative test
        $$("body").find(text("Essilor")).shouldBe(visible);
    }

    @ParameterizedTest(name = "Проверка поисковых результатов для запроса \"{0}\"")
    @CsvSource(value = {
            "EYNOA| Hoya Nulux EYNOA",
            "Kids| Hoya Hilux Kids"
    }, delimiter = '|')
    void searchLeansesTest(String testData, String expectedText) {
        Selenide.open("https://market.itigris.ru/catalog/lenses");
        $("body").shouldHave(text("Каталог очковых линз"));
        alertWindowMethod(); //алерт-окно
        $("input[placeholder='Поиск по названию']").setValue(testData).pressEnter();
        $(".filters-tags").shouldHave(text("Поиск по названию: " + testData));
        $$("#container").find(text(expectedText)).shouldBe(visible);
    }

    //todo На странице "Каталог оправ" не работает поиск по наименованию товара, если наименование из нескольких слов
    @DisplayName("Поиск товара по составному названию (fails)")
    @ParameterizedTest(name = "Проверка поисковых результатов для запроса \"{0}\"")
    @CsvSource(value = {
            "Marco|Enni Marco 11-901", //done
            "Enni Marco|Enni Marco 11-901", //fail
            "Enni Marco 11-901|Enni Marco 11-901" //fail
    }, delimiter = '|')
    void searchGlassesFramesTestFails(String testData, String expectedText) {
        Selenide.open("https://market.itigris.ru/catalog/glasses-frames");
        $("#frames-page").shouldHave(text("Каталог оправ"));
        $("input[placeholder='Поиск по названию']").setValue(testData).pressEnter();
        alertWindowMethod(); //алерт-окно
        $$("#container").find(text(expectedText)).shouldBe(visible);
    }

    @Test
    @DisplayName("Поиск товара по названию из одного слова: Marco (done)")
    void searchGlassesFramesTestDone() {
        Selenide.open("https://market.itigris.ru/catalog/glasses-frames");
        $("#frames-page").shouldHave(text("Каталог оправ"));
        $("input[placeholder='Поиск по названию']").setValue("Marco").pressEnter();
        alertWindowMethod(); //алерт-окно
        $$(".items-wrap").find(text("Enni Marco 11-901")).shouldBe(visible);
        //$("body").shouldHave(text("Enni Marco 11-901")); //вариант
        //$$(".items-wrap").find(text("Enni Marco 11-901")).shouldBe(visible);
    }

    @Test
    @DisplayName("Заполнить форму обратной связи")
    void fillFormTest() {
        open("/contact-us");
        $("input[placeholder='Enter your full name']").setValue("Olga Kos");
        $("input[placeholder='Enter your email address']").setValue("ok2304@test.test");
        $("input[placeholder='Enter your phone number']").setValue("+7921781хххх");
        $("input[placeholder='Enter your industry']").setValue("QA engineer");
        $$("span.el-checkbox__inner").last().click(); // Accept Privacy Policy
        //$x("//span[text()='SEND MESSAGE']").click();
        sleep(3000);
    }

    @Disabled
    @Tag("regress")
    @DisplayName("Это пропущенный тест")
    @Test
    public void skippedTest() {
        System.out.println("Тест пропущен");
    }

    @Tag("regress")
    @DisplayName("Это пропущенный тест")
    @Test
    public void failedTest() {
        assertTrue(false);
    }


    void alertWindowMethod() {
        //ЕСЛИ есть алерт:
        if ($x("//h3[contains(.,'ПОЛИТИКА БЕЗОПАСНОСТИ')]").is(exist)) {
            $("button[type='button']").pressEnter();
            //$(".closeAnnounce").click();
        }
    }
}