package abstraction;

public abstract class PentiumComputer implements Computer{
	public void computerProcessor(){
		System.out.println("Pentium I");
	}
	public void computerRam(){
		System.out.println("8MB RAM");
		
	}
	public void computerMonitor(){
		System.out.println("12 inch Mono Monitor");
		
	}

}
