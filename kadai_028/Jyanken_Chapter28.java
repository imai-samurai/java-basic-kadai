package kadai.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分の出した手
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String myHand = scanner.nextLine();
			
			if(myHand.equals("r") || myHand.equals("s") || myHand.equals("p")) {
				scanner.close();
				return myHand;
			} else {
				System.out.println("r, s, p のいずれかを再度入力してください");
			}
		}
	}
	
	//相手の出した手（ランダム）
	public String getRandom() {
		
		String[] yourHand = {"r", "s", "p"};
		int rd = (int) Math.floor(Math.random() * 3);
		return yourHand[rd];
	}
	
	public void playGame(String my , String you) {
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		System.out.println("自分の手は" + hand.get(my) + ",対戦相手の手は" + hand.get(you));
		
		if(hand.get(my).equals(hand.get(you))) {
			System.out.println("あいこです");
		} else if (hand.get(my).equals("グー") && hand.get(you).equals("チョキ") ||
					hand.get(my).equals("チョキ") && hand.get(you).equals("パー") ||
					hand.get(my).equals("パー") && hand.get(you).equals("グー")) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
