package com.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppConfig {

}
