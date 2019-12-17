package jp.ac.uryukyu.ie.e195745;

import java.io.IOException;
import java.util.Scanner;

public class Ipponba_si_ {
	public static void main(String[] args) throws IOException {
		Ipponba_si_ game = new Ipponba_si_();
		game.townGate();
	}

	public void townGate() throws IOException
	{
		System.out.println("あなたはとある神の世界に迷い込んだ");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("\n\n創世神：この世界から出るためには、進むしかない。\n　　　　真っ直ぐ止まらずに進みなさい。");
		System.out.println("");

		String number = null;
		while(number == null) {
			System.out.println("1:はい");
			System.out.println("2:いいえ");
			System.out.println("選ぶ数字は半角で入力せよ。");

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String choice = input.next();

			switch(choice){
			case "1":						//もし1の『はい』を選んだなら
				number = choice;
				break;

			case "2":						//もし2の『いいえ』を選んだなら
				System.out.println("");
				System.out.println("GAME OVER");
				System.out.println("");
				System.out.println("あなたは知らない何かに食べられた。");
				System.in.read();						//エンターキーの入力待ち
				System.out.println("**コンテニューしたければ、エンターキーを2回押せ**");
				System.in.read();						//エンターキーの入力待ち
				System.in.read();						//エンターキーの入力待ち
				String[] args = null;
				main(args); // mainメソッドの最初に戻る
				number = choice;

			default:						//もし、1か2以外を選んだなら
				System.out.println("1 または 2のどちらかを選べ。");
			}
		}
		System.out.println(number +"を選びました。");
		//System.out.println("");
		System.in.read();
		System.out.println("\n\n創世神：よろしい。\n　　　　では、あなたの名前はなんだい？");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("\n\n名前を入力せよ。\nなお、入力は半角でも全角でも可。");

		@SuppressWarnings("resource")
		String playername= new java.util.Scanner(System.in).nextLine();		//プレイヤーの名前入力
		String weapon = "サバイバルナイフ";
		System.out.println("");
		System.out.println("創世神：では"+ playername +"よ。餞別だ。これを持って行くのだ!!");
		System.out.println("");
		System.in.read();						//エンターキーの入力待ち
		System.out.println(playername +"は"+ weapon +"を手に入れた。");
		System.out.println("...");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("...ロード中...");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("...");
		System.in.read();						//エンターキーの入力待ち
		System.out.println(playername + "は洞窟のようなところを進んでいる。");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("\n\n足元にピストルが落ちている。\n拾いますか？");
		System.out.println("");

		String number1 = null;
		while(number1 == null) {
			System.out.println("1:拾う");
			System.out.println("2:無視してそのまま進む");

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String choice = input.next();

			switch(choice){
			case "1":
				System.out.println("");
				System.out.println("GAME OVER");
				System.out.println("");
				System.out.println("あなたは知らない何かに食べられた。");
				System.in.read();						//エンターキーの入力待ち
				System.out.println("**コンテニューしたければ、エンターキーを2回押せ**");
				System.in.read();						//エンターキーの入力待ち
				System.in.read();						//エンターキーの入力待ち
				String[] args = null;
				main(args); // mainメソッドの最初に戻る
				number1 = choice;

			case "2":
				number1 = choice;
				break;

			default:						//もし、1か2以外を選んだなら
				System.out.println("1 または 2のどちらかを選べ。");
				//return ;
			}
		}
		System.out.println(number1 +"を選びました。");
		System.out.println("");
		System.in.read();
		System.out.println(playername +"はピストルを無視してそのまま進んだ。");
		System.in.read();						//エンターキーの入力待ち
		System.out.println("しばらく進むと分かれ道が出てきた。");
		System.in.read();
		System.out.println("どの道を行きますか？");
		System.out.println("");

		String number2 = null;
		while(number2 == null) {
			System.out.println("1:右に曲がる");
			System.out.println("2:左に曲がる");
			System.out.println("3:真っ直ぐ進む");
			System.out.println("4:来た道を戻る");

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String choice = input.next();

			switch(choice){
			case "1":
			case "2":
				System.out.println("");
				System.out.println("GAME OVER");
				System.out.println("");
				System.out.println("あなたは剣山が広がる落とし穴に落ちてしまった。");
				System.in.read();						//エンターキーの入力待ち
				System.out.println("**コンテニューしたければ、エンターキーを2回押せ**");
				System.in.read();						//エンターキーの入力待ち
				System.in.read();						//エンターキーの入力待ち
				String[] args = null;
				main(args); // mainメソッドの最初に戻る
				number2 = choice;

			case "3":
				number2 = choice;
				break;

			case "4":
				System.out.println("");
				System.out.println("GAME OVER");
				System.out.println("");
				System.out.println("後ろから大量のゴキブリが来てあなたは失神してしまった。");
				System.in.read();						//エンターキーの入力待ち
				System.out.println("**コンテニューしたければ、エンターキーを2回押せ**");
				System.in.read();						//エンターキーの入力待ち
				System.in.read();						//エンターキーの入力待ち
				String[] args2 = null;
				main(args2); // mainメソッドの最初に戻る
				number2 = choice;

			default:						//もし、1か2以外を選んだなら
				System.out.println("1 または 2のどちらかを選べ。");
		}
	}
		System.out.println("3を選びました。");
		System.out.println("");
		System.in.read();
		System.out.println(playername +"は真っ直ぐそのまま進んだ。");
		System.in.read();
		System.out.println("すると、後ろから叫び声が聞こえてきた。");
		System.in.read();
		System.out.println("あなたはどうしますか？");
		System.out.println("");

		String number3 = null;
		while(number3 == null) {
			System.out.println("1:立ち止まって後ろを確認する");
			System.out.println("2:振り向かず真っ直ぐ進む");

			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String choice = input.next();

			switch(choice){
			case "1":
				System.out.println("");
				System.out.println("GAME OVER");
				System.out.println("");
				System.out.println("あなたは後ろから来た何者かに襲われた。");
				System.in.read();						//エンターキーの入力待ち
				System.out.println("**コンテニューしたければ、エンターキーを2回押せ**");
				System.in.read();						//エンターキーの入力待ち
				System.in.read();						//エンターキーの入力待ち
				String[] args = null;
				main(args); // mainメソッドの最初に戻る
				number3 = choice;

			case"2":
				number3 = choice;
				break;

			default:						//もし、1か2以外を選んだなら
				System.out.println("1 または 2のどちらかを選べ。");
			}

		System.out.println("2を選びました。");
		System.out.println("");
		System.in.read();
		System.out.println("");



		}
	}
}
