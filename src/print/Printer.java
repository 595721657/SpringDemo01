package print;
/**
 * 打印机类
 * @author 黄龙
 * @@创建时间 2020年4月14日上午11:08:13
 */
public class Printer {
       //创建两个组件
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
		System.out.println(ink.getColor()+"在"+pager.getSize()+"打印内容！！");
	}
}
