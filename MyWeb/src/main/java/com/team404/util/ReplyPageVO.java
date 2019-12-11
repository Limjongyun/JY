package com.team404.util;

import java.util.ArrayList;

import com.team404.command.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class ReplyPageVO {

	@Override
	public String toString() {
		return "ReplyPageVO [list=" + list + ", replyCount=" + replyCount + "]";
	}
	public ArrayList<ReplyVO> getList() {
		return list;
	}
	public void setList(ArrayList<ReplyVO> list) {
		this.list = list;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	private ArrayList<ReplyVO> list; //1번 변수
	private int replyCount; //2번 변수
	public ReplyPageVO(ArrayList<ReplyVO> list, int replyCount) {
		super();
		this.list = list;
		this.replyCount = replyCount;
	}

	public ReplyPageVO() {
		
	}
}
