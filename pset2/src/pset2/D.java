package pset2;

/**
 * Created by Aria Pahlavan on 3/20/17.
 */
public class D extends C {
	int g;

	public D(String s, int g) {
		super(s);
		this.g = g;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof D)) return false;
		if (!super.equals(o)) return false;

		D d = (D) o;

		return g == d.g && s.equals(d.s);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + g;
		return result;
	}
}
