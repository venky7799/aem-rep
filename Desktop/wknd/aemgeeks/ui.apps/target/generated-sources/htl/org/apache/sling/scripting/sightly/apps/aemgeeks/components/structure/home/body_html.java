/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.aemgeeks.components.structure.home;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class body_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<!-- Page Wrapper -->\n<div id=\"wrapper\">\n    ");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", null, obj().with("path", "left-nav").with("resourceType", "aemgeeks/components/global/navigation"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("\n\n    <!-- Content Wrapper -->\n    <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n      <!-- Main Content -->\n      <div id=\"content\">\n        ");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", null, obj().with("path", "topbar").with("resourceType", "aemgeeks/components/global/topbar"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("\n          <div class=\"container-fluid\">\n            ");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", null, obj().with("path", "parsys").with("resourceType", "wcm/foundation/components/parsys"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("\n          </div>\n      </div>\n\n      ");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", null, obj().with("path", "footer").with("resourceType", "aemgeeks/components/global/footer"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("\n    </div>\n</div>\n<!-- End of Content Wrapper -->\n\n<!-- Scroll to Top Button-->\n<a class=\"scroll-to-top rounded\" href=\"#page-top\">\n  <i class=\"fas fa-angle-up\"></i>\n</a>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

