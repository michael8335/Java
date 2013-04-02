package com.yf.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFile {
	public static String readFile(File file) throws IOException {
		StringBuffer sb = new StringBuffer(100);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
		} catch (FileNotFoundException e) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				System.out.println("ceateFile Error!");
			}
			System.out.println("FileNotFoundException");
		}
		try {
			while (br!=null&&br.read()!=-1) {
				sb.append(br.readLine());
				sb.append("\n");
			}
			br.close();
		} catch (IOException e) {
			System.out.println("readFile Error!");
			br.close();
		}
		return sb.toString();
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file=new File("d:\\a.txt");
		System.out.println(readFile(file));
	}

}
