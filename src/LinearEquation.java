public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String fractionSlope;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2)) * 100.0) / 100.0;
    }




    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
//        double slope = Math.round((double)(y2-y1) / (double)(x2-x1));
        return  (double) (y2 - y1) /  (x2 - x1);

    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {

        double v = y1 - (slope() * x1);
        return v;
    }

    public String fractionSlope() {
        int ySlope = y2 - y1;
        int xSlope = x2 - x1;
//        String fractionSlope = "";

        if (slope() % 1 != 0) {
            if ((ySlope < 0 && xSlope < 0) || (ySlope > 0 && xSlope > 0)) {
                fractionSlope = Math.abs(ySlope) + "/" + Math.abs(xSlope);
            } if ((ySlope < 0 && xSlope > 0) || (ySlope > 0 && xSlope < 0)){
                fractionSlope = "-" + Math.abs(ySlope) + "/" + Math.abs(xSlope);
            }
        } else {
            fractionSlope += slope();
        }
        return fractionSlope;
    }


    public String equation() {
        if (yIntercept() > 0) {
            return "y = " + fractionSlope() + "x + " + yIntercept();
        } else if (yIntercept() < 0){
            return "y = " + fractionSlope() + "x - " + Math.abs(yIntercept());
        } else {
            return "y = " + fractionSlope() + "x";
        }

    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
   both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
//        double yValue = Math.round((slope() * xValue) + yIntercept());
        double yValue = (double)((slope() * xValue) + yIntercept());
        String cord = "(" + xValue + ", " + yValue + ")";
        return cord;

    }



    public void lineinfo() {
        System.out.println("The two points are: ("+x1+", "+y1+") and ("+x2+", "+y2+")");
        System.out.println("The equation of the line between these points is: " + equation());
        System.out.println("The slope of this line is: " + slope());
        System.out.println("The y-intercept of the line is: " + yIntercept());
        System.out.println("The distance between the two points is: " + distance());
    }


}