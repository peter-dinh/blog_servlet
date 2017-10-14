{% if post_info and post_info.public == '1' %}
<section class="github section">
    <div id="comments">
        <h2>Comments</h2>
        <ul>
            {% if list_comment %}
            {% for item in list_comment %}
            <li>
                <article>
                    <header>
                          <figure class="avatar"><img src="/static/images/user.png" alt="" class="" style="width:20px;"></figure>
                          <address>
                          <a href="">{{ item.name }}</a> say:
                          </address>
                          <time></time>
                    </header>
                    <div class="comcont">
                        <p>{{ item.content }}</p>
                    </div>
                </article>
            </li>
            {% endfor %}
            {% else %}
			<li>
                <article>
                    <div class="comcont">
                        <p class="text-center">You are first comment for comment this post</p>
                    </div>
                </article>
			</li>
            {% endif %}
        </ul>

        <h2>Write A Comment</h2>
        <form method="post" action="{% url 'blog:info' post_info.id %}">
            {% csrf_token %}
            <div class="one_third first">
                <label for="name">Name <span>*</span></label>
                <input type="text" name="name" id="name" value="" size="22" required>
            </div>
            <div class="one_third">
                <label for="email">Mail <span>*</span></label>
                <input type="email" name="email" id="email" value="" size="22" required>
            </div>
            <div class="one_third">
                <label for="url">Website</label>
                <input type="url" name="website" id="url" value="" size="22">
            </div>
            <div class="block clear">
                <label for="comment">Your Comment</label>
                <textarea name="content" id="comment" cols="25" rows="10"></textarea>
            </div>
            <div>
                <input type="submit" name="add_comment" value="Submit Form">
              &nbsp;
                <input type="reset" name="reset" value="Reset Form">
            </div>
        </form>
    </div>
</section><!--//section-->
{% endif %}
