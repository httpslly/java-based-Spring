package www.leeao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc  //启动Spring MVC相关配置，相当于继承了WebMvcConfigurationSupport
@ComponentScan("www.leeao")  //配置包扫描
public class MyMvcConfig {

}
