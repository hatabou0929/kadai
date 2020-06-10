package デザインパターン課題;

class Renban {
	private static Renban renban = new Renban();
	private int number;
	private Renban() {
		number = 0;
	}
	public static Renban getInstance() {
	return renban;
	}
	public String getNumber() {
		if(number<10000) {
		number = number+1;
		String str =String.format("%04d", number);
		return str;
		}else {
			String str ="9999を超えた値はでません";
			return str;
		}

	}
}