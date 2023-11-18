//Name : Rayan Ahmad Ghnimat.
// My number: 1211073.
// A quick idea about this project :
/* we have a file that contains a Country name with the percentage of people who use internet in that country 
 * so we did a lot of operations such as insert new record , delete record , search and display .
 */
package application;

public class IndividualsList {
	String IndiviualCountry;
	double percentageForIndiviual;

//#######################################################################################################################################################################################
	public IndividualsList(String indiviualCountry, double percentageForIndiviual) {
		IndiviualCountry = indiviualCountry;
		this.percentageForIndiviual = percentageForIndiviual;
	}
	// #######################################################################################################################################################################################

	public IndividualsList() {

	}
	// #######################################################################################################################################################################################

	@Override
	public String toString() {
		return "IndividualsList [IndiviualCountry=" + IndiviualCountry + ", percentageForIndiviual="
				+ percentageForIndiviual + "]";
	}
	// #######################################################################################################################################################################################

	public String getIndiviualCountry() {
		return IndiviualCountry;
	}
	// #######################################################################################################################################################################################

	public void setIndiviualCountry(String indiviualCountry) {
		IndiviualCountry = indiviualCountry;
	}
	// #######################################################################################################################################################################################

	public double getPercentageForIndiviual() {
		return percentageForIndiviual;
	}
	// #######################################################################################################################################################################################

	public void setPercentageForIndiviual(double percentageForIndiviual) {
		this.percentageForIndiviual = percentageForIndiviual;
	}
	// #######################################################################################################################################################################################

}
