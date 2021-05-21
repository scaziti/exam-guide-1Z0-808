package raphael.test.string;

public class Testa {
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = s1 + "123"; // s2 passar� a valer "abc 123", pois apontar� para esse novo objeto
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1 += " winter"; // nesse caso � criado um novo objeto que s1 apontar� "abc winter"
		System.out.println(s1);
		
		s1.concat(" 321"); // Aqui ser� criado um novo objeto de String, mas ser� perdido
		s1 = s1.concat(" ola"); // Aqui ocorre o mesmo, por�m, o s1 se referenciar� ao novo objeto
		System.out.println(s1);
	}

}
