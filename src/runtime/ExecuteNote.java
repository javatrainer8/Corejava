package runtime;

import java.io.IOException;

public class ExecuteNote {

	public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad");
	}

}
