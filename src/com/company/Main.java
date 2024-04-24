package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File file = new File("testData_Apartments.txt");
        Scanner sc = null;

        Map<String, Integer> cityApCounter = new HashMap<>();
        Map<String, Apartment> priceOfApartment = new HashMap<>();


        List<Map.Entry<String, Integer>> list = new ArrayList<>(cityApCounter.entrySet());

        try {
            while (sc.hasNext()) {
                String city = sc.next();
                int numRooms = sc.nextInt();
                int quadr = sc.nextInt();
                int price = sc.nextInt();
                String phoneNumber = sc.next();
                Apartment ap = new Apartment(city, numRooms, quadr, price, phoneNumber);
                // list.add(ap);

                if(cityApCounter.containsKey(city)) {
                    cityApCounter.put(city, cityApCounter.get(city)+1);
                } else {
                    cityApCounter.put(city, 1);
                }

                if(!priceOfApartment.containsKey(price) || (priceOfApartment.containsKey(price) && ap.getPrice(price).compareTo(priceOfApartment.get(price).getPrice()) > 0)) {
                    priceOfApartment.put(price, ap);
                }
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        } finally {
            sc.close();
        }

        list.sort(Map.Entry.comparingByValue());

        List top3 = new ArrayList<>();
        for(Map.Entry el : cityApCounter.entrySet()) {
            if (top3.size() == 3) break;
            top3.add(el.getKey());
        }


        File file2 = new File("Apartments.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter output = null;

        try {
            output = new PrintWriter(file2);

            // for (Entry<K, V> entry : list) {
            // }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert output != null;
            output.close();
        }


    }
}
