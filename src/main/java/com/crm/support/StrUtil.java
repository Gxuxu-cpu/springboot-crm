package com.crm.support;

public class StrUtil {

	/**
	 * 当前毫秒数生成
	 * @return
	 */
	public static String createId(String type) {
		return type+System.currentTimeMillis();
	}
	
	/**
	 * 传入需要字段，比如L01，传入需要被判断的数字
	 * 数字小于10补0，大于10直接返回，得到最终的结果
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
		//把 L0105中的L01替换成空的=》L0105就是05，还是字符串
		String numStr = lastCode.replaceFirst(parentCode, "");
		//把05字符串转成数字5
		int num = Integer.parseInt(numStr);
		return createId(parentCode,num+1);
	}
}
