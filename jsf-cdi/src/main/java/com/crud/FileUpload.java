package com.crud;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.Part;


@Named(value="upload")
@RequestScoped
public class FileUpload {
	
	private Part uploadedFile; // +getter+setter
	private String fileName;
	private byte[] fileContents;

	public void upload() {
		System.out.println("uploaded");
	}

	public Part getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(Part uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileContents() {
		return fileContents;
	}

	public void setFileContents(byte[] fileContents) {
		this.fileContents = fileContents;
	}

}
