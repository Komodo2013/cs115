package us.larsennet.school.week3;

public interface Payable {
    enum TYPES {
        CASH,
        CARD,
        PHONE
    }

    public TYPES getPayType();

    public void setPayType(TYPES t);
}
