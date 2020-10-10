package com.hy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DemoApplication
{
	public static void main(String[] args)
	{
		// System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(DemoApplication.class, args);
 		System.out.println(".————————————————————————————————.	\n" +
				"(♥◠‿◠)ﾉﾞ  demo 启动成功   ლ(´ڡ`ლ)ﾞ	\n" +
				".————————————————————————————————.	\n");
	}
}
