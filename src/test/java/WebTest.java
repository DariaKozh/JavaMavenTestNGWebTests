import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import static java.lang.Thread.*;

public class WebTest {

    @Test
    public void testMenuStartTitle() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']/ul[@id = 'menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();
        //sleep(1000);

        WebElement menuStart = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']"));
        menuStart.click();

        WebElement h2 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    //TC_11_01 Подтвердите, что на странице по базовой ссылке в правом верхнем углу пользователь
    // видит заголовок 99 Bottles of Beer
    //
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Считать заголовок в правом верхнем углу
    //3. Подтвердить, что текст заголовка соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void testMainHeader() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement mainHeader = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='header']/h1"));
        String actualResult = mainHeader.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    //TC_11_02 Подтвердите, что на странице по базовой ссылке последний пункт меню называется
    // Submit new Language
    //
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Считать название последнего пункта меню
    //3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void testMenuSubmitNewLanguageTitle() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit new Language".toUpperCase();

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                        "/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));
        String actualResult = menuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    //TC_11_03 Подтвердите, что на странице по базовой ссылке последний пункт меню имеет подзаголовок
    // Submit new Language
    //
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Считать название подзаголовка последнего пункта меню
    //3. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testSubmenuSubmitNewLanguageTitle() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                        "/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement SubmenuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']"));
        String actualResult = SubmenuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    //TC_11_04 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html ,
    // первый пункт подменю называется 0-9
    //
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Считать название первого подзаголовка
    //3. Подтвердить, что название подменю соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testSubmenu09Title() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submenu09 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']"));

        String actualResult = submenu09.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    //TC_11_06 Подтвердите, что имена создателей сайта:
    //Oliver Schade
    //Gregor Scheithauer
    //Stefan Scheler
    //
    //Шаги:
    //Напишите самостоятельно
    // (найдите информацию о создателях на сайте, и опишите шаги для навигации и исполнения тест кейса)
    @Test
    public void testCreatorsSiteTitles() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Oliver Schade";
        String expectedResult2 = "Gregor Scheithauer";
        String expectedResult3 = "Stefan Scheler";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submenuTeam = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']"));
        submenuTeam.click();

        WebElement creatorsSiteTitle1 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[1]"));
        String actualResult1 = creatorsSiteTitle1.getText();

        Assert.assertEquals(actualResult1, expectedResult1);

        WebElement creatorsSiteTitle2 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[2]"));
        String actualResult2 = creatorsSiteTitle2.getText();

        Assert.assertEquals(actualResult2, expectedResult2);

