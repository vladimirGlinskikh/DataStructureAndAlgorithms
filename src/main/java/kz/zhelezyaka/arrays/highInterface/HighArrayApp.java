package kz.zhelezyaka.arrays.highInterface;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

        array.insert(34);
        array.insert(67);
        array.insert(12);
        array.insert(56);
        array.insert(18);
        array.insert(69);
        array.insert(49);
        array.insert(27);
        array.insert(36);
        array.insert(10);
        array.display();

        int searchKey = 49;
        if (array.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        array.delete(27);
        array.delete(10);
        array.delete(12);
        array.display();
    }
}
