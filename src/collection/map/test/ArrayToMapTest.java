package collection.map.test;

import java.util.*;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
        
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] strings : productArr) {
            productMap.put(strings[0], Integer.valueOf(strings[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        for (String key : productMap.keySet()) {
            Integer value = productMap.get(key);
            System.out.println("제품: " + key + ", 가격: " + value);
        }
    }
}
