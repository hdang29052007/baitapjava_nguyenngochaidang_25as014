package baitap_oop.bai7.ex71;

import bai7.ex71.Visit;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        bai7.ex71.Visit v1 = new bai7.ex71.Visit("Hai Dang", new Date());
        v1.getCustomer().setMemberType("Premium");  // Premium 20%
        v1.setServiceExpense(100);
        v1.setProductExpense(50);

        System.out.println("=== Visit 1 ===");
        System.out.println(v1);

        bai7.ex71.Visit v2 = new bai7.ex71.Visit("Ngoc", new Date());
        v2.getCustomer().setMemberType("Silver");  // Silver 10%
        v2.setServiceExpense(200);
        v2.setProductExpense(100);

        System.out.println("\n=== Visit 2 ===");
        System.out.println(v2);

        bai7.ex71.Visit v3 = new Visit("Khách Lẻ", new Date()); // No membership
        v3.setServiceExpense(150);
        v3.setProductExpense(80);

        System.out.println("\n=== Visit 3 ===");
        System.out.println(v3);
    }
}

