package dp._3_structuralPatterns._3_facade.code;

import java.io.File;

public class FileReader {

	public File readFile(String fileName) {
		return new File(fileName);
	}
}
