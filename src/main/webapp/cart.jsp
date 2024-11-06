<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="com.xlf.school.experiment4.Cart, com.xlf.school.experiment4.bean.Goods, java.util.ArrayList" %>
<jsp:useBean id="cart" class="com.xlf.school.experiment4.Cart" scope="session"/>
<%
  if (cart == null || cart.getGoodslist().size() == 0) {
%>
<p>您的购物车空空如也...</p>
<%
} else {
  ArrayList<Goods> goodslist = cart.getGoodslist();
  double total = cart.getTotal();
%>
<table>
  <tr>
    <td>商品编号</td>
    <td>商品名称</td>
    <td>商品价格</td>
    <td>数量</td>
    <td>小计</td>
    <td>操作</td>
  </tr>
  <%
    for (Goods goods : goodslist) {
  %>
  <tr>
    <td><%= goods.getGid() %></td>
    <td><%= goods.getGname() %></td>
    <td><%= goods.getGprice() %></td>
    <td><%= goods.getGcount() %></td>
    <td><%= goods.getGprice() * goods.getGcount() %></td>
    <td><a href="removeItem?productId=<%= goods.getGid() %>">删除</a></td>
  </tr>
  <% } %>
  <tr>
    <td colspan="6">总计：<%= total %></td>
  </tr>
</table>
<% } %>
