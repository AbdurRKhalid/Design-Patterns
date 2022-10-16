package ConcreteProduct;

import Product.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> Test Button </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button Says - 'Hello World!'");
    }
}
