package verify.exam00;
public class UsingExMain 
{
	public static void main(String[] args) 
	{
		UsingEx exe=new UsingEx();
		//System.out.println(exe.adds(5,0));
		//System.out.println(exe.sub(5,6));//unreported exception;must be caught
		try{
			System.out.println(exe.sub(5,2));
			System.out.println(exe.subs(5,3));
			System.out.println(exe.sub(5,0));
		}catch(MyZeroException e){
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
	}
}
