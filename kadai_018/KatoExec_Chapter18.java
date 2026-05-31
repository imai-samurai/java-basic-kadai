package kadai.kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.familyName = "加藤";
		taro.address = "東京野中野区〇×";
		taro.setGivenName();
		taro.execIntroduce();
		
		ichiro.familyName = "加藤";
		ichiro.address = "東京野中野区〇×";
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		hanako.familyName = "加藤";
		hanako.address = "東京野中野区〇×";
		hanako.setGivenName();
		hanako.execIntroduce();
	}

}
