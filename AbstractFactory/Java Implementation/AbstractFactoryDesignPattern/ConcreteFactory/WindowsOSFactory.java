package ConcreteFactory;

import AbstractFactory.GUIFactory;
import Products.Button;
import Products.CheckBox;
import Products.WindowsButton;
import Products.WindowsCheckBox;

public class WindowsOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
