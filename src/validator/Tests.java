package validator;
//the tests should be under it's own package src/test

import static org.junit.Assert.*;
//adding build tool to the project will allow us to build the project without adding libraries to the classpath manually

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.junit.Test;

//the tests should b e written per Class and test the busines logic inside the tested class (subject under testing)
public class Tests {
	private static CreditCardVendorsReader reader = new CreditCardVendorsReader();
	private static ArrayList<CreditCardVendor> vendors = reader.returnVendorArray();
	private static CreditCardValidator validator = new CreditCardValidator();
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static CreditCardVendor vendorMasterCard = vendors.get(1);
	

	@Test
	public void testLengthOfNumberWhenCorrect() {
		String number = "5584239583699571";
		assertEquals(true, validator.checkValidity(vendorMasterCard, number));
	}
	
	@Test
	public void testLengthOfNumberWhenIncorrect() {
		String number = "55842395";
		assertEquals(false, validator.checkValidity(vendorMasterCard, number));
	}
	
	@Test
	public void testIINWhenCorrect() {
		String number = "5584239583699571";
		assertEquals(true, validator.checkValidity(vendorMasterCard, number));
	}
	
	@Test
	public void testIINWhenIncorrect() {
		String number = "7784239583699571";
		assertEquals(false, validator.checkValidity(vendorMasterCard, number));
	}
	
	@Test
	public void testLuhnAlghoritmWhenCorrect() {
		String number = "5584239583699571";
		assertEquals(true, validator.checkValidity(vendorMasterCard, number));
	}
	
	@Test
	public void testLuhnAlghoritmWhenIncorrect() {
		String number = "5584239583611111";
		assertEquals(false, validator.checkValidity(vendorMasterCard, number));
	}

}
