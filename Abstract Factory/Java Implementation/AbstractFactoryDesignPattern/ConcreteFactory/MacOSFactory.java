package ConcreteFactory;

import AbstractFactory.GUIFactory;
import Products.Button;
import Products.CheckBox;
import Products.MacOSButton;
import Products.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
