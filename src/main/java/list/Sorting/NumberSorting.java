package main.java.list.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorting {
    private List<Integer> numberList;

    public NumberSorting() {
        this.numberList = new ArrayList<>();
    }

    public void addIntegerToList(int num) {
        numberList.add(num);
    }

    public List<Integer> ascendingSort() {
        List<Integer> ascendingSorted = new ArrayList<>(this.numberList);

        Collections.sort(ascendingSorted);

        return ascendingSorted;
    }

    public List<Integer> descendingSort() {
        List<Integer> descendingSorted = new ArrayList<>(this.numberList);

        descendingSorted.sort(Collections.reverseOrder());

        return descendingSorted;
    }

    public void showNumberList() {
        System.out.println(this.numberList);
    }

    public static void main(String[] args) {
        NumberSorting numberSorting = new NumberSorting();

        numberSorting.addIntegerToList(3);
        numberSorting.addIntegerToList(1);
        numberSorting.addIntegerToList(4);
        numberSorting.addIntegerToList(2);

        // unsorted
        numberSorting.showNumberList();

        // asc sorted
        System.out.println(numberSorting.ascendingSort());

        // desc sorted
        System.out.println(numberSorting.descendingSort());
    }
}
