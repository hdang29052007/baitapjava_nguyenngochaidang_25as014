package bai7.ex71;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;  // "Premium", "Gold", "Silver", or null

    public Customer(String name) {
        this.name = name;
        this.member = false;
        this.memberType = "None";
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        if (memberType.equalsIgnoreCase("Premium") ||
                memberType.equalsIgnoreCase("Gold") ||
                memberType.equalsIgnoreCase("Silver")) {
            this.member = true;
            this.memberType = memberType;
        } else {
            this.member = false;
            this.memberType = "None";
        }
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member + ", type=" + memberType + "]";
    }
}
