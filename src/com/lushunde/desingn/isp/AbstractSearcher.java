package com.lushunde.desingn.isp;
/**
 * 星探抽象
 * @author bellus
 *
 */
public abstract class AbstractSearcher {
	protected IPettyGirl pettyGirl;

	public AbstractSearcher(IPettyGirl _pettyGirl) {
		this.pettyGirl = _pettyGirl;
	}

	// 搜索美女，列出美女信息
	public abstract void show();
}
