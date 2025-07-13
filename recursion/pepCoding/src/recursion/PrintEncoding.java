package recursion;

public class PrintEncoding {
	public static void printEncoding(String str, String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
		}
		else if(str.length()==1) {
			char ch = str.charAt(0);
			if(ch == '0') {
				return ; 
			}
			else {
				int chv = ch -'0';
				char code = (char)('a'+chv-1);
				asf = asf +code;
				System.out.println(asf);
			}
		}
		else {
			char ch = str.charAt(0);
			String roq = str.substring(1);
			if(ch ==0) return;
			else {
				int chv = ch -'0';
				char code = (char)('a'+chv-1);
				printEncoding(roq, asf+code);
				}
			
			String ch12 = str.substring(0,2);
			String roq1 = str.substring(2);
			int ch12v = Integer.parseInt(ch12);
			if(ch12v<= 26) {
				char code =(char)('a'+ch12v+1);
				printEncoding(roq1,asf+code);
			}
		}
	}
	public static void main(String [] args) {
		// complete it
	}
}
