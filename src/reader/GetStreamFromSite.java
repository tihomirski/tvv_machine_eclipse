package reader;
//
//import com.stemologica.utils.UiTestUtil;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class GetStreamFromSite {
//
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = UiTestUtil.newHiddenDriver();
//        driver.get("https://www.trading212.com/en/login");
//        UiTestUtil.waitForPageToLoad(driver);
//
//        driver.findElement(By.id("username-real")).sendKeys("solutions.tisoft@gmail.com");
//        driver.findElement(By.id("pass-real")).sendKeys("$h2057aa");
//        driver.findElement(By.className("button-login")).click();
//
//        UiTestUtil.waitForPageToLoad(driver);
//
//        Thread.sleep(15000);
//
//        while (true) {
////            String sellStr = driver.findElement(By.xpath("/div[@id='tradePanel']/div[position()=4]/div[position()=3]/div[position()=3]/div[position()=1]/div[@data-code='EURUSD']/div[position()=2]/div[position()=5]/div/div/span[position()=1]")).getText();
////            String buyStr = driver.findElement(By.xpath("/div[@id='tradePanel']/div[position()=4]/div[position()=3]/div[position()=3]/div[position()=1]/div[@data-code='EURUSD']/div[position()=2]/div[position()=5]/div/div/span[position()=2]")).getText();
//
//            // These are obtained by right-clicking on the element in the FireBug -> Cy -> Copy selector.
//            // The last option in the menu can be Copy XPath or other cool options.
//
////            String html = By.tagName("html").toString();
////            System.out.println("\n---------------\n" + html + "\n-----------\n");
//
//            String sellStrSelectorValue = "//*[@id=\"uniqName_0_63-compact-view\"]/div/span[1]";
//            String buyStrSelectorValue = "#uniqName_0_71-compact-view > div > span.buy-sell-price-container.buy";
//
//            if (driver.findElement(By.cssSelector(sellStrSelectorValue)) == null) {
//                sellStrSelectorValue = "#uniqName_0_63-compact-view > div > span.buy-sell-price-container.sell";
//                buyStrSelectorValue = "#uniqName_0_63-compact-view> div > span.buy-sell-price-container.buy";
//            }
//            String sellStr = driver.findElement(By.cssSelector(sellStrSelectorValue)).getText();
//            String buyStr = driver.findElement(By.cssSelector(buyStrSelectorValue)).getText();
//            System.out.println(sellStr + " | " + buyStr);
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }
//
//
//
//}
