package lang.enumeration.ref1;

import lang.enumeration.ex3.Grade;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
        return price * classGrade.getDiscountPercent() /100;
    }
}
