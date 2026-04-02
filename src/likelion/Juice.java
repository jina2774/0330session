package likelion;

public class Juice extends Beverage {

    private int sugar;

    public Juice(String name, int price,
                  int stock, int sugar) {
        super(name, price, stock);
        this.sugar = sugar;
    }

    @Override
    public void displayInfo() {
        System.out.println("이름: "   + getName());    // getter 사용
        System.out.println("가격: "   + getPrice() + "원");
        System.out.println("재고: "   + getStock() + "개");
        System.out.println("설탕: " + sugar + "g");
    }
}
