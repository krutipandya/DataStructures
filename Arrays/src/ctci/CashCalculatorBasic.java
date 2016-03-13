/**
 * 
 */
package ctci;

/**
 * @author G500s
 *
 */
import java.math.BigDecimal; 
public class CashCalculatorBasic { 
	public BigDecimal getCalculatedAvailableBalance(BigDecimal currentBalance, BigDecimal totalDebits, BigDecimal totalCredits) 
	{ 
		BigDecimal result = currentBalance.subtract(totalDebits).add(totalCredits); 
		System.out.println("The calculated result is " + result); return result; 
	} 
	public static void main(String[] args) 
	{ 
		new CashCalculatorBasic().getCalculatedAvailableBalance( new BigDecimal("1250.00"), new BigDecimal("250.00"), new BigDecimal("500.00")); 
	}  
}
