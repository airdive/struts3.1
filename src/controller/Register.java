package controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private String username;

	private File uploadFile;

	private String uploadFileFileName;

	@Override
	public void validate() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String execute() throws IOException {
		// 输出username的值
		System.out.println("username的值是：" + username);
		// 取得上传后文件要存放的路径
		@SuppressWarnings("deprecation")
		String targetDirectory = ServletActionContext.getRequest().getRealPath("/upload");
		System.out.println(targetDirectory+" , "+uploadFileFileName);
		// 生成上传的File对象
		File target = new File(targetDirectory, uploadFileFileName);
		// 复制File对象，从而实现上传文件
		FileUtils.copyFile(uploadFile, target);

		return "register";
	}

}
