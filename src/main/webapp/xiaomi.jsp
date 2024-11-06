<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<table>
  <tr><td>商品号</td><td>商品名称</td><td>商品价格</td><td>数量</td></tr>
  <tr>
    <td>1001</td><td>小米10</td><td>3999.00</td>
    <td><input type="number" name="1001" min="1" value="1" size="5"/></td>
    <td><a class="link" id="1001">加入购物车</a></td>
  </tr>
  <tr>
    <td>1002</td><td>红米K30</td><td>1999.00</td>
    <td><input type="number" name="1002" min="1" value="1" size="5"/></td>
    <td><a class="link" id="1002">加入购物车</a></td>
  </tr>
  <tr>
    <td>1003</td><td>红米Note8</td><td>999.00</td>
    <td><input type="number" name="1003" min="1" value="1" size="5"/></td>
    <td><a class="link" id="1003">加入购物车</a></td>
  </tr>
</table>
<script src="addcart.js"></script>
