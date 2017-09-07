package com.starry.pojo;

import java.io.Serializable;

/**
 * ����һ��
 * �����ҳ���ݵ�bean��
 * @author Administrator
 *
 */
public class Page implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//������ʾ�ĵ�ǰҳ�룬Ĭ���ǵ�һҳ
	private Integer currentPage = 1;
	//����ÿҳ��ʾ����������
	private Integer pageCount = 5;
	//��ȡ���ݿ��ж���������
	public Integer totalCount;
	//�����ܹ���ʾ����ҳ
	//totalPage=totalCount%pageCount==0?totalCount/pageCount:totalCount/pageCount+1
	private  Integer totalPage;
	//ÿҳ��ʼ��λ��
	private Integer startPage;
	//ÿҳ������λ��
	private Integer endPage;
	
	private String value1;
	private String value2;
	private String value3;
	private String value4;
	
	public String getValue1() {
		return value1;
	}


	public void setValue1(String value1) {
		this.value1 = value1;
	}


	public String getValue2() {
		return value2;
	}


	public void setValue2(String value2) {
		this.value2 = value2;
	}


	public String getValue3() {
		return value3;
	}


	public void setValue3(String value3) {
		this.value3 = value3;
	}


	public Page() {
		super();
	}


	public Page(Integer currentPage, Integer pageCount, Integer totalCount, Integer totalPage, Integer startPage,
			Integer endPage) {
		super();
		this.currentPage = currentPage;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.startPage = startPage;
		this.endPage = endPage;
	}


	public Integer getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	public Integer getPageCount() {
		return pageCount;
	}


	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}


	public Integer getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}


	public Integer getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}


	public Integer getStartPage() {
		return startPage;
	}


	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}


	public Integer getEndPage() {
		return endPage;
	}


	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Page [currentPage=" + currentPage + ", pageCount=" + pageCount + ", totalCount=" + totalCount
				+ ", totalPage=" + totalPage + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
	
}
