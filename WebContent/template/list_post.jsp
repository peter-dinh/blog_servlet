<%@page import="dto.Post"%>
<%@page import="dao.Post_dao"%>
<section class="latest section">
    <div class="section-inner">
        <h2 class="heading">New Post</h2>
        <div class="content">
            <% 
            	Post_dao dao = new Post_dao();
            	for(Post item : dao.List_post()){
            %>
            <div class="item row">
                <a class="col-md-4 col-sm-4 col-xs-12" href="{% url 'blog:info' item.id %}" >
                <img class="img-responsive project-image" src="<%=item.getUrl_Image() %>" alt="{{ item.unsigned_title }}" />
                </a>
                
                <div class="desc col-md-8 col-sm-8 col-xs-12">
                    <h3 class="title"><a href="#" ><%=item.getTitle() %></a></h3>
                    <p><%=item.getExcerpt() %></p>
                    <p><a class="more-link" href="#" ><i class="fa fa-external-link"></i> More Info</a></p>
                </div><!--//desc-->                          
            </div><!--//item-->
            <% } %>
        </div><!--//content-->  
    </div><!--//section-inner-->                 
</section><!--//section-->