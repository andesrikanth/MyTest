
public enum TestEnum {

	sri("Srikanth"),srav("Sravanthi");
	
	private String value; 
	private TestEnum(String value) { this.value = value; }
	public String value()
	  {
	    return this.value;
	  }
	
	public static TestEnum fromValue(String v)
	  {
	    for (TestEnum c : TestEnum.values()) {
	      if (c.value.equals(v)) {
	        return c;
	      }
	    }
	    throw new IllegalArgumentException(v);
	  }

}
