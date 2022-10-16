package Factory;

import Product.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button submitButton = createButton();
    }

    // Subclass will override the following method to create specific button.
    public abstract Button createButton();
}
