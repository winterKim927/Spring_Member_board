<%@ page contentType="text/html;charset=UTF-8"%>
<%
	int memberboard_idx = Integer.parseInt(request.getParameter("member_idx")) ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue@2/dist/vue.js"></script>
<script type="text/javascript">

	function getDetail() {
		$.ajax({
			url: "/rest/board/<%=memberboard_idx%>",
			type : "GET",
			success : function(result) {
				$("#title").val(result.title);
				$("#writer").val(result.writer);
				$("#content").val(result.content);
			}
		});
	}

	function init() {
		getDetail();
	}

	$(function() {
		init();
		
		$("#bt_edit").click(function() { //수정버튼
			if (confirm("수정할까요?")) {
				$("#form1").attr({
					"action" : "/edit",
					"method" : "post",
				});
				$("#form1").submit();
			}
		});
		
		$("#bt_delete").click(function() { //삭제버튼
			if (confirm("삭제할까요?")) {
				$("#form1").attr({
					"action" : "/delete",
					"method" : "post",
				});
				$("#form1").submit();
			}
		});
		
		$("#bt_list").click(function() { //목록버튼
			location.href="/rest/notices/list";
		})
		
		$("#bt_reply").click(function() { //수정버튼
				$("#form2").attr({
					"action" : "/registreply",
					"method" : "post",
				});
				$("#form2").submit();
		});
	});
</script>
</head>
<body>
	<div class="container mt-5 border">
		<div class="row">
			<div class="col-12">
				<h2>상세보기</h2>
				<p></p>
				<form id="form1">
					<input type="hidden" name="reboard_idx">
					<div class="form-group">
						<label for="title">제목</label>
						<input type="text" class="form-control" id="title" name="title">
					</div>
					<div class="form-group">
						<label for="writer">작성자</label>
						<input type="text" class="form-control" id="writer" name="writer">
					</div>
					<div class="form-group">
						<label for="content">내용</label>
						<textarea class="form-control" id="content" name="content"></textarea>
					</div>
					<div class="form-group mt-3">
						<button type="button" class="btn btn-warning" id="bt_edit">수정</button>
						<button type="button" class="btn btn-danger" id="bt_delete">삭제</button>
						<button type="button" class="btn btn-primary" id="bt_list">목록</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>