package com.animal.www.commons;

import org.springframework.stereotype.Service;

@Service
public class Paging {
	private int nowPage = 1; // 현재 페이지
	private int nowBlock = 1; // 현재 블록
	private int totalRecord = 0; // 전체 게시물의 수
	private int totalpage = 0; // 전체 페이지의 수
	private int totalBlock = 0; // 전체 블록의 수
	private int numPerPage = 10; // 한 페이지의 존재하는 게시물의 수
	private int pagePerBlock = 3; // 한 블록안에 존재하는 페이지의 수
	
	// 사용되는 변수
	private int begin = 0; // 시작 번호
	private int end = 0; // 끝 번호
	private int beginBlock = 0; // 시작 블록
	private int endBlock = 0; // 끝 블록
	
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNowBlock() {
		return nowBlock;
	}
	public void setNowBlock(int nowBlock) {
		this.nowBlock = nowBlock;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getTotalBlock() {
		return totalBlock;
	}
	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}
	public int getNumPerPage() {
		return numPerPage;
	}
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}
	public int getPagePerBlock() {
		return pagePerBlock;
	}
	public void setPagePerBlock(int pagePerBlock) {
		this.pagePerBlock = pagePerBlock;
	}
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getBeginBlock() {
		return beginBlock;
	}
	public void setBeginBlock(int beginBlock) {
		this.beginBlock = beginBlock;
	}
	public int getEndBlock() {
		return endBlock;
	}
	public void setEndBlock(int endBlock) {
		this.endBlock = endBlock;
	}
}
