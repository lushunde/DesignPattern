package com.lushunde.desingn.principle.lsp.improve;

/**
 * ��ͼ������Ϊ��
 * 
 * @author bellus
 *
 */

public class Client {
	public static void main(String[] args) {

		IBook novel = new NovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + novel.getName() + "�鼮���ߣ�" + novel.getAuthor() + "�鼮�۸�" + novel.getPrice());
		IBook offnovel = new OffNovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + offnovel.getName() + "�鼮���ߣ�" + offnovel.getAuthor() + "�鼮�۸�" + offnovel.getPrice());
		IBook offnovel2 = new OffNovelBook("Ц������", 100d, "��ӹ");
		System.out.println("�鼮���֣�" + offnovel2.getName() + "�鼮���ߣ�" + offnovel2.getAuthor() + "�鼮���ۼ۸�" + ((OffNovelBook) offnovel2).getOffPrice());
	}

}
