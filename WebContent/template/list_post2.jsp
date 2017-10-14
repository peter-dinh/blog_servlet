<%@page import="dao.Post_dao"%>
<%@page import="dto.Post"%>
<section class="projects section">
    <div class="section-inner">
        <h2 class="heading"><span style="color: #FFA500;">Post Popular</span></h2>
        <div class="content">
            <%
            Post_dao dao = new Post_dao();
        	for(Post item : dao.Post_popular()){
            %>
            <div class="item">
                <h3 class="title"><a href=""><%=item.getTitle() %></a></h3>
                <p class="summary"><%=item.getExcerpt() %></p>
                <p><a class="more-link" href="{% url 'blog:info' item.id %}" target="_blank"><i class="fa fa-external-link"></i>More Info</a></p>
            </div><!--//item-->
           <% } %>
        </div><!--//content-->  
    </div><!--//section-inner-->                 
</section><!--//section-->