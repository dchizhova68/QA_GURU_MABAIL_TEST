package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;
@Tag("local")
public class LocalTests extends test.TestBase {

    @Test
    @DisplayName("Проверка поиска")
    void successfulSearchTest() {
        back();
        step("Отправляем запрос на поиск", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Проверяем, что есть результаты поиска ", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @DisplayName("Проверка открытия статьи")
    void successfulOpenFoundArticleTest() {
        back();

        step("Отправляем запрос на поиск", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Открываем первую найденную статью", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click());

        step("Проверяем описание", () ->
                $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldBe(hidden));
    }

    @Test
    @DisplayName("Проверка открытия статьи")
    void checkDescriptionTest() {
        back();

        step("Отправляем запрос на поиск", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });

        step("Проверяем описание", () ->
                $(id("org.wikipedia.alpha:id/page_list_item_description")).shouldHave(text("Automation for Apps")));
    }
}