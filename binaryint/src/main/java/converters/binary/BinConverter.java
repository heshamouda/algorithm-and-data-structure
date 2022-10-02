package converters.binary;

/*
 * Created on 02.10.2022
 */
/**
 * @author Ouda Hesham
 */

public class BinConverter {
	public static String toString(int x) {
		final int N = 8;
		String s = "";
		while (s.length() != N) {
			if ((x & 1) != 0)
				s = "1" + s;
			else
				s = "0" + s;
			x = x >>> 1;
		}
		return s;
	}

	public static int fromString(String text) {
		final int N = 8;
		int x = 0;
		for (int i = 0; i < N; i++) {
			x = x << 1;
			if (text.charAt(i) == '1')
				x = x | 1;
		}
		return (byte) x; // od. x<<(32-N)>>(32-N)
	}
}