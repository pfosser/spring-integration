/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.config.xml;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Parser for the &lt;exception-type-router/&gt; element.
 * 
 * @author Oleg Zhurakousky
 * @since 2.0.4
 */
public class ErrorMessageExceptionTypeRouterParser extends AbstractRouterParser {
	
	@Override
	protected BeanDefinition doParseRouter(Element element,
			ParserContext parserContext) {
		BeanDefinitionBuilder payloadTypeRouterBuilder = BeanDefinitionBuilder.genericBeanDefinition(
				IntegrationNamespaceUtils.BASE_PACKAGE + ".router.ErrorMessageExceptionTypeRouter");
		return payloadTypeRouterBuilder.getBeanDefinition();
	}
	
	@Override
	protected String getMappingKeyAttributeValue(){
		return "exception-type";
	}
}
