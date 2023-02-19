public class Point {
    private int x;
    private int y;

    Point(){
      x=0;
      y=0;  
    }

    Point(int x,int y){
        this.x=x;
        this.y=y;

    }

    public double distance(){
        // return Math.sqrt(Math.pow(this.x-0, 2)+Math.pow(this.y-0, 2));
        return Math.sqrt(x*x+y*y);
    }


    public double distance(int x2,int y2){

        return Math.sqrt(Math.pow(x2-this.x, 2)+ Math.pow(y2-this.y, 2));
    }

    class PointDemo{
        public static void main(String[] args) {
            Point p1=new Point(5,5);
            System.out.println(p1.distance());
            System.out.println(p1.distance(2,1));
        }
    }
}
