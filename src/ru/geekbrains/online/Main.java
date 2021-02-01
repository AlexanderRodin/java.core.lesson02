package ru.geekbrains.online;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[][] arrList = {{"5", "5", "44", "14"}, {"10", "18", "11", "22"},
                {"10", "18", "11", "22а"}, {"10", "18", "11", "22"}};

        try {
            System.out.println("Sum of array elements: "+arr(arrList));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("MyArraySizeException, enter the correct array value");
        }
        catch (NumberFormatException y){
            y.printStackTrace();
            System.out.println("MyArrayDataException, error in transformation of array element!");
        }




    }

    public static int arr(String[][] array) throws ArrayIndexOutOfBoundsException,NumberFormatException  {
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            if(array.length>4) throw new ArrayIndexOutOfBoundsException();
            for (int j = 0; j < array[i].length; j++) {
                if(array[i].length>4) throw new ArrayIndexOutOfBoundsException();
            }
        }

        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    count += Integer.parseInt(array[i][j].trim());
                }
            }
           return count;

    }

}
