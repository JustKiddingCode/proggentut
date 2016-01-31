package simpleparser;

public enum Operator {
	PLUS("+", 5),
	MINUS("-", 5),
	MULT("*", 4),
	DIV("/",4);
        
        private final String sign;
        private final int order;
        
	private Operator(String sign, int order) {
		this.sign = sign;
		this.order = order;
	}
	public int getOrder() { return order; }
        
        @Override
	public String toString() { return sign; }

}
