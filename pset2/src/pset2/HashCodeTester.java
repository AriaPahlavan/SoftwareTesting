package pset2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Aria Pahlavan on 3/20/17.
 */

public class HashCodeTester {
/*
* P5: If two objects are equal according to the equals(Object)
* method, then calling the hashCode method on each of
* the two objects must produce the same integer result.
*/
// your test methods go here

	Object x = "aria";
	Object y = "aria";

	C cx = new C("aria");
	C cy = new C("aria");

	D dx = new D("aria", 23);
	D dy = new D("aria", 23);


	/**
	 * P1: For any non-null reference value x, x.equals(null) should return false.
	 */
	@Test
	public void t0() {
		assertFalse(new Object().equals(null));
	}

	/**
	 * P4: It is transitive: for any non-null reference values x, y, and z,
	 * if x.equals(y) returns true and y.equals(z) returns true, then
	 * x.equals(z) should return true.
	 */
	@Test
	public void t1() {
		testerTrue(x, y);
	}

	@Test
	public void t2() {
		testerFalse(x, cy);
	}

	@Test
	public void t3() {
		testerFalse(x, dy);
	}

	@Test
	public void t4() {
		testerFalse(cx, y);
	}

	@Test
	public void t5() {
		testerFalse(dx, y);
	}

	@Test
	public void t6() {
		testerTrue(cx, cy);
	}

	@Test
	public void t7() {
		testerFalse(cx, dy);
	}

	@Test
	public void t8() {
		testerFalse(dx, cy);
	}

	@Test
	public void t9() {
		testerTrue(dx, dy);
	}

	private void testerTrue(Object x, Object y) {
		assertTrue(x.equals(y) && x.hashCode() == y.hashCode());
	}

	private void testerFalse(Object x, Object y) {
		assertFalse(x.equals(y) && x.hashCode() == y.hashCode());
	}

}