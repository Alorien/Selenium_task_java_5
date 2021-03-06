package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ProductPage{

    public ProductPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void checkProduct(String itemName){
        SearchPage sp = new SearchPage();
        Assert.assertEquals(sp.firstElem,
                BaseSteps.getDriver().findElement(By.xpath("//h1[@class='title title_size_28 title_bold_yes']")).getText());
    }


}
