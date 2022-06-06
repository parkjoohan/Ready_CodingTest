import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int lastTime = getMin("23:59");
        // 현재 주차 중인 차들
        Map<String, Integer> parking = new HashMap<>();
        // 차들의 누적 파킹시간
        Map<String, Integer> times = new HashMap<>();
        // 차들 list
        List<String> cars = new ArrayList<>();
        
        for(String record : records){
            String[] rc = record.split(" ");
            int time = getMin(rc[0]);
            String car = rc[1];
            
            // 새로운 차 들어오면 list와 누적 파킹시간에 넣는다
            if(!cars.contains(car)){
                cars.add(car);
                times.put(car, 0);
            }
            
            // 현재 파킹이 되어있으면 출차
            if(parking.containsKey(car)){
                times.put(car, times.get(car)+(time-parking.get(car)));
                parking.remove(car);
            } 
            
            // 파킹 안 되어 있다면 입차
            else {
                parking.put(car, time);
            }
        }
        
        int[] result = new int[cars.size()];
        Collections.sort(cars);
        
        for(int i=0; i<cars.size(); i++){
            // 기본 요금
            result[i] = fees[1];
            String car = cars.get(i);
            // 누적시간 중 기본요금 시간 제외
            int time = times.get(car)-fees[0];
            // 아직 출차 안되어있다면 마지막 시간으로 정산
            if(parking.containsKey(car))
                time += (lastTime-parking.get(car));
            // 요금 정산
            if(time>0)
                result[i] += (Math.ceil(time/(fees[2]*1.0))*fees[3]); 
        }
        
        return result;
    }
    
    public int getMin(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0])*60 + Integer.valueOf(t[1]);
    }
}