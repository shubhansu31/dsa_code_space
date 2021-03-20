class UndergroundSystem {

    private Map<Integer, Pair<String, Integer>> id_station;
    private Map<Pair<String, String>, Pair<Integer, Integer>> station_station;
    
    public UndergroundSystem() {
        id_station = new HashMap<>();
        station_station = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        id_station.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> prevStation = id_station.get(id);
        String prev = prevStation.getKey();
        int    time = prevStation.getValue();
        
        int timeTaken = t - time;
        
        Pair<String, String> key = new Pair(prev, stationName);
        Pair<Integer, Integer> pair = station_station.getOrDefault(key, new Pair(0,0));
        pair = new Pair(pair.getKey() + timeTaken, pair.getValue() + 1);
        
        station_station.put(key, pair);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        Pair<Integer, Integer> pair = station_station.get(new Pair(startStation, endStation));
        
        double sum = pair.getKey() * 1.0d;
        double times = pair.getValue() * 1.0d;
        
        return sum / times;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */