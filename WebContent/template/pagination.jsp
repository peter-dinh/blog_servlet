<div class="section-inner">
	{% if posts.has_next %}
	<a class="btn btn-cta-secondary" style="" href="?page={{ posts.next_page_number }}"><i class="fa fa-chevron-left"></i>Prew</a>
	{% endif %}
	{% if posts.has_previous %}
	<a class="btn btn-cta-secondary" style="" href="?page={{ posts.previous_page_number }}">Next <i class="fa fa-chevron-right"></i></a>
	{% endif %}
</div>