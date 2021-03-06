package homeWork_3_rozetkaCheckFilter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class EntrancePage {
  
  
  private final WebDriver driver;

  public EntrancePage(final WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver, this);
  }
  public ResultSearchPage navigeteByParcialLink(String partialLink){
    String fullLink=String.format("%s%s", driver.getCurrentUrl(), partialLink);
    driver.get(fullLink);
    return new ResultSearchPage(driver); 
  }
}

