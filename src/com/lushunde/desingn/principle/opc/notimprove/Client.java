package com.lushunde.desingn.principle.opc.notimprove;

/**
 * ��ͼ������Ϊ��
 * 
 * ԭ���� ֱ��ԭ������
 * ������ �˼۴�8�۳���
 * 		1. �޸Ľӿ�
 * 		2. �޸�ʵ����
 * 	�Ľ���ͨ����չ��ʵ��
 * @author bellus
 * 	�����޸�ʵ����
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("Ц������", 100, "��ӹ");
		System.out.println("�鼮���֣�" + novel.getName() + "�鼮���ߣ�" + novel.getAuthor() + "�鼮�۸�" + novel.getPrice());
	}

}
