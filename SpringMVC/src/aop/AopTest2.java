package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.Thinker;


/**
 * 测试类
 * 
 * @author Administrator
 * 
 *         2016-6-14 上午09:54:54
 */
public class AopTest2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"aop/xml/spring_aop2.xml");
		System.out.println("****************************************");
		Thinker thinker=(Thinker) context.getBean("thinkerImpl");
		thinker.thinkOfSomething("插入数据!");
	}
}
