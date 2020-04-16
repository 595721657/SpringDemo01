package computer;

public class Computer {
     private Cpu cp;
     private Disk dis;
     private Memory memor;

     public Cpu getCp() {
		return cp;
	}

	public void setCp(Cpu cp) {
		this.cp = cp;
	}

	public Disk getDis() {
		return dis;
	}

	public void setDis(Disk dis) {
		this.dis = dis;
	}

	public Memory getMemor() {
		return memor;
	}

	public void setMemor(Memory memor) {
		this.memor = memor;
	}

	public void print() {
		System.out.println("这是一台"+cp.getCpu()+memor.getMemory()+dis.getDisk()+"电脑");
	}
}
