
/******************************************************************************
 *  
 *  Purpose: To Check whether an Year is Leap or Not
 *
 *  @author  Pratik Prakash
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter a four digit year");
		int year = Utility.userIntegerInput();
		Utility.leapYear(year);
	}
}