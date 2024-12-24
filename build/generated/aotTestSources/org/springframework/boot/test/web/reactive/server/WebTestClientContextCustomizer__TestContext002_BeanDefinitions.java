package org.springframework.boot.test.web.reactive.server;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WebTestClientContextCustomizer}.
 */
@Generated
public class WebTestClientContextCustomizer__TestContext002_BeanDefinitions {
  /**
   * Bean definitions for {@link WebTestClientContextCustomizer.WebTestClientFactory}.
   */
  @Generated
  public static class WebTestClientFactory {
    /**
     * Get the bean definition for 'webTestClient'.
     */
    public static BeanDefinition getWebTestClientBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(WebTestClientContextCustomizer.WebTestClientFactory.class);
      beanDefinition.setInstanceSupplier(WebTestClientContextCustomizer.WebTestClientFactory::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link WebTestClientContextCustomizer.WebTestClientRegistrar}.
   */
  @Generated
  public static class WebTestClientRegistrar {
    /**
     * Get the bean definition for 'webTestClientRegistrar'.
     */
    public static BeanDefinition getWebTestClientRegistrarBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(WebTestClientContextCustomizer.WebTestClientRegistrar.class);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.setInstanceSupplier(WebTestClientContextCustomizer.WebTestClientRegistrar::new);
      return beanDefinition;
    }
  }
}
