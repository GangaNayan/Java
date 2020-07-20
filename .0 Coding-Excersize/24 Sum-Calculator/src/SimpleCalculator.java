public class SimpleCalculator {

    private double firstnumber;
    private double secondnumber;

    public double getFirstnumber(){
        return firstnumber;
    }
    public double getSecondnumber(){
        return secondnumber;
    }

    public void setFirstnumber(double firstnumber){
        this.firstnumber=firstnumber;
    }
    public void setSecondnumber(double secondnumber){
        this.secondnumber=secondnumber;
    }

    public double getadditionresult(){
        return firstnumber+secondnumber;
    }
    public double getsubtractionresult(){
        return firstnumber-secondnumber;
    }
    public double getmultiplicationresult(){
        return firstnumber*secondnumber;
    }
    public double getdivissionresult(){
        if(secondnumber==0){
            return -1;
        }else{
            return firstnumber/secondnumber;
        }
    }
}
