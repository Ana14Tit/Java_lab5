package lab05;

class SomeBean {
	  
	@AutoInjectable
	private SomeInterface someField;
	
	@AutoInjectable
	private SomeOtherInterface otherField;

	public SomeBean() {}
	
	public void start()
		{
	      someField.doSome();
	      otherField.doSome();
	    }
}