package com.crm.exceptionHandler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
@Component
public class MyExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		String msg = "";
		if (arg3 instanceof MyException) {
			msg = ((MyException) arg3).getMsg();
		} else {
			// ���������ʱ�쳣����ȡ�����ջ���Ӷ�ջ�л�ȡ�쳣��Ϣ
			Writer out = new StringWriter();
			PrintWriter s = new PrintWriter(out);
			// ���쳣��Ϣд��������
			arg3.printStackTrace(s);
			msg = out.toString();
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("forward:/error.jsp");
		return mav;
	}

}
