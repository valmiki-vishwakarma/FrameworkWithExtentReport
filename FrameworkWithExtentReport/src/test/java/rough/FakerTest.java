package rough;

import static org.testng.Assert.assertTrue;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javafaker.Faker;

public class FakerTest {

	public static void main(String[] args) {

		Faker ukFaker = new Faker(new Locale("en-GB"));
		Faker usFaker = new Faker(new Locale("en-US"));

//		American zipcode: 92560  
//		British postcode: YF6H 9ND
//		American zipcode: 21070-5564
//		British postcode: YK5E 4ZX

		// System.out.println(String.format("American zipcode: %s",
		// usFaker.address().zipCode()));
		// System.out.println(String.format("British postcode: %s",
		// ukFaker.address().zipCode()));

		// System.out.println("I am the best expert on the planet..Thank God!!");
		System.out.println(String.format("American zipcode: %s", usFaker.address().zipCode()));
	    System.out.println(String.format("British postcode: %s", ukFaker.address().zipCode()));

	    Pattern ukPattern = Pattern.compile(
	      "([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|"
	      + "(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y]" 
	      + "[0-9]?[A-Za-z]))))\\s?[0-9][A-Za-z]{2})");
	    Matcher ukMatcher = ukPattern.matcher(ukFaker.address().zipCode());

	    assertTrue(ukMatcher.find());

	    Matcher usMatcher = Pattern.compile("^\\d{5}(?:[-\\s]\\d{4})?$")
	      .matcher(usFaker.address().zipCode());

	    assertTrue(usMatcher.find());
	    

	}

}
