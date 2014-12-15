package com.psddev.cms.tool.page;

import java.io.IOException;

import javax.servlet.ServletException;

import com.psddev.cms.tool.PageServlet;
import com.psddev.cms.tool.ToolPageContext;
import com.psddev.cms.tool.widget.ScheduledEventsWidget;
import com.psddev.dari.util.RoutingFilter;

@Deprecated
@RoutingFilter.Path(application = "cms", value = "/misc/scheduledEvents.jsp")
public class ScheduledEvents extends PageServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected String getPermissionId() {
        return "area/dashboard";
    }

    @Override
    protected void doService(ToolPageContext page) throws IOException, ServletException {
        new ScheduledEventsWidget().writeHtml(page, null);
    }
}
