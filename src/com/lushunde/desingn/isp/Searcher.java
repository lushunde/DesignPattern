package com.lushunde.desingn.isp;

/**
 * ��̽ʵ��
 * @author bellus
 *
 */
public class Searcher extends AbstractSearcher {

	public Searcher(IPettyGirl _pettyGirl){
		super(_pettyGirl);
		}
		//չʾ��Ů����Ϣ
		public void show(){
		System.out.println("--------��Ů����Ϣ���£�---------------");
		//չʾ����
		super.pettyGirl.goodLooking();
		//չʾ���
		super.pettyGirl.niceFigure();
		//չʾ����
		super.pettyGirl.greatTemperament();
		}


}
