package com.mx.test;

import java.io.File;

import net.sourceforge.tess4j.Tesseract1;

public class OCR {
	 
	public static void main(String[] args) {
		try { 
			File imageFile = new File("img/test.jpg");  
			Tesseract1 instance = new Tesseract1();
			instance.setDatapath("tessdata");
	        instance.setLanguage("eng");//选择字库文件（只需要文件名，不需要后缀名） 
	        String result = instance.doOCR(imageFile);//开始识别
	        System.out.println(result);//打印图片内容
		} catch (Exception e) {
			 System.out.println(e.toString());//打印图片内容
		}
		
	}
}
