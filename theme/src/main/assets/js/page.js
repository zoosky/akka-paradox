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

  // tabbed code samples

  $("dl").has("dd > pre").each(function() {
    var dl = $(this);
    dl.addClass("tabbed");
    var dts = dl.find("dt");
    dts.each(function(i) {
      var dt = $(this);
      dt.html("<a href=\"#tab" + i + "\">" + dt.text() + "</a>");
    });
    var dds = dl.find("dd");
    dds.each(function(i) {
      var dd = $(this);
      dd.hide();
      if (dd.find(".callout").length) {
        dd.addClass("has-callout");
      }
    });
    var current = dts.first().addClass("first").addClass("current");
    var currentContent = current.next("dd").addClass("current").show();
    dts.last().addClass("last");
    dl.css("height", current.height() + currentContent.height());
  });

  $("dl.tabbed dt a").click(function(e){
    e.preventDefault();
    var current = $(this).parent("dt");
    var dl = current.parent("dl");
    dl.find(".current").removeClass("current").next("dd").removeClass("current").hide();
    current.addClass("current");
    var currentContent = current.next("dd").addClass("current").show();
    dl.css("height", current.height() + currentContent.height());
  });

});

