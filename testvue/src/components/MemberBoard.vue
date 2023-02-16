<template>
  <div class="container mt-3">
    <h2>게시판</h2>
    <table class="table mt-3 border">
      <thead class="thead-dark">
      <tr>
        <th>No</th>
        <th>제목</th>
        <th>작성자</th>
        <th>등록일</th>
        <th>조회수</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td colspan="5">
          <button type="button" class="btn btn-warning" id="writeNews">글쓰기</button>
        </td>
      </tr>
      </tbody>
    </table>
    <div class="row" style="float: right">
      <div class="input-group mb-3">
        <select class="input-group-text" id="category">
          <option value="title">제목</option>
          <option value="writer">작성자</option>
        </select>
        <input type="text" style="width:300px" class="form-control" id="keyword">
        <button class="btn btn-warning" id="bt_search">검색</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MemberBoard',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
