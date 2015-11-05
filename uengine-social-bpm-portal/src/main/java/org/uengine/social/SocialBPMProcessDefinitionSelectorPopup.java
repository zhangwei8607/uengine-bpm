package org.uengine.social;

import org.metaworks.MetaworksContext;
import org.metaworks.dwr.MetaworksRemoteService;
import org.uengine.modeling.resource.DefaultResource;
import org.uengine.modeling.resource.resources.ClassResource;
import org.uengine.modeling.resource.resources.JavaClassResource;
import org.uengine.modeling.resource.resources.ProcessResource;
import org.uengine.modeling.resource.resources.URLappResource;
import org.uengine.processadmin.ProcessAdminResourceNavigator;
import org.uengine.processadmin.ResourceControlDelegateForProcessVariableSelector;

/**
 * Created by jjy on 2015. 11. 5..
 */
public class SocialBPMProcessDefinitionSelectorPopup extends SocialBPMProcessVariableTypeSelectorPopup {

    public SocialBPMProcessDefinitionSelectorPopup() {
        ProcessAdminResourceNavigator classResourceNavigator = new ProcessAdminResourceNavigator();
        classResourceNavigator.getRoot().filterResources(ClassResource.class);
        classResourceNavigator.getRoot().filterResources(URLappResource.class);

        MetaworksRemoteService.autowire(classResourceNavigator);

        classResourceNavigator.getRoot().setMetaworksContext(new MetaworksContext());
        classResourceNavigator.getRoot().getMetaworksContext().setWhen(MetaworksContext.WHEN_VIEW);

        classResourceNavigator.setResourceControlDelegate(new ResourceControlDelegateForProcessVariableSelector());

        setClassResourceNavigator(classResourceNavigator);

    }
}
