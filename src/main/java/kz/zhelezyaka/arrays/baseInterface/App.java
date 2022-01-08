package kz.zhelezyaka.arrays.baseInterface;

public class App {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;

        arr.setElem(0, 12);
        arr.setElem(1, 43);
        arr.setElem(2, 23);
        arr.setElem(3, 89);
        arr.setElem(4, 34);
        arr.setElem(5, 14);
        arr.setElem(6, 67);
        arr.setElem(7, 19);
        arr.setElem(8, 35);
        arr.setElem(9, 40);
        nElems = 10;

        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");

        int searchKey = 89;
        for (j = 0; j < nElems; j++)
            if (arr.getElem(j) == searchKey)
                break;
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        int deleteKey = 14;
        for (j = 0; j < nElems; j++)
            if (arr.getElem(j) == deleteKey)
                break;
        if (j == nElems)
            System.out.println("Can't find " + deleteKey);
        else
            System.out.println("Found delete key " + deleteKey);

        for (int k = j; k < nElems; k++)
            arr.setElem(k, arr.getElem(k + 1));
        nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }
}
