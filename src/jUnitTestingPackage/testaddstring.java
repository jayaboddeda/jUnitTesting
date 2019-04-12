package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import jUnitTestingPackage.jUnitFunction;

class testaddstring {

	@Test
	void test() {
		jUnitFunction jUnitstring=new jUnitFunction();
		String result=jUnitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
