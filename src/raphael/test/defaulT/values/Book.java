package raphael.test.defaulT.values;

public class Book {
	
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		String s = b.getTitle();
		
		//NullPointerException, pois o valor padr�o � null. Null � diferente de uma String " "(vazia);
		String t = s.toLowerCase();
	}

}
