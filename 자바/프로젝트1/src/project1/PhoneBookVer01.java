package project1;

import project1.ver01.PhoneInfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		PhoneInfo phoneInfo1 = new PhoneInfo("김미주", "010-2756-6155", "970622");
		phoneInfo1.showPhoneInfo();
	
		PhoneInfo phoneInfo2 = new PhoneInfo("미쥬", "010-2756-6155");
		phoneInfo2.showPhoneInfo();
	
	}
}
