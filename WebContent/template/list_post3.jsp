
<section class="experience section">
    <div class="section-inner">
        <h2 class="heading"><span style="color:green;">Improtant Post</span></h2>
        <div class="content">
            {% for item in list_important %}
            <div class="item">
                <h3 class="title"><a href="{% url 'blog:info' item.id %}">{{ item.title }}</a></h3>
                <p>{{ item.excerpt }}</p>
            </div><!--//item-->
            {% endfor %}
        </div><!--//content-->  
    </div><!--//section-inner-->                 
