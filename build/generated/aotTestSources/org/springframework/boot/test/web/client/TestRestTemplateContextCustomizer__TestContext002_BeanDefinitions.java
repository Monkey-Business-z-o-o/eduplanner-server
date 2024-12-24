package org.springframework.boot.test.web.client;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestRestTemplateContextCustomizer}.
 */
@Generated
public class TestRestTemplateContextCustomizer__TestContext002_BeanDefinitions {
  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateFactory}.
   */
  @Generated
  public static class TestRestTemplateFactory {
    /**
     * Get the bean definition for 'testRestTemplate'.
     */
    public static BeanDefinition getTestRestTemplateBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplateContextCustomizer.TestRestTemplateFactory.class);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateFactory::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link TestRestTemplateContextCustomizer.TestRestTemplateRegistrar}.
   */
  @Generated
  public static class TestRestTemplateRegistrar {
    /**
     * Get the bean definition for 'testRestTemplateRegistrar'.
     */
    public static BeanDefinition getTestRestTemplateRegistrarBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplateContextCustomizer.TestRestTemplateRegistrar.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.setInstanceSupplier(TestRestTemplateContextCustomizer.TestRestTemplateRegistrar::new);
      return beanDefinition;
    }
  }
}
