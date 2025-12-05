package bai7.ex71;

public class Discount {

    public static double getServiceDiscountRate(String type) {
        if (type == null) return 0;

        switch (type) {
            case "Premium": return 0.20;
            case "Gold":    return 0.15;
            case "Silver":  return 0.10;
            default:        return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        if (type == null) return 0;
        if (type.equals("None")) return 0.0;
        return 0.10;  // all members get 10% product discount
    }
}
