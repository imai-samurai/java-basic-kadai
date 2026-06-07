package kadai.kadai_028;

public class JankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String my = jyanken.getMyChoice();
		String you = jyanken.getRandom();
		jyanken.playGame(my, you);
		
	}

}
