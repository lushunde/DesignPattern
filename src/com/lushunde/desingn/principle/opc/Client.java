package com.lushunde.desingn.principle.opc;

/**
 * ��ͼ������Ϊ��
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("Ц������", 100, "��ӹ");
		System.out.println("�鼮���֣�" + novel.getName() + "�鼮���ߣ�" + novel.getAuthor() + "�鼮�۸�" + novel.getPrice());
	}

}
