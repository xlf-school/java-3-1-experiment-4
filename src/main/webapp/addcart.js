var links = document.getElementsByClassName("link");
for (var i = 0; i < links.length; i++) {
    links[i].onclick = function() {
        var gid = this.id;
        var num = document.getElementsByName(gid)[0].value;
        window.location.href = "AddCartServlet?gid=" + gid + "&gcount=" + num;
    };
}
