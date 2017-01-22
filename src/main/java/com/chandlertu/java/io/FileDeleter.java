package com.chandlertu.java.io;

import java.io.File;

public class FileDeleter {

	public boolean delete(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File f : files) {
					delete(f);
				}
			}
		}
		return file.delete();
	}

}
