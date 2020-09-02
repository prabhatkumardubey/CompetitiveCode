import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

class BigDecimalDoubt {
	public static void main(String[] args) {
	    int age = 30;
	    BigDecimal retireMentFund = new BigDecimal("10000.00");
	    retireMentFund.setScale(2,BigDecimal.ROUND_HALF_UP);
	    BigDecimal yearsInRetirement = new BigDecimal("20.00");
	    String name = " Dennis";
	    for ( int i = age; i <=65; i++){
	        recalculate(retireMentFund,new BigDecimal("0.10"));
	    }
	    BigDecimal monthlyPension =   retireMentFund.divide(
	        yearsInRetirement.divide(new BigDecimal("12"),MathContext.DECIMAL128), 2, RoundingMode.HALF_UP
	    );
	    System.out.println(name+ " will have £" + monthlyPension +" per month for retirement");
	}

	public static void recalculate (BigDecimal fundAmount, BigDecimal rate){
	    fundAmount.multiply(rate.add(new BigDecimal("1.00")));
	}

}
