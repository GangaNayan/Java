public class Flore {
    private double width;
    private double height;

    public Flore(double width,double height){
        this.width=width;
        this.height=height;
        if(width<0){
            this.width=0;
        }
        if(height<0){
            this.height=0;
        }

    }

    public double getArea(){
        return this.width*this.height;
    }
}
