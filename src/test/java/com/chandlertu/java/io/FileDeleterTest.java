package com.chandlertu.java.io;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class FileDeleterTest {

	@Test
	public void testDelete() {
		File directory = createFiles();
		FileDeleter fileDeleter = new FileDeleter();
		Assert.assertTrue(fileDeleter.delete(directory));

	}

	private File createFiles() {
		File directory = new File("directory");
		if (!directory.exists()) {
			directory.mkdirs();
		}
		Assert.assertTrue(directory.exists());

		File directory1 = new File("directory" + File.separator + "directory1");
		if (!directory1.exists()) {
			directory1.mkdirs();
		}
		Assert.assertTrue(directory1.exists());

		File file1 = new File("directory" + File.separator + "file1");
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Assert.assertTrue(file1.exists());

		return directory;
	}

}
