package com.mycompany.assignment03;

import com.mycompany.assignment03.algorithms.SortingAlgorithms;
import com.mycompany.assignment03.classes.SyntheticData;
import com.mycompany.assignment03.comparators.SortByAll;
import com.mycompany.assignment03.comparators.SortByColor;
import com.mycompany.assignment03.comparators.SortByFabric;
import com.mycompany.assignment03.comparators.SortBySize;
import com.mycompany.assignment03.models.Tshirt;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        System.out.println("Give a number of t-shirts:");
        int x = scanner.nextInt();
        SyntheticData syntheticData = new SyntheticData(x);
        System.out.println("The t-shirts are:");
        ArrayList<Tshirt> ar = syntheticData.getManyTshirts();
        ArrayList<Tshirt> originalList = ar;
        for (Tshirt t : ar) {
            System.out.println(t);
        }

        firstChoice(ar, originalList);

    }

    private void firstChoice(ArrayList ar, ArrayList or) {

        System.out.println("Choose the type of sorting" +
                "\n\t1:Bubble Sort" +
                "\n\t2:Quick Sort" +
                "\n\t3:Bucket Sort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bubbleChoice(ar, or);
            case 2:
                quickChoice(ar, or);
            case 3:
                bucketChoice(ar, or);
            default:
                firstChoice(ar, or);

        }
    }

    private void bubbleChoice(ArrayList ar, ArrayList or) {
        System.out.println("Choose the type of sorting" +
                "\n\t1:Sort by color" +
                "\n\t2:Sort by size" +
                "\n\t3:Sort by fabric" +
                "\n\t4:Sort first by size, then color and lastly fabric");
        int choice = scanner.nextInt();
        System.out.println("The original list:");
        for (Object o : or) {
            System.out.println(o);
        }
        switch (choice) {
            case 1:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByColor());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByColor().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 2:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortBySize());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortBySize().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 3:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByFabric());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByFabric().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 4:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByAll());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bubbleSortAscending(ar, new SortByAll().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            default:
                bubbleChoice(ar, or);
        }
    }

    private void quickChoice(ArrayList ar, ArrayList or) {
        System.out.println("Choose the type of sorting" +
                "\n\t1:Sort by color" +
                "\n\t2:Sort by size" +
                "\n\t3:Sort by fabric" +
                "\n\t4:Sort first by size, then color and lastly fabric");
        int choice = scanner.nextInt();
        System.out.println("The original list:");
        for (Object o : or) {
            System.out.println(o);
        }
        switch (choice) {
            case 1:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByColor());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByColor().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 2:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortBySize());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortBySize().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 3:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByFabric());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByFabric().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 4:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByAll());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.quickSortAscending(ar, 0, ar.size() - 1, new SortByAll().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            default:
                quickChoice(ar, or);
        }
    }

    private void bucketChoice(ArrayList ar, ArrayList or) {
        System.out.println("Choose the type of sorting" +
                "\n\t1:Sort by color" +
                "\n\t2:Sort by size" +
                "\n\t3:Sort by fabric" +
                "\n\t4:Sort first by size, then color and lastly fabric");
        int choice = scanner.nextInt();
        System.out.println("The original list:");
        for (Object o : or) {
            System.out.println(o);
        }
        switch (choice) {
            case 1:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bucketSort(ar, new SortByColor());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bucketSort(ar, new SortByColor().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 2:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bucketSort(ar, new SortBySize());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bucketSort(ar, new SortBySize().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 3:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bucketSort(ar, new SortByFabric());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bucketSort(ar, new SortByFabric().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            case 4:
                System.out.println("The sorted list ascending:");
                SortingAlgorithms.bucketSort(ar, new SortByAll());
                for (Object o : ar) {
                    System.out.println(o);
                }
                System.out.println("The sorted list descending:");
                SortingAlgorithms.bucketSort(ar, new SortByAll().reversed());
                for (Object o : ar) {
                    System.out.println(o);
                }
                break;
            default:
                bucketChoice(ar, or);
        }

    }

}
