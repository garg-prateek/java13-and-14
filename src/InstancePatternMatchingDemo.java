
public class InstancePatternMatchingDemo {

	public static void main(String[] args) {
		Object object = get();
//		if (object instanceof String) {
//			String str = (String) object;
//			System.out.println(str);
//		}

		if (object instanceof String str) {
			System.out.println(str);
		}
	}

	public static Object get() {
		return "Pattern matching in action";
	}
}
