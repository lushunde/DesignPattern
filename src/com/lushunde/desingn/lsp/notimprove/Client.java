package com.lushunde.desingn.lsp.notimprove;


/**
 * ��ͼ������Ϊ��
 * 
 * ���ϴ���ԭ��  �κθ���ĵط�������ʵ�������滻����һ�ε� ����ԭ�� ���ӵ��ͺ�ʵ��Υ�� ���ϴ���ԭ��
 * ���Կ���  ���า���˸���۸񷽷��������滻������ͬ
 * @author bellus
 * 	�����޸�ʵ����
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + novel.getName() + "�鼮���ߣ�" + novel.getAuthor() + "�鼮�۸�" + novel.getPrice());
		IBook offnovel = new OffNovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + offnovel.getName() + "�鼮���ߣ�" + offnovel.getAuthor() + "�鼮�۸�" + offnovel.getPrice());
	}

}