        WebElement creatorsSiteTitle3 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[3]"));
        String actualResult3 = creatorsSiteTitle3.getText();

        Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();

    }

    //TC_11_07 Придумайте и автоматизируйте свой собственный тест кейс на сайте
    // http://www.99-bottles-of-beer.net/
    //Проверить заголовок Category N в меню BrowseLanguages, подменю N
    @Test
    public void testTitleInSubmenuNMenuBrowseLanguages() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Category N";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']/ul[@id = 'menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();

        WebElement submenuN = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']/ul[@id = 'submenu']/li/a[@href='n.html']"));
        submenuN.click();

        WebElement titleInSubmenuN = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/h2"));
        String actualResult = titleInSubmenuN.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();

    }

    //TC_11_11 Подтвердите, что если на странице по ссылке
    // http://www.99-bottles-of-beer.net/submitnewlanguage.html ,  пользователь нажмет кнопку Submit Language,
    // не заполнив информацию в обязательных полях, будет показана ошибка
    //
    //Error: Precondition failed - Incomplete Input.
    //
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Нажать на кнопку Submit Language
    //3. Подтвердить, что на странице показана ошибка
    //4. Подтвердить, что текст ошибки соответствует ожидаемому
    //5. Закрыть браузер

    @Test
    public void testErrorInMenuSubmitNewLanguage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        boolean expectedResult1 = true;
        String expectedResult2 = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']" +
                        "/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));
        menuSubmitNewLanguage.click();

        WebElement buttonSubmitLanguage = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']" +
                        "/form[@id='addlanguage']/p/input[@name='submitlanguage']"));
        buttonSubmitLanguage.click();

        WebElement errorInMenuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/p"));
        boolean actualResult1 = errorInMenuSubmitNewLanguage.isDisplayed();
        String actualResult2 = errorInMenuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);

        driver.quit();

    }

    //TC_11_12 Precondition: Если на странице по ссылке
    // http://www.99-bottles-of-beer.net/submitnewlanguage.html ,
    // пользователь нажмет кнопку Submit Language,  не заполнив информацию в обязательных полях,
    // будет показана ошибка с текстом
    //
    //Error: Precondition failed - Incomplete Input.
    //
    //Подтвертите, что в тексте ошибки слова Error, Precondition, Incomplete и Input написаны с большой буквы,
    // а слово failed  написано  с маленькой буквы.
    //Так же подтвердите, что в тексте ошибки содержатся знаки :, -  и .
    //
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Нажать на кнопку Submit Language
    //3. Считать текст ошибки
    //4. Подтвердить requirenments
    //5. Закрыть браузер

    @Test
    public void testTextErrorInMenuSubmitNewLanguage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        boolean expectedResult1 = true;
        boolean expectedResult2 = true;
        boolean expectedResult3 = true;
        boolean expectedResult4 = true;
        boolean expectedResult5 = true;
        boolean expectedResult6 = true;
        boolean expectedResult7 = true;
        boolean expectedResult8 = true;

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement buttonSubmitLanguage = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']" +
                        "/form[@id='addlanguage']/p/input[@name='submitlanguage']"));
        buttonSubmitLanguage.click();

        WebElement errorInMenuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/p"));
        String textError = errorInMenuSubmitNewLanguage.getText();

        boolean actualResult1 = Character.isUpperCase(textError.charAt(textError.indexOf("Error")));
        boolean actualResult2 = Character.isUpperCase(textError.charAt(textError.indexOf("Precondition")));
        boolean actualResult3 = Character.isUpperCase(textError.charAt(textError.indexOf("Incomplete")));
        boolean actualResult4 = Character.isUpperCase(textError.charAt(textError.indexOf("Input")));
        boolean actualResult5 = Character.isLowerCase(textError.charAt(textError.indexOf("failed")));
        boolean actualResult6 = textError.contains(":");
        boolean actualResult7 = textError.contains("-");
        boolean actualResult8 = textError.contains(".");


        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);
        Assert.assertEquals(actualResult3, expectedResult3);
        Assert.assertEquals(actualResult4, expectedResult4);
        Assert.assertEquals(actualResult5, expectedResult5);
        Assert.assertEquals(actualResult6, expectedResult6);
        Assert.assertEquals(actualResult7, expectedResult7);
        Assert.assertEquals(actualResult8, expectedResult8);

        driver.quit();

    }

    //TC_11_13 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
    // в первом пункте списка пользователь видит текст
    //
    //IMPORTANT: Take your time! The more carefully you fill out this form
    // (especially the language name and description),
    // the easier it will be for us and the faster your language will show up on this page.
    // We don't have the time to mess around with fixing your descriptions etc. Thanks for your understanding.
    //
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Считать текст
    //3. Подтвердить, что текст соответствует ожидаемому
    //4. Закрыть браузер

    @Test
    public void testTextFirstPointInMenuSubmitNewLanguage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "IMPORTANT: Take your time! The more carefully you fill out this form (especially"
                + " the language name and description), the easier it will be for us and the faster"
                + " your language will show up on this page. We don't have the time to mess around with fixing"
                + " your descriptions etc. Thanks for your understanding.";

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement firstPointInMenuSubmitNewLanguage = driver.findElement
                (By.xpath("//body/div[@id='wrap']/div[@id='main']/ul/li[1]"));
        String actualResult = firstPointInMenuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }

    //TC_11_14 Подтвердите, что нажав на пункт меню Browse Languages,
    // пользователь увидит таблицу со следующими названиями для первого и второго столбцов:
    //Language
    //Author
    //
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Нажать на пункт меню Browse Languages
    //3. Считать названия первого и второго столбцов таблицы
    //3. Подтвердить, что названия соответствует ожидаемым
    //4. Закрыть браузер
    @Test
    public void testTableInMenuBrowseLanguages() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult1 = "Language";
        String expectedResult2 = "Author";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']/ul[@id = 'menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();

        WebElement column1TitleTableInMenuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/table[@id='category']/tbody/tr/th[1]"));
        String actualResult1 = column1TitleTableInMenuBrowseLanguages.getText();

        WebElement column2TitleTableInMenuBrowseLanguages = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/table[@id='category']/tbody/tr/th[2]"));
        String actualResult2 = column2TitleTableInMenuBrowseLanguages.getText();

        Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);

        driver.quit();
    }

        //TC_11_15 Подтвердите, что на странице по базовой ссылке пользователь НЕ увидит новые комментарии,
    // если нажмет на пункты меню Top List → New Comments
    //
    //Шаги:
    //Придумать самостоятельно.
        @Test
        public void testNewCommentInMenuTopListSubmenuNewComments() {

            String chromeDriver = "webdriver.chrome.driver";
            String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
            String url = "http://www.99-bottles-of-beer.net/";
            String expectedResult = "";

            System.setProperty(chromeDriver, driverPath);
            WebDriver driver = new ChromeDriver();

            driver.get(url);

            WebElement menuTopList = driver.findElement(
                    By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']" +
                            "/ul[@id = 'menu']/li/a[@href='/toplist.html']"));
            menuTopList.click();

            WebElement submenuNewComments = driver.findElement(
                    By.xpath("//body/div[@id ='wrap']/div[@id ='navigation']/" +
                            "ul[@id='submenu']/li/a[@href='./newcomments.html']"));
            submenuNewComments.click();

            WebElement newCommentInMenuTopListSubmenuNewComments = driver.findElement(
                    By.xpath("//body/div[@id ='wrap']/div[@id ='main']/p"));
            String actualResult = newCommentInMenuTopListSubmenuNewComments.getText();

            Assert.assertEquals(actualResult, expectedResult);

            driver.quit();
        }

         //TC_11_21 Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/submitnewlanguage.html
    // пользователь видит предупреждение IMPORTANT:, написанное белыми буквами bold шрифтом на красном фоне,
    // и что все буквы - capital
    //
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Считать слово IMPORTANT: из списка
    //3. Подтвердить requirenments
    //4. Закрыть браузер

    @Test
    public void testSCCTextIMPORTANTInMenuSubmitNewLanguage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\Павлик\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult1 = "red";
        String expectedResult2 = "white";
        String expectedResult3 = "bold";
        boolean expectedResult4 = true;

        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement textIMPORTANTInMenuSubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id ='wrap']/div[@id ='main']/ul/li/span/b"));
        String textIMPORTANT = textIMPORTANTInMenuSubmitNewLanguage.getText();

        String actualResult1 = textIMPORTANTInMenuSubmitNewLanguage.getCssValue("background-color").toString();
        String actualResult2 = textIMPORTANTInMenuSubmitNewLanguage.getCssValue("color").toString();
        String actualResult3 = textIMPORTANTInMenuSubmitNewLanguage.getCssValue("font-weight").toString();

       // Assert.assertEquals(actualResult1, expectedResult1);
        Assert.assertEquals(actualResult2, expectedResult2);

        //Assert.assertEquals(actualResult3, expectedResult3);

        driver.quit();
    }




}
