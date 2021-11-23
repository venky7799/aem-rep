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
package org.apache.sling.scripting.sightly.apps.aemgeeks.components.content.componentsinfo;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class componentsinfo_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_conponentinfo = null;
Collection var_collectionvar2_list_coerced$ = null;
out.write("\n\n");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<p>");
        {
            String var_1 = ("Text property: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text")));
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</p>");
    }
}
out.write("\n\n");
_global_conponentinfo = renderContext.call("use", com.aem.geeks.core.models.ComponentInfo.class.getName(), obj());
out.write("<div></div>\n\n          <!-- DataTales Example -->\n          <div class=\"card shadow mb-4\">\n            <div class=\"card-header py-3\">\n              <h6 class=\"m-0 font-weight-bold text-primary\">DataTables Example</h6>\n            </div>\n            <div class=\"card-body\">\n              <div class=\"table-responsive\">\n                <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n                  <thead>\n                    <tr>\n                      <th>Component</th>\n                      <th>Group</th>\n                      <th>Name</th>\n                      <th>Path</th>\n                      <th>Pages</th>\n\n\n                    </tr>\n                  </thead>\n                 <!--  <tfoot>\n                    <tr>\n                      <th>Name</th>\n                      <th>Position</th>\n                      <th>Office</th>\n                      <th>Age</th>\n                      <th>Start date</th>\n                      <th>Salary</th>\n                    </tr>\n                  </tfoot>-->\n                  <tbody>\n                  \n                  ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_global_conponentinfo, "components");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            out.write("<div>");
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("\n                    <tr>\n                      <td>");
                                        {
                                            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</td>\n                      <td>");
                                        {
                                            Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "group"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_13));
                                        }
                                        out.write("</td>\n                      <td>");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "name"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</td>\n                      <td>");
                                        {
                                            Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "path"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_15));
                                        }
                                        out.write("</td>\n                      <td><input type=\"button\" class=\"btn btn-info\"");
                                        {
                                            String var_attrcontent16 = ((("location.href='" + renderContext.getObjectModel().toString(renderContext.call("xss", "/content/reports/home/test-request.html?component=", "scriptString"))) + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "path"), "scriptString"))) + "'");
                                            {
                                                Object var_shoulddisplayattr17 = ((renderContext.getObjectModel().toBoolean(var_attrcontent16) ? var_attrcontent16 : ("false".equals(var_attrcontent16))));
                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr17)) {
                                                    out.write(" onclick=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                                    out.write("\"");
                                                }
                                            }
                                        }
                                        {
                                            Object var_attrvalue18 = renderContext.getObjectModel().resolveProperty(item, "pages");
                                            {
                                                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "attribute");
                                                {
                                                    Object var_shoulddisplayattr21 = ((renderContext.getObjectModel().toBoolean(var_attrcontent19) ? var_attrcontent19 : ("false".equals(var_attrvalue18))));
                                                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr21)) {
                                                        out.write(" value");
                                                        {
                                                            boolean var_istrueattr20 = (var_attrvalue18.equals(true));
                                                            if (!var_istrueattr20) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("/></td>\n\n                    </tr>\n                  ");
                                    }
                                }
                                var_index9++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\n                  </tbody>\n                </table>\n              </div>\n            </div>\n          </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

