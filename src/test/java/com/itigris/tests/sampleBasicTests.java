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

@DisplayName("Проверка элементов публичной части сайта")
public class sampleBasicTests extends TestBase {

    @Tag("siteTests")
    @DisplayName("Проверка текстов на главной странице")
    @Test
    void searshTextElement() {
        //open("/team");
        $(".section-title").shouldHave(text("Международные грузовые перевозки"));
        //<a href="/nashi-proekty/" id="menu4" class="anim" title="Проекты">Проекты</a>
        $("[href='/nashi-proekty/']").shouldBe(visible);
        //Как проехать?
        $(By.linkText("Как проехать?")).isDisplayed();
        $$(".yellow").find(text("© 2022. ARIVIST GROUP")).shouldBe(visible);
        //sleep(3000);
    }

    @Disabled
    @Tag("exampleTests")
    @DisplayName("Пример пропущенного теста")
    @Test
    public void skippedTest() {
        System.out.println("Пример пропущенного теста");
    }

    @Tag("exampleTests")
    @DisplayName("Пример упавшего теста")
    @Test
    public void failedTest() {
        assertTrue(false);
    }
}