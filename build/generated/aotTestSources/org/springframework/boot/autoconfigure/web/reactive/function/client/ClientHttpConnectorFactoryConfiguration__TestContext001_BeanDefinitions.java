package org.springframework.boot.autoconfigure.web.reactive.function.client;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClientHttpConnectorFactoryConfiguration}.
 */
@Generated
public class ClientHttpConnectorFactoryConfiguration__TestContext001_BeanDefinitions {
  /**
   * Bean definitions for {@link ClientHttpConnectorFactoryConfiguration.JdkClient}.
   */
  @Generated
  public static class JdkClient {
    /**
     * Get the bean definition for 'jdkClient'.
     */
    public static BeanDefinition getJdkClientBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(ClientHttpConnectorFactoryConfiguration.JdkClient.class);
      beanDefinition.setInstanceSupplier(ClientHttpConnectorFactoryConfiguration.JdkClient::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jdkClientHttpConnectorFactory'.
     */
    private static BeanInstanceSupplier<JdkClientHttpConnectorFactory> getJdkClientHttpConnectorFactoryInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JdkClientHttpConnectorFactory>forFactoryMethod(ClientHttpConnectorFactoryConfiguration.JdkClient.class, "jdkClientHttpConnectorFactory")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ClientHttpConnectorFactoryConfiguration.JdkClient.class).jdkClientHttpConnectorFactory());
    }

    /**
     * Get the bean definition for 'jdkClientHttpConnectorFactory'.
     */
    public static BeanDefinition getJdkClientHttpConnectorFactoryBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JdkClientHttpConnectorFactory.class);
      beanDefinition.setInstanceSupplier(getJdkClientHttpConnectorFactoryInstanceSupplier());
      return beanDefinition;
    }
  }
}
