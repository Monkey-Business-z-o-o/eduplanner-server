package org.springframework.hateoas.config;

import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link WebClientHateoasConfiguration}.
 */
@Generated
public class WebClientHateoasConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'webClientHateoasConfiguration'.
   */
  public static BeanDefinition getWebClientHateoasConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebClientHateoasConfiguration.class);
    beanDefinition.setInstanceSupplier(WebClientHateoasConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webClientConfigurer'.
   */
  private static BeanInstanceSupplier<HypermediaWebClientConfigurer> getWebClientConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<HypermediaWebClientConfigurer>forFactoryMethod(WebClientHateoasConfiguration.class, "webClientConfigurer", ObjectProvider.class, List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebClientHateoasConfiguration.class).webClientConfigurer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'webClientConfigurer'.
   */
  public static BeanDefinition getWebClientConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HypermediaWebClientConfigurer.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getWebClientConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'webClientBeanPostProcessor'.
   */
  private static BeanInstanceSupplier<WebClientHateoasConfiguration.HypermediaWebClientBeanPostProcessor> getWebClientBeanPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebClientHateoasConfiguration.HypermediaWebClientBeanPostProcessor>forFactoryMethod(WebClientHateoasConfiguration.class, "webClientBeanPostProcessor", ObjectFactory.class)
            .withGenerator((registeredBean, args) -> WebClientHateoasConfiguration.webClientBeanPostProcessor(args.get(0)));
  }

  /**
   * Get the bean definition for 'webClientBeanPostProcessor'.
   */
  public static BeanDefinition getWebClientBeanPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebClientHateoasConfiguration.class);
    beanDefinition.setTargetType(WebClientHateoasConfiguration.HypermediaWebClientBeanPostProcessor.class);
    beanDefinition.setInstanceSupplier(getWebClientBeanPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
