{% if post_info and post_info.public == '1' %}
<section class="latest section">
    <div class="section-inner">
        <div class="item featured text-center">
            <h2 class="heading"><a href="#" target="_blank">{{ post_info.title }}</a></h3></h2>
            <p class="summary">{{ post_info.excerpt }}</p>
            <div class="featured-image">
                <a href="#" target="_blank">
                <img class="img-responsive img-thumbnail project-image border" style="width: 100%"  src="/media/{{ post_info.image }}" alt="project name" />
                </a>
                <div class="ribbon">
                    <div class="text">New</div>
               	</div>

            </div>
                
            <div class="desc text-left">                                    
                <!-- content -->
				{{ post_info.content }}
            </div><!--//desc-->

            <div class="form-inline">
                <p><b class="fa fa-calendar pull-left" > {{ post_info.date }}</b> <b class="fa fa-user pull-right"> {{ post_info.id_user}}</b></p>
            </div>
            <hr>
            <div class="form-inline">
                <p>
                    <b class="fa fa-tag pull-left" > Tag: </b>
                    <span class="pull-left">
                        {% for tag in list_tag %}
                            <a href="#">{{ tag.name }}</a> ,
                        {% endfor %}
                    </span>
                </p>
            </div>
        </div><!--//item-->
    </div>
</section>
{% else %}
    {% include 'blocks/404.html' %}
{% endif %}