
public class SwitchDemo {

	public static void main(String[] args) {
		// for (int i = 1; i <= 10; i++) {

		int key = 1;

		String result = switch (key) {
		case 1: {

			yield "Choice 1";
		}
		default:
			// throw new IllegalArgumentException("Unexpected value: " + key);
			yield "Invalid ";
		};
		System.out.println(result);

		int choice = 1;

		String response = switch (choice) {
		case 1 -> {
			yield "Zero balance";
		}
		case 2 -> {
			yield "get loan";
		}

		case 3 -> {
			yield "find mob=ney";
		}

		default -> throw new IllegalArgumentException("Unexpected value: " + key);
		};

		System.out.println(response);
	}

}
//}
