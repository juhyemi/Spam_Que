// 캐시
package Programmers;

import java.util.ArrayList;

public class PG_2018_kakao_cache_S {
    public static void main(String[] args) {
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0){
            return cities.length * 5;
        }

        ArrayList<String> cache = new ArrayList<>();

        for(int i=0; i<cities.length; i++){
            // 캐시에 도시가 없는 경우
            if(!cache.contains(cities[i].toUpperCase())){
                if(cache.size() < cacheSize){
                    cache.add(cities[i].toUpperCase());
                    answer += 5;
                }else{
                    cache.remove(0);
                    cache.add(cities[i].toUpperCase());
                    answer += 5;
                }
            }else{ // 캐시에 도시가 있는 경우
                // 캐시에 도시를 지운다
                cache.remove(cities[i].toUpperCase());
                cache.add(cities[i].toUpperCase());
                answer += 1;
            }
        }

        return answer;
    }

    
}
