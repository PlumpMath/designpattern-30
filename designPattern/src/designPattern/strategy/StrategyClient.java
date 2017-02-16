package designPattern.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StrategyClient {

	public static void main(String[] args) {
		List<File> filesToCompress = getFilesToCompress("C:\files");
		FileCompressor fc = new FileCompressor();
		fc.setStrategy(new RarCompressionStrategy());
		fc.createArchive(filesToCompress); // ...
	}

	public static List<File> getFilesToCompress(String location) {
		return new ArrayList<File>();
	}
}
