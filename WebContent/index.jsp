<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="template/head.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="template/header.jsp"></jsp:include>
	 <div class="container sections-wrapper">
            <div class="row">
                <div class="primary col-md-8 col-sm-12 col-xs-12">
                    <jsp:include page="template/list_post.jsp"></jsp:include>
                    <jsp:include page="template/list_post2.jsp"></jsp:include>
                    <jsp:include page="template/list_post3.jsp"></jsp:include>
                </div>
                <div class="secondary col-md-4 col-sm-12 col-xs-12">
                    <jsp:include page="template/widget/widget1.jsp"></jsp:include>
                    <jsp:include page="template/widget/widget7.jsp"></jsp:include>
                </div>
            </div>
        </div>
     <jsp:include page="template/footer.jsp"></jsp:include>
</body>
</html>