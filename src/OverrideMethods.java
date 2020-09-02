
class OverrideMethods {
	public static void main(String srgs[]){
		Abc one=new Abc(3);
		Abc two=new Abc(4);
		System.out.println(one);
		System.out.println(one.equals(two));
	}

}
class Abc{
	int value;
	Abc(int val){
		value=val;
	}
	public int getValue(){
		return value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Abc)) {
			return false;
		}
		Abc other = (Abc) obj;
		if (value != other.value) {
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Abc [value=" + value + ", getValue()=" + getValue() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
}
