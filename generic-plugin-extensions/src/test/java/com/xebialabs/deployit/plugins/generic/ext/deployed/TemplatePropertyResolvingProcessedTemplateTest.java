/*
 * @(#)ScriptPropertyResolvingExecutedScriptTest.java     24 Sep 2011
 *
 * Copyright © 2010 Andrew Phillips.
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package com.xebialabs.deployit.plugins.generic.ext.deployed;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.xebialabs.deployit.plugin.api.udm.Deployable;
import com.xebialabs.deployit.plugins.generic.ext.TestBase;

/**
 * Unit tests for {@link TemplatePropertyResolvingProcessedTemplate}
 */
public class TemplatePropertyResolvingProcessedTemplateTest extends TestBase {
    TemplatePropertyResolvingProcessedTemplate<?> processedTemplate =
        new TemplatePropertyResolvingProcessedTemplate<Deployable>();
    
    @Test
    public void supportsPlaceholdersInTemplate() {
        processedTemplate.setId("id");
        processedTemplate.setTemplate("${deployed.id}.sh");
        assertThat(processedTemplate.getTemplate(), is("id.sh"));
    }
}