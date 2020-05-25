/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smoketest.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Sample application to demonstrate testing.
 *
 * @author Phillip Webb
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class SampleTestApplication {

	/** 启动流程
	 * 1. new SpringApplication(Class<?>[] primarySources)
	 * 	  赋值resourceLoader primarySources webApplicationType
	 * 	  mainApplicationClass initializers  listeners
	 * 2. 设置java.awt.headless属性
	 * 3. prepareEnvironment方法，初始化environment
	 * 4. printBanner 打印banner
	 * 5. createApplicationContext 创建context
	 * 6. prepareContext 做一些准备工作
	 * 7. refreseContext 启动容器 spring-framework的范畴 很多功能依赖后置处理器
	 * 8. afterContext 留给子类扩展
	 * 9. 回调ApplicationRunner 和 CommandLineRunner
	 * 10. 中间穿插SpringApplicationRunListener的各种生命周期回调函数
	 */
	public static void main(String[] args) {
		SpringApplication.run(SampleTestApplication.class, args);
	}

}
