package designPattern.strategy;

import java.io.File;
import java.util.List;

public class FileCompressor {
	
	private CompressionStrategy strategy;

	public void setStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	public void createArchive(List<File> files) {
		strategy.compressFiles(files);
	}

}
