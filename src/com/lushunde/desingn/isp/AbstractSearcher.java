package com.lushunde.desingn.isp;
/**
 * ��̽����
 * @author bellus
 *
 */
public abstract class AbstractSearcher {
	protected IPettyGirl pettyGirl;

	public AbstractSearcher(IPettyGirl _pettyGirl) {
		this.pettyGirl = _pettyGirl;
	}

	// ������Ů���г���Ů��Ϣ
	public abstract void show();
}
