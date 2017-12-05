package com.suppergerrie2.adventofcodehelper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Helper {

	public static String loadFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
	
	public static String loadFile(String day) {
		try {
			return loadFile(new File(day+".txt").getAbsolutePath(), Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
}
