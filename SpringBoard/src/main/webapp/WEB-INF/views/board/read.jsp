<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title"> ITWILL 글 상세페이지</h3>
				</div>
				<!-- /.box-header -->
				
				<form method="post" role="form">
				 
				 <input type="hidden" name="bno" value="${vo.bno }">
				 
				</form>
				
				
				 <!-- /.box-body -->
				 <div class="box-body">
				   <div class="form-group">
				     <label for="exampleInputEmail">제목</label>
				     <input type="text" name="title" 
				           class="form-control" 
				           value="${vo.title }"
				           readonly
				           >
				  </div>
				  
				   <div class="form-group">
				     <label for="exampleInputPassword1">내용</label>
				     <textarea class="form-control" name="content" rows="3"
				      readonly>${vo.content }</textarea>				     
				   </div>
				   
				   <div class="form-group">
				     <label for="exampleInputEmail">글쓴이</label>
				     <input type="text" name="writer" 
				           class="form-control"
				           value="${vo.writer }"
				     	   readonly
				     > 				   
				   </div>				 
				 </div>
				  <!-- /.box-body -->
				  
				  <div class="box-footer">
				    <button type="submit" class="btn btn-warning">수정</button>				  
				    <button type="submit" class="btn btn-danger">삭제</button>
				    <button type="submit" class="btn btn-primary">목록</button>
				  </div>
				  

			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->
	<script>
      $(document).ready(function(){
			//alert("Jquery!");
			// var tmp = "${vo.bno}";
			// alert(tmp);
			
		var formObj = $("form[role='form']");
			alert(formObj);

		$(".btn-primary").on("click", function() {
				alert("목록으로 가기 버튼 클릭!");
				location.href = "/board/listAll";

			});

		// 수정 버튼 클릭
		$(".btn-warning").click(function() {
			alert("수정 버튼 클릭");
			/*  formObj.attr("action","/board/modify");
			formObj.attr("method" ,"get");
			formObj.submit(); */

			formObj.attr({
			action: "/board/modify",
			method: "get",
				}).submit();	 
             
			});

		// 삭제 버튼 클릭
		$(".btn-danger").on("click",function(){
			alert("삭제 버튼 클릭");
			formObj.attr("action","/board/remove");
			formObj.submit();
			
			});


		});

		
	</script>
<%@ include file="../include/footer.jsp" %>
