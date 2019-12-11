package com.team404.command;

import java.sql.Timestamp;

public class SnsBoardVO {
	
	@Override
	public String toString() {
		return "SnsBoardVO [bno=" + bno + ", writer=" + writer + ", uploadPath=" + uploadPath + ", fileloca=" + fileloca
				+ ", fileName=" + fileName + ", fileRealName=" + fileRealName + ", content=" + content + ", regdate="
				+ regdate + "]";
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public String getFileloca() {
		return fileloca;
	}
	public void setFileloca(String fileloca) {
		this.fileloca = fileloca;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileRealName() {
		return fileRealName;
	}
	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	private int bno;
	private String writer; //글쓴이
	private String uploadPath; //fileLoca를 포함한 업로드 경로
	private String fileloca; //날짜폴더경로
	private String fileName; //변경해서 저장할 이름
	private String fileRealName; //원본이름
	private String content; //내용
	private Timestamp regdate; //등록일
	public SnsBoardVO(int bno, String writer, String uploadPath, String fileloca, String fileName, String fileRealName,
			String content, Timestamp regdate) {
		super();
		this.bno = bno;
		this.writer = writer;
		this.uploadPath = uploadPath;
		this.fileloca = fileloca;
		this.fileName = fileName;
		this.fileRealName = fileRealName;
		this.content = content;
		this.regdate = regdate;
	}
	public SnsBoardVO() {
		
	}
	
	
}
