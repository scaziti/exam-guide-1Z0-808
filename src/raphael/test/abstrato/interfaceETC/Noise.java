package raphael.test.abstrato.interfaceETC;

public interface Noise {
	
	void makeNoise();
	
	default void test() {
		System.out.println("Hello");
	};

}
