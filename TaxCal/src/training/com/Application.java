package training.com;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TaxWhiz tw = new TaxWhiz(10.00D,10.00D);
          
          double ans = tw.calcTax(1000.00D);
          System.out.println(ans);
        		  
	}

}
