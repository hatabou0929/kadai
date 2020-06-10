package デザインパターン課題;

public class SingletonTest {

	public static void main(String[] args) {
		Renban renbanA = Renban.getInstance();
		Renban renbanB = Renban.getInstance();

		System.out.println( renbanA.getNumber() );

		System.out.println( renbanB.getNumber() );

		System.out.println( renbanB.getNumber() );

		System.out.println( renbanA.getNumber() );

		System.out.println( renbanB.getNumber() );
	}

}
