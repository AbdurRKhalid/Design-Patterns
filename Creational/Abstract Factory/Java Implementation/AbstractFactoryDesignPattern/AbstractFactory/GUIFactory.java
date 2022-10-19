package AbstractFactory;

import Products.Button;
import Products.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
