package org.springframework.hateoas.config;

import java.util.List;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.filter.reactive.ServerWebExchangeContextFilter;

/**
 * Bean definitions for {@link WebFluxHateoasConfiguration}.
 */
@Generated
public class WebFluxHateoasConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'webFluxHateoasConfiguration'.
   */
  public static BeanDefinition getWebFluxHateoasConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebFluxHateoasConfiguration.class);
    beanDefinition.setInstanceSupplier(WebFluxHateoasConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'hypermediaWebFluxConfigurer'.
   */
  private static BeanInstanceSupplier<WebFluxHateoasConfiguration.HypermediaWebFluxConfigurer> getHypermediaWebFluxConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<WebFluxHateoasConfiguration.HypermediaWebFluxConfigurer>forFactoryMethod(WebFluxHateoasConfiguration.class, "hypermediaWebFluxConfigurer", ObjectProvider.class, List.class, Optional.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(WebFluxHateoasConfiguration.class).hypermediaWebFluxConfigurer(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'hypermediaWebFluxConfigurer'.
   */
  public static BeanDefinition getHypermediaWebFluxConfigurerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebFluxHateoasConfiguration.HypermediaWebFluxConfigurer.class);
    beanDefinition.setInstanceSupplier(getHypermediaWebFluxConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'serverWebExchangeContextFilter'.
   */
  private static BeanInstanceSupplier<ServerWebExchangeContextFilter> getServerWebExchangeContextFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServerWebExchangeContextFilter>forFactoryMethod(WebFluxHateoasConfiguration.class, "serverWebExchangeContextFilter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(WebFluxHateoasConfiguration.class).serverWebExchangeContextFilter());
  }

  /**
   * Get the bean definition for 'serverWebExchangeContextFilter'.
   */
  public static BeanDefinition getServerWebExchangeContextFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServerWebExchangeContextFilter.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getServerWebExchangeContextFilterInstanceSupplier());
    return beanDefinition;
  }
}
