package com.lushunde.desingn.principle.isp.improve;

public class Searcher extends AbstractSearcher {

	public Searcher(IGoodBodyGirl goodBodyGirl) {
		super(goodBodyGirl);
	}

	public Searcher(IGreatTemperamentGirl greatTemperamentGirl) {
		super(greatTemperamentGirl);
	}

	// 展示美女的信息
	public void show() {
		System.out.println("--------美女的信息如下：---------------");
		if (this.goodBodyGirl != null) {
			// 展示面容
			super.goodBodyGirl.goodLooking();
			// 展示身材
			super.goodBodyGirl.niceFigure();
		}
		if (this.greatTemperamentGirl != null) {
			// 展示气质
			super.greatTemperamentGirl.greatTemperament();
		}
	}

}
