package com.team404.command;

import java.sql.Timestamp;
import lombok.Data;

//롬복 라이브러리 추가시 @Data 어노테이션 getter, setter, toString 을 자동생성
//@AllArgsConstructor 어노테이션은 모든 변수를 초기화 하는 생성자
//@NoArgsConstructor 어노테이션은 기본생성자
@Data
public class FreeBoardVO {
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public Timestamp getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	//테이블 컬럼명과 동일하게 멤버변수를 선언
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Timestamp regdate;
	private Timestamp updatedate;
	
}
