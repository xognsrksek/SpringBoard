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
					<h3 class="box-title"> ITWILL 게시판 </h3>
				</div>
				<!-- /.box-header -->
				
				<form action="" role="form" method="post">
				 <!-- /.box-body -->
				 <div class="box-body">
				   <div class="form-group">
				     <label for="exampleInputEmail">제목</label>
				     <input type="text" name="title" 
				           class="form-control" placeholder="제목을 입력하시오"
				     >				     			   
				  </div>
				  
				   <div class="form-group">
				     <label for="exampleInputPassword1">내용</label>
				     <textarea class="form-control" name="content" rows="3"
				               placeholder="내용을 입력하세요....."
				      >${boardVO.content } </textarea>				     
				   </div>
				   
				   <div class="form-group">
				     <label for="exampleInputEmail">글쓴이</label>
				     <input type="text" name="writer" 
				           class="form-control" placeholder="이름을 입력하시오"
				     > 				   
				   </div>				 
				 </div>
				  <!-- /.box-body -->
				  
				  <div class="box-footer">
				    <button type="submit" class="btn btn-primary">글쓰기</button>				  
				  </div>
				  
				</form>

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

<%@ include file="../include/footer.jsp" %>
