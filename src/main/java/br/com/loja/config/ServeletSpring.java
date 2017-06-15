package br.com.loja.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServeletSpring extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppWebConfiguration.class ,JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
