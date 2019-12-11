package com.team404.command;

import java.sql.Timestamp;
import java.util.ArrayList;

import lombok.Data;

@Data
public class UserVO {

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone1() {
		return userPhone1;
	}

	public void setUserPhone1(String userPhone1) {
		this.userPhone1 = userPhone1;
	}

	public String getUserPhone2() {
		return userPhone2;
	}

	public void setUserPhone2(String userPhone2) {
		this.userPhone2 = userPhone2;
	}

	public String getUserEmail1() {
		return userEmail1;
	}

	public void setUserEmail1(String userEmail1) {
		this.userEmail1 = userEmail1;
	}

	public String getUserEmail2() {
		return userEmail2;
	}

	public void setUserEmail2(String userEmail2) {
		this.userEmail2 = userEmail2;
	}

	public String getAddrZipNum() {
		return addrZipNum;
	}

	public void setAddrZipNum(String addrZipNum) {
		this.addrZipNum = addrZipNum;
	}

	public String getAddrBasic() {
		return addrBasic;
	}

	public void setAddrBasic(String addrBasic) {
		this.addrBasic = addrBasic;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public ArrayList<FreeBoardVO> getUserBoardList() {
		return userBoardList;
	}

	public void setUserBoardList(ArrayList<FreeBoardVO> userBoardList) {
		this.userBoardList = userBoardList;
	}

	private String userId;
	private String userPw;
	private String userName;
	private String userPhone1;
	private String userPhone2;
	private String userEmail1;
	private String userEmail2;
	private String addrZipNum; //우편번호
	private String addrBasic; //기본주소
	private String addrDetail; //상세주소
	private Timestamp regdate; //등록일
	
	//마이페이지에 join을통해 한번에 게시글에 대한정보를 가져나가기 위한 선언
	private ArrayList<FreeBoardVO> userBoardList;
	
	
}
