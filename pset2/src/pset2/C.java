package pset2;

/**
 * Created by Aria Pahlavan on 3/20/17.
 */
public class C {
	String s;

	public C(String s) {
		this.s = s;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof C)) return false;

		C c = (C) o;

		return s != null ? s.equals(c.s) : c.s == null;
	}

	@Override
	public int hashCode() {
		return s != null ? s.hashCode() : 0;
	}


}