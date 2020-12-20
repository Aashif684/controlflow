package competitivecodings;

public class staticandinstanceflow {

	{
		System.out.println("FIB");//third and seventh
	}
	static {
		System.out.println("FSIB");//first static block
	}
	staticandinstanceflow(){
		System.out.println("Constructor");//fifth and ninth
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticandinstanceflow s=new staticandinstanceflow();//due to obj creation instance blocks are executed then constructor then main
		System.out.println("main");//sixth
		staticandinstanceflow s1=new staticandinstanceflow();//again for this obj from start separate copy is executed
	}
static {
	System.out.println("SSB");//second static block
}
{
	System.out.println("SIB");//fourth and eight
}
}
