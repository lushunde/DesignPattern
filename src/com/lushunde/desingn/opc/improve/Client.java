package com.lushunde.desingn.opc.improve;

/**
 * ��ͼ������Ϊ��
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new OffNovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + novel.getName() + "�鼮���ߣ�" + novel.getAuthor() + "�鼮�۸�" + novel.getPrice());
	}

}
