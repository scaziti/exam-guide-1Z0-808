package raphael.test.string;

public class Testa {
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = s1 + "123"; // s2 passará a valer "abc 123", pois apontará para esse novo objeto
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1 += " winter"; // nesse caso é criado um novo objeto que s1 apontará "abc winter"
		System.out.println(s1);
		
		s1.concat(" 321"); // Aqui será criado um novo objeto de String, mas será perdido
		s1 = s1.concat(" ola"); // Aqui ocorre o mesmo, porém, o s1 se referenciará ao novo objeto
		System.out.println(s1);
	}

}
