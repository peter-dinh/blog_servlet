<%@page import="dto.Catalog"%>
<%@page import="dao.Catalog_dao"%>
<aside class="list music aside section">
    <div class="section-inner">
        <h2 class="heading">Catalog</h2>
        <div class="content">
            <ul class="list-unstyled">
                <%
                Catalog_dao dao = new Catalog_dao();
        		for (Catalog item : dao.Get_List_Catalog()){
           		%>
                <li><i class="fa fa-tags"></i> <a href="catalog.jsp?id=<%=item.getId_Catalog() %>"><%=item.getName() %></a></li>
                <% } %>
            </ul>
        </div><!--//content-->
    </div><!--//section-inner-->
</aside>