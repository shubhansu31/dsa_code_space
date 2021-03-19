class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean viz[] = new boolean[rooms.size()];
        viz[0] = true;
        Queue<Integer> que = new LinkedList<>();
        for(int keys : rooms.get(0)){
            que.offer(keys);
        }
        
        while(!que.isEmpty()){
            int roomNumber = que.poll();
            if(viz[roomNumber] == false){
                viz[roomNumber] = true;
                for(int keys : rooms.get(roomNumber)){
                    que.offer(keys);
                }
            }
        }
        
        for(boolean res : viz){
            if(res == false)
                return false;
        }
        
        return true;
    }
}