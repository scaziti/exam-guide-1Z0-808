package raphael.test.defaulT.values;

public class BookCorrigido {

	private String title;

	public String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		Book b = new Book();
		String s = b.getTitle();

		if (s != null) {
			String t = s.toLowerCase();
		}
		
	}

}
