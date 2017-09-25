package com.dataojo.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileMethod {

	public static BufferedReader readFileReList(String file) throws UnsupportedEncodingException, FileNotFoundException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		return br;
	}
}
