package raphael.test.string;

public class TestaStringBuilder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("123");
		builder.append("456").delete(2, 4);
		System.out.println(builder.toString());
		
		builder.append(789).insert(4, "insert");
		System.out.println(builder.toString());
		
		StringBuilder str = new StringBuilder("0123456789");
		str.insert(3, " abc ").replace(0, 2, "abc");
		System.out.println(str);
		
		StringBuilder builder2 = new StringBuilder("12345");
		builder2.replace(0, 2, "ab");
		System.out.println(builder2);
	}

}
