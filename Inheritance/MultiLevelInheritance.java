class Wp1
{
	void Texting() {
		System.out.println("Texting...");	
	}
}

class Wp2 extends Wp1
{
	void voiceCall() {
		System.out.println("Voice Calling....");	
	}
}

class Wp3 extends Wp2
{
	void vedioCall() {
		System.out.println("Vedio Calling....");	
	}
}

class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		Wp1 w1 = new Wp1();
		w1.Texting(); // Texting....
		// w1.voiceCall(); // CTE
		// w1.vedioCall(); // CTE
		System.out.println("----------------------");
		Wp2 w2 = new Wp2();
		w2.Texting(); // Texting....
		w2.voiceCall(); // VoiceCalling....
		// w2.vedioCall(); // CTE
		System.out.println("----------------------");
		Wp3 w3 = new Wp3();
		w3.Texting(); // Texting....
		w3.voiceCall(); // VoiceCalling....
		w3.vedioCall(); // VedioCalling....
	}
}
