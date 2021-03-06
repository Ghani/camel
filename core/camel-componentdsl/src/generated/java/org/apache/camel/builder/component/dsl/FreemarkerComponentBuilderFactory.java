/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.freemarker.FreemarkerComponent;

/**
 * Transforms the message using a FreeMarker template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface FreemarkerComponentBuilderFactory {

    /**
     * Freemarker (camel-freemarker)
     * Transforms the message using a FreeMarker template.
     * 
     * Category: transformation
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-freemarker
     */
    static FreemarkerComponentBuilder freemarker() {
        return new FreemarkerComponentBuilderImpl();
    }

    /**
     * Builder for the Freemarker component.
     */
    interface FreemarkerComponentBuilder
            extends
                ComponentBuilder<FreemarkerComponent> {
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FreemarkerComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default FreemarkerComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use an existing freemarker.template.Configuration instance as the
         * configuration.
         * 
         * The option is a: <code>freemarker.template.Configuration</code> type.
         * 
         * Group: advanced
         */
        default FreemarkerComponentBuilder configuration(
                freemarker.template.Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    }

    class FreemarkerComponentBuilderImpl
            extends
                AbstractComponentBuilder<FreemarkerComponent>
            implements
                FreemarkerComponentBuilder {
        @Override
        protected FreemarkerComponent buildConcreteComponent() {
            return new FreemarkerComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "lazyStartProducer": ((FreemarkerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((FreemarkerComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((FreemarkerComponent) component).setConfiguration((freemarker.template.Configuration) value); return true;
            default: return false;
            }
        }
    }
}