package kz.zhelezyaka.arrays.orderedInterface;

public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);

        array.insert(28);
        array.insert(12);
        array.insert(89);
        array.insert(34);
        array.insert(20);
        array.insert(23);
        array.insert(56);
        array.insert(78);
        array.insert(37);
        array.insert(62);

        int searchKey = 56;
        if (array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        array.display();

        array.delete(56);
        array.delete(78);
        array.delete(37);

        array.display();
    }
}
