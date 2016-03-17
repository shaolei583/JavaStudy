package com.gsww.java.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {

	public static void main(String[] args) throws Exception {
		File file = new File("hello.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		String path = file.getAbsolutePath();
		System.out.println(path);
		System.out.println(file.getPath());
		System.out.println(file.length());

		File file2 = new File("E:/2.avi");
		boolean b = file2.renameTo(new File("E:/1.avi"));
		System.out.println(file2.exists());
		System.out.println(b);
		System.out.println("-----------");
		File file3 = new File(".");
		File[] files = file3.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith("txt")){
					return true;
				}
				return false;
			}
		});
		for(File f:files){
			System.out.println(f.getName()+","+f.getAbsolutePath());
		}
	}
}
