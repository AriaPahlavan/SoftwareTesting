package pset2;

import static org.junit.Assert.*;

/**
 * Created by Aria Pahlavan on 3/20/17.
 */

import org.junit.Test;

public class EqualsTester {
	Object x = "aria";
	Object y = "aria";
	Object z = "aria";

	C cx = new C("aria");
	C cy = new C("aria");
	C cz = new C("aria");

	D dx = new D("aria", 23);
	D dy = new D("aria", 23);
	D dz = new D("aria", 23);


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
		testerTrue(x, y, z);
	}

	@Test
	public void t2() {
		testerFalse(x, y, cz);
	}

	@Test
	public void t3() {
		testerFalse(x, y, dz);
	}

	@Test
	public void t4() {
		testerFalse(x, cy, z);

	}

	@Test
	public void t5() {
		testerFalse(x, dy, z);
	}

	@Test
	public void t6() {
		testerFalse(cx, y, z);
	}

	@Test
	public void t7() {
		testerFalse(dx, y, z);
	}

	@Test
	public void t8() {
		testerTrue(cx, cy, cz);
	}

	@Test
	public void t9() {
		testerFalse(cx, cy, z);
	}

	@Test
	public void t10() {
		testerTrue(cx, cy, dz);
	}

	@Test
	public void t11() {
		testerFalse(cx, y, cz);
	}

	@Test
	public void t12() {
		testerFalse(cx, dy, cz);
	}

	@Test
	public void t13() {
		testerFalse(x, cy, cz);
	}

	@Test
	public void t14() {
		testerFalse(dx, cy, cz);
	}

	@Test
	public void t15() {
		testerTrue(dx, dy, dz);
	}

	@Test
	public void t16() {
		testerFalse(dx, dy, z);
	}

	@Test
	public void t17() {
		testerFalse(dx, dy, cz);
	}

	@Test
	public void t18() {
		testerFalse(dx, cy, dz);
	}

	@Test
	public void t19() {
		testerFalse(dx, y, dz);
	}

	@Test
	public void t20() {
		testerFalse(x, dy, dz);
	}

	@Test
	public void t21() {
		testerTrue(cx, dy, dz);
	}

	@Test
	public void t22() {
		testerFalse(dx, cy, z);
	}

	@Test
	public void t23() {
		testerFalse(x, cy, dz);
	}

	@Test
	public void t24() {
		testerFalse(x, dy, cz);
	}

	@Test
	public void t25() {
		testerFalse(dx, y, cz);
	}

	@Test
	public void t26() {
		testerFalse(cx, y, dz);
	}

	@Test
	public void t27() {
		testerFalse(cx, dy, z);
	}

	private void testerTrue(Object x, Object y, Object z){
		boolean f = x.equals(y);
		boolean s = y.equals(z);
		boolean t = x.equals(z);
		assertTrue(x.equals(y) && y.equals(z) && x.equals(z));
	}

	private void testerFalse(Object x, Object y, Object z){
		assertFalse(x.equals(y) && y.equals(z) && x.equals(z));
	}

}