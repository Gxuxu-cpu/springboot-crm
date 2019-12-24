package com.crm.support;

public class StrUtil {

	/**
	 * ��ǰ����������
	 * @return
	 */
	public static String createId(String type) {
		return type+System.currentTimeMillis();
	}
	
	/**
	 * ������Ҫ�ֶΣ�����L01��������Ҫ���жϵ�����
	 * ����С��10��0������10ֱ�ӷ��أ��õ����յĽ��
	 */
	public static String createId(String type,Integer num) {
		return type + (num<10?"0"+num.toString():num.toString());
	}
	
	/**
	 * 
	 * @param lastCode => L0105   (L05=>L06)
	 * @param parentCode => L01
	 * @return
	 */
	public static String createCode(String lastCode,String parentCode) {
		//�� L0105�е�L01�滻�ɿյ�=��L0105����05�������ַ���
		String numStr = lastCode.replaceFirst(parentCode, "");
		//��05�ַ���ת������5
		int num = Integer.parseInt(numStr);
		return createId(parentCode,num+1);
	}
}
