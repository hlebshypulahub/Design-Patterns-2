package dp._3_structuralPatterns._3_facade.code;

import java.io.File;

public class MediaCodec {
	
	public byte[] decodeFile(File file) {
		if (file.getPath() == null) {
			return new byte[]{};
		}
		else if (file.getPath().endsWith("avi")
				|| file.getPath().endsWith("mp4")) {
			return new byte[] {0};
		}
		else {
			return new byte[]{};
		}
	}
}
