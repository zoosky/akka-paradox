<!DOCTYPE html>
<html class="no-js" lang="en">

<head>
<title>$page.title$$if(!page.home.active)$ &bull; $page.home.title$$endif$</title>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta name="description" content="$page.properties.("project.description")$"/>
$if(page.properties.("akka.canonical.base_url"))$
<link rel="canonical" href="$page.properties.("akka.canonical.base_url")$/$page.self.absolute.href$"/>
$endif$
<script type="text/javascript" src="$page.base$lib/jquery/jquery.min.js"></script>
<script type="text/javascript" src="$page.base$lib/foundation/dist/js/foundation.min.js"></script>
<link rel="stylesheet" type="text/css" href="$page.base$lib/normalize.css/normalize.css"/>
<link rel="stylesheet" type="text/css" href="$page.base$lib/foundation/dist/css/foundation.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.1.1/motion-ui.min.css" />
<link rel="stylesheet" type="text/css" href="$page.base$css/icons.css"/>
<link rel="stylesheet" type="text/css" href="$page.base$css/page.css"/>
<link rel="shortcut icon" href="$page.base$images/favicon.ico" />
$analytics()$
</head>

<body>

<aside id="overlay-menu" class="full reveal" data-reveal data-v-offset="0" data-animation-in="slide-in-down" data-animation-out="scale-out-down">
<div class="overlay-header clearfix">
<a href="http://akka.io"><img class="logo" src="$page.base$images/akka-logo-reverse.svg"></a>
<button class="menu-close float-right" type="button" data-close><span>&times;</span></button>
</div>
<nav class="nav-toc">
$page.navigation$
</nav>
</aside>

<header class="site-header hide-for-large" data-sticky-container>
<div class="sticky-header clearfix" data-sticky data-sticky-on="small" data-margin-top="0">
<a href="http://akka.io"><img class="logo" src="$page.base$images/akka-logo-reverse.svg"></a>
<button class="menu-icon float-right" type="button" data-open="overlay-menu"></button>
</div>
</header>

<aside class="show-for-large">
<header class="nav-header fixed-sidebar-header">
<div class="nav-header-title">
<h1><a href="$page.home.href$">$page.home.title$</a></h1>
</div>
<div class="nav-header-version row">
Version $page.properties.("project.version")$
</div>
<div class="nav-header-groups">
$page.groups$
</div>
$if(page.properties.("algolia.docsearch.api_key"))$
<div class="nav-header-search">
<input id="search" type="search" class="search" placeholder="Search"/>
</div>
$endif$
</header>
<nav id="nav-contents" class="site-nav fixed-sidebar-contents">
<div class="nav-toc">
$page.navigation$
</div>
</nav>
<footer id="nav-footer" class="nav-footer fixed-sidebar-footer">
<a href="http://akka.io"><img class="logo" src="$page.base$images/akka-logo-reverse.svg"></a>
</footer>
</aside>

<main class="fixed-shift-for-large expanded row">
<section class="site-content small-12 column">

<article class="page-content row">
<div class="small-12 large-9 column" id="docs">
$page.content$
</div>
</article>

<div class="row">
<div class="small-12 large-9 column">
<section class="nav-prev-next row">
<div class="nav-prev small-6 column">
$if(page.prev.href)$
<a href="$page.prev.href$"><i class="icon-prev"></i> <span class="link-prev">$page.prev.title$</span></a>
$endif$
</div>
<div class="nav-next small-6 column clearfix">
$if(page.next.href)$
<a class="float-right" href="$page.next.href$">$page.next.title$ <i class="icon-next"></i></a>
$endif$
</div>
</section>
</div>
</div>

$source()$

<footer class="page-footer row clearfix">
<img class="akka-icon float-left show-for-medium" src="$page.base$images/akka-icon.svg">
<section class="copyright">
<div>&copy; 2011-$page.properties.("date.year")$ <a href="https://www.lightbend.com">Lightbend</a></div>
<div>$page.properties.("project.name")$ is Open Source and available under the Apache 2 License.</div>
</section>
</footer>

</section>
</main>

<script type="text/javascript" src="$page.base$js/scrollsneak.js"></script>
<script type="text/javascript">jQuery(document).foundation();</script>
<script type="text/javascript" src="$page.base$js/groups.js"></script>
<script type="text/javascript" src="$page.base$js/page.js"></script>
<script type="text/javascript" src="$page.base$js/magellan.js"></script>

<style type="text/css">@import "$page.base$lib/prettify/prettify.css";</style>
<script type="text/javascript" src="$page.base$lib/prettify/prettify.js"></script>
<script type="text/javascript" src="$page.base$lib/prettify/lang-scala.js"></script>
<script type="text/javascript">jQuery(function(){window.prettyPrint && prettyPrint()});</script>

$search()$

</body>
</html>
