package verify.exam00;
import javax.swing.JOptionPane;
public class MyZeroExceptionMain
{
	public static void main(String[] args) 
	{
		try{
			int num=makeNum();
		}catch(Exception ee){
			System.out.println(ee);
		}finally{System.exit(1);}//console에서 gui사용
		
	}
	public static int makeNum() throws MyZeroException{
		int b=0;
		try{
			b=Integer.parseInt(
				 JOptionPane.showInputDialog(null,"숫자만 넣으시오"));
		}catch(Exception ee){//NumberFormatException 발생
			throw new MyZeroException("숫자만 넣어라!!!!");
		}
		return b;
	}
}
