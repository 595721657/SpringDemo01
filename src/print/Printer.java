package print;
/**
 * ��ӡ����
 * @author ����
 * @@����ʱ�� 2020��4��14������11:08:13
 */
public class Printer {
       //�����������
	   private Ink ink; 
	   private Pager pager;
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	   public void print() {
		System.out.println(ink.getColor()+"��"+pager.getSize()+"��ӡ���ݣ���");
	}
}
