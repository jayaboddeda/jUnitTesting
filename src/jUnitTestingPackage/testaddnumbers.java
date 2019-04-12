package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import jUnitTestingPackage.jUnitFunction;

class testaddnumbers {

	@Test
	public void test() {
		jUnitFunction junit =new jUnitFunction();
		int result= junit.addnumbers(101, 200);
		assertEquals(301,result);
	
		}

}
