package simpleparser;

public class Parser {
	private int res = Integer.MAX_VALUE;
	public int getResult() {
		return res;
	}
	public void parse(String toParse) {
		//take chars
        int lastValue = 0;
		char[] parseArray = toParse.toCharArray();
		BinaryOperand op = null;
		for (char needle : parseArray) {
			switch (needle) {
				case '+':
					op = new Plus();
					op.setOp(lastValue);
					lastValue = 0;
					break;
				case '-':
					break;
				case '/':
					break;
				case '*':
					break;
				default: //hopefully integer
					//48 = ascii 0; 57 = ascii 9
					if (needle > 47 && needle < 58) {
						if (lastValue >= 0) { 
							lastValue *= 10;
							lastValue += needle - 48;
						}
					}
					break;
			}
        }
		op.setOp(lastValue);
		res = op.exe();
	}
	
}
