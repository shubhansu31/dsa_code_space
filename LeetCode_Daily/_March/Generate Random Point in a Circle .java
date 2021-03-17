class Solution {
    private double x;
    private double y;
    private double old_radius;
    private Random random;
    
    public Solution(double radius, double x_center, double y_center) {
        x = x_center;
        y = y_center;
        old_radius = radius;
        this.random = new Random();
    }
    
    public double[] randPoint() {
        double randians = random.nextDouble() * 2 * Math.PI;
        double radius = old_radius * Math.sqrt(random.nextDouble());
        
        double point1 = x + radius * Math.cos(randians);
        double point2 = y + radius * Math.sin(randians);
        
        return new double[] {point1 , point2};
    }
}
