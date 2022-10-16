import Product.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Button Type: Windows");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("The Windows Button Has Been Clicked!");
    }
}
