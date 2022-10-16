package Client;

import ConcreteCreator.WindowsDialog;
import Factory.Dialog;
import Product.Button;

public class Test {
    private static Dialog dialog;
    public static void main(String[] args) {
        dialog = new WindowsDialog();
        Button button = dialog.createButton();
        button.onClick();
    }
}
