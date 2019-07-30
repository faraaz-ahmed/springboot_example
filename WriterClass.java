package com.demo.spring;

public class WriterClass {
	
	private Writer writer;
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
	public void print(String message) {
		writer.write(message);
	}
//	public Writer getWrite() {
//		return write;
//	}
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
}
