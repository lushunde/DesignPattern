package com.lushunde.desingn.principle.isp.improve;

public class Searcher extends AbstractSearcher {

	public Searcher(IGoodBodyGirl goodBodyGirl) {
		super(goodBodyGirl);
	}

	public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
		super(greatTemperamentGirl);
	}

	// չʾ��Ů����Ϣ
	public void show() {
		System.out.println("--------��Ů����Ϣ���£�---------------");
		if (this.goodBodyGirl != null) {
			// չʾ����
			super.goodBodyGirl.goodLooking();
			// չʾ���
			super.goodBodyGirl.niceFigure();
		}
		if (this.greatTemperamentGirl != null) {
			// չʾ����
			super.greatTemperamentGirl.greatTemperament();
		}
	}

}
