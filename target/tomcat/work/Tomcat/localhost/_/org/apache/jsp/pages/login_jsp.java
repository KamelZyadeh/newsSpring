/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-03 19:34:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tags/login.tag", Long.valueOf(1601752977000L));
    _jspx_dependants.put("/WEB-INF/tags/welcome_nav.tag", Long.valueOf(1601753693000L));
    _jspx_dependants.put("/WEB-INF/tags/fotter.tag", Long.valueOf(1597649676000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title> Login </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../statics/login.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"login-container\">\n");
      out.write("    ");
      if (_jspx_meth_tag_005fwelcome_005fnav_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_tag_005flogin_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_tag_005ffotter_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tag_005fwelcome_005fnav_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:welcome_nav
    org.apache.jsp.tag.webwelcome_005fnav_tag _jspx_th_tag_005fwelcome_005fnav_005f0 = (new org.apache.jsp.tag.webwelcome_005fnav_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tag_005fwelcome_005fnav_005f0);
    _jspx_th_tag_005fwelcome_005fnav_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fwelcome_005fnav_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tag_005fwelcome_005fnav_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005flogin_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:login
    org.apache.jsp.tag.weblogin_tag _jspx_th_tag_005flogin_005f0 = (new org.apache.jsp.tag.weblogin_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tag_005flogin_005f0);
    _jspx_th_tag_005flogin_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005flogin_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tag_005flogin_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005ffotter_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:fotter
    org.apache.jsp.tag.webfotter_tag _jspx_th_tag_005ffotter_005f0 = (new org.apache.jsp.tag.webfotter_tag());
    _jsp_instancemanager.newInstance(_jspx_th_tag_005ffotter_005f0);
    _jspx_th_tag_005ffotter_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005ffotter_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_tag_005ffotter_005f0);
    return false;
  }
}
