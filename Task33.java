package wokr33;

public class Task33 {
    public static void main(String[] args) {
        double cost = 1530.0;
        double procentMinus = 13.0;
        double procentPlus = 7.0;

//        double newCost = cost - cost * procentMinus / 100;
        double newCost = cost * (1 - procentMinus / 100);

        newCost = newCost * (1 + procentPlus / 100);

        System.out.println("Cost - >" + newCost );
        System.out.printf("%-15s%10.2f$\n%-15s%10.2f$", "Start Cost -> ", cost, "New Cost -> ", newCost);


    }
}
