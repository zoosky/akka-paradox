$(function() {

  // close the overlay navigation when header links are clicked
  $("#overlay-menu .nav-toc a.header").attr("data-close", "");

  // modify the layout of section TOCs to be in a block grid with equal heights
  var toc = $(".page-content .toc");
  if (toc.length > 0) {
    var list = toc.children("ul");
    list.addClass("row medium-up-2 large-up-3 toc-grid");
    list.children("li").addClass("column column-block toc-block").attr("data-equalizer-watch", "").wrapInner( "<div class='toc-box'></div>");
    new Foundation.Equalizer(list, { equalizeByRow: true, equalizeOn: "medium" });
  }

});

