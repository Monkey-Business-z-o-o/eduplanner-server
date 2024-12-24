package org.springdoc.core.configuration;

import org.springdoc.core.converters.CollectionModelContentConverter;
import org.springdoc.core.customizers.GlobalOpenApiCustomizer;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springdoc.core.providers.HateoasHalProvider;
import org.springdoc.core.providers.ObjectMapperProvider;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.hateoas.server.LinkRelationProvider;

/**
 * Bean definitions for {@link SpringDocHateoasConfiguration}.
 */
@Generated
public class SpringDocHateoasConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'springDocHateoasConfiguration'.
   */
  public static BeanDefinition getSpringDocHateoasConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDocHateoasConfiguration.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.setInstanceSupplier(SpringDocHateoasConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'collectionModelContentConverter'.
   */
  private static BeanInstanceSupplier<CollectionModelContentConverter> getCollectionModelContentConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CollectionModelContentConverter>forFactoryMethod(SpringDocHateoasConfiguration.class, "collectionModelContentConverter", HateoasHalProvider.class, LinkRelationProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocHateoasConfiguration.class).collectionModelContentConverter(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'collectionModelContentConverter'.
   */
  public static BeanDefinition getCollectionModelContentConverterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CollectionModelContentConverter.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.setInstanceSupplier(getCollectionModelContentConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'linksSchemaCustomizer'.
   */
  private static BeanInstanceSupplier<GlobalOpenApiCustomizer> getLinksSchemaCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GlobalOpenApiCustomizer>forFactoryMethod(SpringDocHateoasConfiguration.class, "linksSchemaCustomizer", HateoasHalProvider.class, SpringDocConfigProperties.class, ObjectMapperProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocHateoasConfiguration.class).linksSchemaCustomizer(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'linksSchemaCustomizer'.
   */
  public static BeanDefinition getLinksSchemaCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GlobalOpenApiCustomizer.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.setInstanceSupplier(getLinksSchemaCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
