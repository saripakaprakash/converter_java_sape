package training.com;

public class TaxWhiz {

	
	private double currTaxRate;
	private double surChargeRate;
	
	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TaxWhiz(double currTaxRate, double surChargeRate) {
		super();
		this.currTaxRate = currTaxRate;
		this.surChargeRate = surChargeRate;
	}
	
	public double getcurrTaxRate() {
		return currTaxRate;
	}
	public void setcurrTaxRate(double currTaxRate) {
		this.currTaxRate = currTaxRate;
	}
	public double getsurChargeRate() {
		return surChargeRate;
	}
	public void setsurChargeRate(double surChargeRate) {
		this.surChargeRate = surChargeRate;
	}
	
	
	public double calcTax(double purchase){
		  double tax=(purchase)/(100)*currTaxRate;
		  double sur=(tax)/(100)*surChargeRate;
		  double payableAmount=purchase+tax+sur;  
		
		  return payableAmount;
	} 
	
	
}
