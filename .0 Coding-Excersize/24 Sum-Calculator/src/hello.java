public class hello {
    public static void main(String[] args){
        SimpleCalculator calculator=new SimpleCalculator();
        calculator.setFirstnumber(5);
        calculator.setSecondnumber(6);
//        calculator.getadditionresult();
//        calculator.getsubtractionresult();
//        calculator.getmultiplicationresult();
//        calculator.getdivissionresult();
        System.out.println("addition "+calculator.getadditionresult());
        System.out.println("subtraction "+calculator.getsubtractionresult());
        System.out.println("multiplication "+calculator.getmultiplicationresult());
        System.out.println("division "+calculator.getdivissionresult());
    }
}
