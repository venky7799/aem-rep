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
package org.apache.sling.scripting.sightly.apps.aemgeeks.components.global.navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class navigation_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("\n     <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n     <!-- Sidebar - Brand -->\n      <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"#\">\n        <div class=\"sidebar-brand-icon rotate-n-15\">\n          <i class=\"fas fa-laugh-wink\"></i>\n        </div>\n        <div class=\"sidebar-brand-text mx-3\">GEEKS <sup>AEM</sup></div>\n      </a>\n\n      <!-- Divider -->\n      <hr class=\"sidebar-divider my-0\"/>\n\n      <!-- Nav Item - Dashboard -->\n      <li class=\"nav-item\">\n        <a class=\"nav-link\" href=\"#\">\n          <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n          <span>Dashboard</span></a>\n      </li>\n\n      <!-- Divider -->\n      <hr class=\"sidebar-divider\"/>\n\n      <!-- Heading -->\n      <div class=\"sidebar-heading\">\n        Interface\n      </div>\n\n      <!-- Nav Item - Pages Collapse Menu -->\n      <li class=\"nav-item\">\n        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n          <i class=\"fas fa-fw fa-cog\"></i>\n          <span>Components</span>\n        </a>\n        <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n          <div class=\"bg-white py-2 collapse-inner rounded\">\n            <h6 class=\"collapse-header\">Custom Components:</h6>\n            <a class=\"collapse-item\" href=\"#\">Buttons</a>\n            <a class=\"collapse-item\" href=\"#\">Cards</a>\n          </div>\n        </div>\n      </li>\n\n      <!-- Nav Item - Utilities Collapse Menu -->\n      <li class=\"nav-item\">\n        <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n          <i class=\"fas fa-fw fa-wrench\"></i>\n          <span>Utilities</span>\n        </a>\n        <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n          <div class=\"bg-white py-2 collapse-inner rounded\">\n            <h6 class=\"collapse-header\">Custom Utilities:</h6>\n            <a class=\"collapse-item\" href=\"#\">Colors</a>\n            <a class=\"collapse-item\" href=\"#\">Borders</a>\n            <a class=\"collapse-item\" href=\"#\">Animations</a>\n            <a class=\"collapse-item\" href=\"#\">Other</a>\n          </div>\n        </div>\n      </li>\n\n      <!-- Divider -->\n      <hr class=\"sidebar-divider\"/>\n\n      <!-- Heading -->\n      <div class=\"sidebar-heading\">\n        Addons\n      </div>\n\n      <!-- Nav Item - Pages Collapse Menu -->\n      <li class=\"nav-item active\">\n        <a class=\"nav-link\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\n          <i class=\"fas fa-fw fa-folder\"></i>\n          <span>Pages</span>\n        </a>\n        <div id=\"collapsePages\" class=\"collapse show\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n          <div class=\"bg-white py-2 collapse-inner rounded\">\n            <h6 class=\"collapse-header\">Login Screens:</h6>\n            <a class=\"collapse-item\" href=\"#\">Login</a>\n            <a class=\"collapse-item\" href=\"#\">Register</a>\n            <a class=\"collapse-item\" href=\"#\">Forgot Password</a>\n            <div class=\"collapse-divider\"></div>\n            <h6 class=\"collapse-header\">Other Pages:</h6>\n            <a class=\"collapse-item\" href=\"#\">404 Page</a>\n            <a class=\"collapse-item active\" href=\"#\">Blank Page</a>\n          </div>\n        </div>\n      </li>\n\n      <!-- Nav Item - Charts -->\n      <li class=\"nav-item\">\n        <a class=\"nav-link\" href=\"#\">\n          <i class=\"fas fa-fw fa-chart-area\"></i>\n          <span>Charts</span></a>\n      </li>\n\n      <!-- Nav Item - Tables -->\n      <li class=\"nav-item\">\n        <a class=\"nav-link\" href=\"#\">\n          <i class=\"fas fa-fw fa-table\"></i>\n          <span>Tables</span></a>\n      </li>\n\n      <!-- Divider -->\n      <hr class=\"sidebar-divider d-none d-md-block\"/>\n\n      <!-- Sidebar Toggler (Sidebar) -->\n      <div class=\"text-center d-none d-md-inline\">\n        <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n      </div>\n    </ul>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

