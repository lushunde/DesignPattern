package com.lushunde.desingn.principle.isp.improve;

public abstract class AbstractSearcher {
	protected IGreatTemperamentGirl greatTemperamentGirl;
	protected IGoodBodyGirl goodBodyGirl;

	public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl) {
		this.greatTemperamentGirl = greatTemperamentGirl;
	}

	public AbstractSearcher(IGoodBodyGirl goodBodyGirl) {
		this.goodBodyGirl = goodBodyGirl;
	}

	// ������Ů���г���Ů��Ϣ
	public abstract void show();
}
