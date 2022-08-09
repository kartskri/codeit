package reusable;

import java.util.*;

public class ManualComparator {

    public static void main(String [] s) {
        List<Map<String,String>> electronics = new ArrayList<>();


        Map<String,String> map1 = new HashMap<>();
        map1.put("price", "100");
        map1.put("name", "Camera");


        Map<String,String> map2 = new HashMap<>();
        map2.put("price", "200");
        map2.put("name", "Laptop");


        Map<String,String> map3 = new HashMap<>();
        map3.put("price", "90");
        map3.put("name", "WebCam");
        electronics.add(map1);
        electronics.add(map2);
        electronics.add(map3);


        List<Map<String,String>> accessories = new ArrayList<>();


        Map<String,String> amap1 = new HashMap<>();
        amap1.put("price", "50");
        amap1.put("name", "CameraBag");


        Map<String,String> amap2 = new HashMap<>();
        amap2.put("price", "80");
        amap2.put("name", "LaptopBag");


        Map<String,String> amap3 = new HashMap<>();
        amap3.put("price", "10");
        amap3.put("name", "MousePad");
        accessories.add(amap1);
        accessories.add(amap2);
        accessories.add(amap3);


        Map<String, List<Map<String,String>>> input = new HashMap<>();
        input.put("Electronics", electronics);
        input.put("Accessories", accessories);

        // Using Java8, sort the products in "Electronics" and "Accessories" by attribute "price" in desc order?

        Map<String, List<Map<String,String>>> ouput = new HashMap<>();


        System.out.println(input.get("Electronics"));

        //String key = "Electronics";
        for (String key: input.keySet()) {
            List<Integer> priceList = new ArrayList<>();
            for (Map<String, String> map : input.get(key)) {
                System.out.println(map);
                priceList.add(Integer.parseInt(map.get("price")));
            }

            // Sorted Price
            Collections.sort(priceList, Collections.reverseOrder());
            System.out.println("Sorted Price --> " + priceList);


            List<Map<String, String>> sortedLst = new ArrayList<>();
            for (Integer price : priceList) {
                for (Map<String, String> map : input.get(key)) {
                    if (price == Integer.parseInt(map.get("price"))) {
                        sortedLst.add(map);
                        continue;
                    }
                }
            }

            ouput.put(key, sortedLst);

        }


        System.out.println("Sorted List --> " + ouput);

    }
}
