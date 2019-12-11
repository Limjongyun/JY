package com.team404.command;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ReplyVO {

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getReplyId() {
		return replyId;
	}
	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	public String getReplyPw() {
		return replyPw;
	}
	public void setReplyPw(String replyPw) {
		this.replyPw = replyPw;
	}
	public Timestamp getReplydate() {
		return replydate;
	}
	public void setReplydate(Timestamp replydate) {
		this.replydate = replydate;
	}
	public Timestamp getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	private int bno;
	private int rno;
	
	private String reply; //내용
	private String replyId; //작성자
	private String replyPw; //비밀번호
	private Timestamp replydate; //등록일
	private Timestamp updatedate; //수정일
	
}
