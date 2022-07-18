package dp._2_creationalPatterns._5_singleton.code;

import java.io.Serializable;

/**
 * @author apuchals
 */
@SuppressWarnings("serial")
//public final class DataBaseConnection implements Serializable {
//
//	private static DataBaseConnection INSTANCE = new DataBaseConnection();
//
//	private DataBaseConnection() {
//	}
//
//	public static DataBaseConnection getInstance() {
//		return INSTANCE;
//	}
//
//}

public enum DataBaseConnection implements Serializable {

	INSTANCE;

	public static DataBaseConnection getInstance() {
		return INSTANCE;
	}

}
