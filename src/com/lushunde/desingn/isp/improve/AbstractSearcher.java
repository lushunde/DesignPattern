package com.lushunde.desingn.isp.improve;

public abstract class AbstractSearcher {
	protected IGreatTemperamentGirl greatTemperamentGirl;
	protected IGoodBodyGirl goodBodyGirl;

	public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
		this.greatTemperamentGirl = greatTemperamentGirl;
	}

	public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
		this.goodBodyGirl = goodBodyGirl;
	}

	// 搜索美女，列出美女信息
	public abstract void show();
}
