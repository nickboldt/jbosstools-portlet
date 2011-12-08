package org.jboss.tools.portlet.ui.bot.test.jsf;

import org.jboss.tools.portlet.ui.bot.test.RequirementAwareUsageWindowClosingSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(RequirementAwareUsageWindowClosingSuite.class)
@Suite.SuiteClasses({
	CreateJSFPortletProject.class,
	CreateJSFPortlet.class,
	RunJSFPortletOnServer.class
	})
public class JSFPortletTestSuite {

}