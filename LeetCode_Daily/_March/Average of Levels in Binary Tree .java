class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        long sum = 0;
        
        que.offer(root);
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = que.poll();
                sum += node.val;
                if(node.left != null)
                    que.offer(node.left);
                if(node.right != null)
                    que.offer(node.right);
            }
            result.add(sum * 1.0 / size);
            sum = 0;
        }
        return result;
        
    }
}