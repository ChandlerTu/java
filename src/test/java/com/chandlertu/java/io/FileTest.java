package com.chandlertu.java.io;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class FileTest {

	@Test
	public void testListFiles() {
		File directory = new File("testListFiles");
		if (directory.exists()) {
			directory.delete();
		}
		Assert.assertFalse(directory.exists());

		File[] files = directory.listFiles();
		Assert.assertNull(files);

		if (!directory.exists()) {
			directory.mkdirs();
		}
		Assert.assertTrue(directory.exists());

		files = directory.listFiles();
		Assert.assertNotNull(files);
	}

}
