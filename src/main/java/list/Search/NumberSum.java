package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class NumberSum {
    List<Integer> integerList;

    public NumberSum() {
        this.integerList = new ArrayList<>();
    }

    public void addNumberToList(int number) {
        integerList.add(number);
    }

    public int sum() {
        int total = 0;

        for (Integer number: integerList)
            total += number;
        return total;
    }

    public int findHighestNumber() {
        int highestNumber = Integer.MIN_VALUE;

        for (Integer number: integerList) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }
    public int findLowestNumber() {
        int lowestNumber = Integer.MAX_VALUE;

        for (Integer number: integerList) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }
        return lowestNumber;
    }

    public void showNumberList() {
        System.out.println(integerList);
    }

    @Override
    public String toString() {
        return "NumberSum {" +
                "integerList=" + integerList +
                "}\n";
    }

    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();

        numberSum.addNumberToList(60);
        numberSum.addNumberToList(45);
        numberSum.addNumberToList(23);
        numberSum.addNumberToList(74);
        numberSum.addNumberToList(112);
        numberSum.addNumberToList(132);
        numberSum.addNumberToList(50);
        numberSum.addNumberToList(102);
        numberSum.showNumberList();
        System.out.println("The result is: " + numberSum.sum());
        System.out.println("The lowest number on list is: " + numberSum.findLowestNumber());
        System.out.println("The highest number on list is: " + numberSum.findHighestNumber());
    }
}
