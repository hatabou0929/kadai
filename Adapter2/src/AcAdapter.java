
class AcAdapter extends Dengen {
	private JapaneseConsent adaptee;

	 public AcAdapter(){
		this.adaptee = new JapaneseConsent();
	}

	public int kyuuden() {
		return (int)(adaptee.power() * 0.16);
	}
}
