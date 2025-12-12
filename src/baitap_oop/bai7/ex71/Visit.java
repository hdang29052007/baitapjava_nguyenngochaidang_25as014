package baitap_oop.bai7.ex71;

import baitap_oop.bai7.ex71.Customer;
import baitap_oop.bai7.ex71.Discount;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setServiceExpense(double amount) {
        this.serviceExpense = amount;
    }

    public void setProductExpense(double amount) {
        this.productExpense = amount;
    }

    public double getTotalExpense() {
        double serviceDiscount = Discount.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = Discount.getProductDiscountRate(customer.getMemberType());

        double finalService = serviceExpense * (1 - serviceDiscount);
        double finalProduct = productExpense * (1 - productDiscount);

        return finalService + finalProduct;
    }

    @Override
    public String toString() {
        return customer.toString() + ", Service Expense=" + serviceExpense +
                ", Product Expense=" + productExpense +
                ", Total=" + getTotalExpense();
    }
}
