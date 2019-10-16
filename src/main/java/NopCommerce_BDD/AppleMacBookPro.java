package NopCommerce_BDD;

import org.openqa.selenium.By;

import static NopCommerce_BDD.Utils.clickElement;

public class AppleMacBookPro {

    LoadProp props = new LoadProp();

    private By _emailafriend=By.xpath("//input[@value='Email a friend']");

    public void clickonAProduct(){
        clickElement(_emailafriend);//click on the product Apple Mac Book Pro


    }
}
