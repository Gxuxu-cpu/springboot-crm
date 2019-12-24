package com.crm.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

//Converter<S, T>  ��S ����ת��  T���͡�
/**
 * �� 2019-02-03 13:22:22 String�͵�ת��Date�͵�
 * @author Lenovo
 *
 */
public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			// ���ַ���ת��Ϊ��������
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = simpleDateFormat.parse(source);

			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ���ת���쳣�򷵻ؿ�
		return null;
	}


}
