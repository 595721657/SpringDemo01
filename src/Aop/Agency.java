package Aop;
/**
 * 代理包租婆的
 * @author 黄龙
 * @@创建时间 2020年4月14日下午3:13:09
 */
public class Agency {
    //包租婆对象
    private Landlady land;
    //租房
    public void Agencytenement() {
		 //先看是不是有房源信息(包租婆)
    	if(land ==null) {
    		land=new Landlady();
    	}
    	Intermediary.befor();
    	land.tenement();
    	Intermediary.after();
   }
}
