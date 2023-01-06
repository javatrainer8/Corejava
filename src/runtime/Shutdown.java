package runtime;

import java.io.IOException;

public class Shutdown {

	public static void main(String[] args) throws IOException {
      Runtime.getRuntime().exec("shutdown  -s -t 0");
	}

}
