package org.springdoc.core.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.springdoc.core.data.DataRestOperationService;
import org.springdoc.core.data.DataRestRequestService;
import org.springdoc.core.data.DataRestResponseService;
import org.springdoc.core.data.DataRestRouterOperationService;
import org.springdoc.core.data.DataRestTagsService;
import org.springdoc.core.discoverer.SpringDocParameterNameDiscoverer;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springdoc.core.providers.DataRestHalProvider;
import org.springdoc.core.providers.ObjectMapperProvider;
import org.springdoc.core.providers.SpringRepositoryRestResourceProvider;
import org.springdoc.core.service.AbstractRequestService;
import org.springdoc.core.service.GenericParameterService;
import org.springdoc.core.service.GenericResponseService;
import org.springdoc.core.service.OpenAPIService;
import org.springdoc.core.service.OperationService;
import org.springdoc.core.service.RequestBodyService;
import org.springdoc.core.utils.SpringDocDataRestUtils;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.repository.support.Repositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ResourceMappings;
import org.springframework.data.rest.webmvc.mapping.Associations;
import org.springframework.hateoas.server.LinkRelationProvider;

/**
 * Bean definitions for {@link SpringDocDataRestConfiguration}.
 */
@Generated
public class SpringDocDataRestConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'springDocDataRestConfiguration'.
   */
  public static BeanDefinition getSpringDocDataRestConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDocDataRestConfiguration.class);
    beanDefinition.setLazyInit(false);
    beanDefinition.setInstanceSupplier(SpringDocDataRestConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'halProvider'.
   */
  private static BeanInstanceSupplier<DataRestHalProvider> getHalProviderInstanceSupplier() {
    return BeanInstanceSupplier.<DataRestHalProvider>forFactoryMethod(SpringDocDataRestConfiguration.class, "halProvider", Optional.class, Optional.class, ObjectMapperProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.class).halProvider(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'halProvider'.
   */
  public static BeanDefinition getHalProviderBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestHalProvider.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setLazyInit(false);
    beanDefinition.setInitMethodNames("init");
    beanDefinition.setInstanceSupplier(getHalProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration}.
   */
  @Generated
  public static class SpringRepositoryRestResourceProviderConfiguration {
    /**
     * Get the bean definition for 'springRepositoryRestResourceProviderConfiguration'.
     */
    public static BeanDefinition getSpringRepositoryRestResourceProviderConfigurationBeanDefinition(
        ) {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'springRepositoryRestResourceProvider'.
     */
    private static BeanInstanceSupplier<SpringRepositoryRestResourceProvider> getSpringRepositoryRestResourceProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<SpringRepositoryRestResourceProvider>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "springRepositoryRestResourceProvider", ResourceMappings.class, Repositories.class, Associations.class, ApplicationContext.class, DataRestRouterOperationService.class, PersistentEntities.class, ObjectMapper.class, SpringDocDataRestUtils.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).springRepositoryRestResourceProvider(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7)));
    }

    /**
     * Get the bean definition for 'springRepositoryRestResourceProvider'.
     */
    public static BeanDefinition getSpringRepositoryRestResourceProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringRepositoryRestResourceProvider.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getSpringRepositoryRestResourceProviderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataRestRouterOperationBuilder'.
     */
    private static BeanInstanceSupplier<DataRestRouterOperationService> getDataRestRouterOperationBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataRestRouterOperationService>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "dataRestRouterOperationBuilder", DataRestOperationService.class, SpringDocConfigProperties.class, RepositoryRestConfiguration.class, DataRestHalProvider.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).dataRestRouterOperationBuilder(args.get(0), args.get(1), args.get(2), args.get(3)));
    }

    /**
     * Get the bean definition for 'dataRestRouterOperationBuilder'.
     */
    public static BeanDefinition getDataRestRouterOperationBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestRouterOperationService.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getDataRestRouterOperationBuilderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataRestOperationBuilder'.
     */
    private static BeanInstanceSupplier<DataRestOperationService> getDataRestOperationBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataRestOperationService>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "dataRestOperationBuilder", DataRestRequestService.class, DataRestTagsService.class, DataRestResponseService.class, OperationService.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).dataRestOperationBuilder(args.get(0), args.get(1), args.get(2), args.get(3)));
    }

    /**
     * Get the bean definition for 'dataRestOperationBuilder'.
     */
    public static BeanDefinition getDataRestOperationBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestOperationService.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getDataRestOperationBuilderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataRestRequestBuilder'.
     */
    private static BeanInstanceSupplier<DataRestRequestService> getDataRestRequestBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataRestRequestService>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "dataRestRequestBuilder", SpringDocParameterNameDiscoverer.class, GenericParameterService.class, RequestBodyService.class, AbstractRequestService.class, SpringDocDataRestUtils.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).dataRestRequestBuilder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
    }

    /**
     * Get the bean definition for 'dataRestRequestBuilder'.
     */
    public static BeanDefinition getDataRestRequestBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestRequestService.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getDataRestRequestBuilderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataRestResponseBuilder'.
     */
    private static BeanInstanceSupplier<DataRestResponseService> getDataRestResponseBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataRestResponseService>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "dataRestResponseBuilder", GenericResponseService.class, SpringDocDataRestUtils.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).dataRestResponseBuilder(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'dataRestResponseBuilder'.
     */
    public static BeanDefinition getDataRestResponseBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestResponseService.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getDataRestResponseBuilderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'dataRestTagsBuilder'.
     */
    private static BeanInstanceSupplier<DataRestTagsService> getDataRestTagsBuilderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<DataRestTagsService>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "dataRestTagsBuilder", OpenAPIService.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).dataRestTagsBuilder(args.get(0)));
    }

    /**
     * Get the bean definition for 'dataRestTagsBuilder'.
     */
    public static BeanDefinition getDataRestTagsBuilderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataRestTagsService.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getDataRestTagsBuilderInstanceSupplier());
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'springDocDataRestUtils'.
     */
    private static BeanInstanceSupplier<SpringDocDataRestUtils> getSpringDocDataRestUtilsInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<SpringDocDataRestUtils>forFactoryMethod(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class, "springDocDataRestUtils", LinkRelationProvider.class, RepositoryRestConfiguration.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpringDocDataRestConfiguration.SpringRepositoryRestResourceProviderConfiguration.class).springDocDataRestUtils(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'springDocDataRestUtils'.
     */
    public static BeanDefinition getSpringDocDataRestUtilsBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDocDataRestUtils.class);
      beanDefinition.setLazyInit(false);
      beanDefinition.setInstanceSupplier(getSpringDocDataRestUtilsInstanceSupplier());
      return beanDefinition;
    }
  }
}
