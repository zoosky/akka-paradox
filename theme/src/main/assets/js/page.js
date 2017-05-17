$(function() {

  // close the overlay navigation when header links are clicked
  $(".overlay-nav .nav-toc a.header, .overlay-nav .nav-toc a.active.page").attr("data-toggle", "underlay overlay");

  // modify the layout of section TOCs to be in a block grid with equal heights
  // force block grid with .blocks class, force regular list style with .list class
  // default to block style for TOCs with depth > 1, list style for depth == 1
  var tocs = $(".page-content .toc");
  tocs.each(function() {
    var toc = $(this);
    var list = toc.children("ul");
    var shallow = list.children("li").has("ul").length == 0;
    if (toc.hasClass("blocks") || !(toc.hasClass("list") || shallow)) {
      list.addClass("row medium-up-2 large-up-3 toc-grid");
      list.children("li").addClass("column column-block toc-block").attr("data-equalizer-watch", "").wrapInner( "<div class='toc-box'></div>");
      new Foundation.Equalizer(list, { equalizeByRow: true, equalizeOn: "medium" });
    }
  });

  var currentLanguage;
  if (document.location.href.indexOf('/scala/') != -1) {
    currentLanguage = 'scala';
  } else if (document.location.href.indexOf('/java/') != -1) {
    currentLanguage = 'java';
  }

  // page refresh when switching between java and scala
  window.groupChanged(function(group, supergroup, catalog) {
    if (currentLanguage == 'java' && group == 'group-scala') {
      document.location.href = document.location.href.replace('/java/', '/scala/');
    }
    if (currentLanguage == 'scala' && group == 'group-java') {
      document.location.href = document.location.href.replace('/scala/', '/java/');
    }
  });
});

