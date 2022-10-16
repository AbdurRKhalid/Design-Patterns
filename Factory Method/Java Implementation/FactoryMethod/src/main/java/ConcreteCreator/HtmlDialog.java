package ConcreteCreator;

import ConcreteProduct.HtmlButton;
import Factory.Dialog;
import Product.Button;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
