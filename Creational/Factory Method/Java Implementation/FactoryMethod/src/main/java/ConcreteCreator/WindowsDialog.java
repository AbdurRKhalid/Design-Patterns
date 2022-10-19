package ConcreteCreator;

import ConcreteProduct.WindowsButton;
import Factory.Dialog;
import Product.Button;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
