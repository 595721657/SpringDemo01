package Aop;
/**
 * ��������ŵ�
 * @author ����
 * @@����ʱ�� 2020��4��14������3:13:09
 */
public class Agency {
    //�����Ŷ���
    private Landlady land;
    //�ⷿ
    public void Agencytenement() {
		 //�ȿ��ǲ����з�Դ��Ϣ(������)
    	if(land ==null) {
    		land=new Landlady();
    	}
    	Intermediary.befor();
    	land.tenement();
    	Intermediary.after();
   }
}
