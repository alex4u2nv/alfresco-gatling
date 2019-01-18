package requests

import io.gatling.core.Predef.exec
import io.gatling.http.Predef.{http, status}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Search {
  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_29 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_43 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_54 = Map(
    "Accept-Language" -> "en-US, en",
    "Content-Type" -> "application/json",
    "User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_64 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US, en",
    "content-type" -> "application/json",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "x-requested-with" -> "XMLHttpRequest")

  val headers_111 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")


  val headers_180 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "origin" -> "https://adbp.poc.alfdev.com",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val search = group("Search") {
    exec(
      http("Search")
        .get("/share/page/dp/ws/faceted-search")
        .headers(headers_0)
        .resources(http("search_1")
          .get("/share/noauth/messages_4c142500ec820b7198a19dd4df4f7753.js?locale=en_US"),
          http("search_2")
            .get("/share/res/js/lib/dojo-1.10.4/dojo/dojo.js"),
          http("search_3")
            .get("/share/res/js/yui-common_85fe398e5deaf2958d87495ebd1e083d.js"),
          http("search_4")
            .get("/share/res/yui/history/history_543b42a00a378f4d4b6e70c81d915b0a.js"),
          http("search_5")
            .get("/share/res/js/bubbling.v2.1_5a671b93e806ea64b41f915cf6147232.js"),
          http("search_6")
            .get("/share/res/js/flash/AC_OETags_23681d043aef7e80993a9f9354d71741.js"),
          http("search_7")
            .get("/share/res/js/alfresco_16d6ab19ef893ce787dba847b324f713.js"),
          http("search_8")
            .get("/share/res/modules/editors/tiny_mce_947dfc74b7dbff0f5062c429a469db58.js"),
          http("search_9")
            .get("/share/res/modules/editors/yui_editor_0a0da13c6dc370802cb4c2dc6ef1f559.js"),
          http("search_10")
            .get("/share/res/js/forms-runtime_e249b4f9b1efd764036d2d7a0b430943.js"),
          http("search_11")
            .get("/share/res/js/share_c5904b7093618304a3f28053799379a7.js"),
          http("search_12")
            .get("/share/res/js/lightbox_bc0f7ca3f123011aa02ad82dace7cae3.js"),
          http("search_13")
            .get("/share/res/modules/create-site_60c9a76848df17fa1f408ecfa0fba17f.js"),
          http("search_14")
            .get("/share/res/rm/js/alfresco-rm_cb59a2fd885d93b0dffef9c5213ff575.js"),
          http("search_15")
            .get("/share/res/rm/js/event-delegator_706ded03c3626b45142bb90f84fdc6c6.js"),
          http("search_16")
            .get("/share/res/rm/modules/create-site_0b88cdb0f71b3d56817d57654e763089.js"),
          http("search_17")
            .get("/share/res/rm-enterprise/alfresco-rm-enterprise_df0894a83f1465cf663aa4e99ee86208.js"),
          http("search_18")
            .get("/share/res/css/yui-fonts-grids_fe8fbe97553ea9e004731970a95a499b.css"),
          http("search_19")
            .get("/share/res/yui/columnbrowser/assets/columnbrowser_7cf1b34a0f616c15b52f4e1e2b15de28.css"),
          http("search_20")
            .get("/share/res/yui/columnbrowser/assets/skins/default/columnbrowser-skin_8d0c089e2ba8e57eaf72126e1fff5581.css"),
          http("search_21")
            .get("/share/res/themes/lightTheme/yui/assets/skin_1b184da3ae78707b9db6b4f085c6f2a4.css"),
          http("search_22")
            .get("/share/res/css/base_1fdda62f7742edc3b0e3c2fc1f5b51b6.css"),
          http("search_23")
            .get("/share/res/css/yui-layout_dcf75721dfd8e8e7c46cdcf6a269cedd.css"),
          http("search_24")
            .get("/share/res/themes/lightTheme/presentation_af5d4757102e90143972349a16a7be18.css"),
          http("search_25")
            .get("/share/res/modules/create-site_a38bada01786d33165967625c46d10fd.css"),
          http("search_26")
            .get("/share/res/components/form/form_2912bd6700da67b8ca6974dca52b6ebe.css"),
          http("search_27")
            .get("/share/res/js/lib/dojo-1.10.4/dijit/themes/claro/claro_cca50166019f5e7251eadfc9247b6551.css"),
          http("search_28")
            .get("/share/res/modules/editors/tinymce/tinymce.min.js?checksum=f34ea2e33cbdf16fb05ecb3e9a6f6562"),
          http("search_29")
            .get("/share/res/314712cbeeb82dd24d72b398af5a12ca.js")
            .headers(headers_29),
          http("search_30")
            .get("/share/res/f1c271f15d9ecc1b210a6411316f44db.css")
            .headers(headers_29),
          http("search_31")
            .get("/share/res/2c139513a63d5fa2b5bc6fdede767411.js")
            .headers(headers_29),
          http("search_32")
            .get("/share/res/css/tablet_7de8a1be3071a0284dec03f751448cb0.css")
            .headers(headers_29),
          http("search_33")
            .get("/share/res/css/fonts/opensans.woff"),
          http("search_34")
            .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensans.woff"),
          http("search_35")
            .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensansbold.woff"),
          http("search_36")
            .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensanscondensed.woff"),
          http("search_37")
            .get("/share/res/js/surf/5dc10e6fbe04ff9ad5aeab50b842894c.js")
            .headers(headers_29),
          http("search_38")
            .get("/share/res/js/aikau/1.0.104/alfresco/patches/touch.js")
            .headers(headers_29),
          http("search_39")
            .get("/share/res/js/lib/jquery-1.11.1/jquery-1.11.1.min.js")
            .headers(headers_29),
          http("search_40")
            .get("/share/res/js/lib/es6-promise/es6-promise.js")
            .headers(headers_29),
          http("search_41")
            .get("/share/res/js/lib/jquery-ui-1.11.1/jquery-ui.min.js")
            .headers(headers_29),
          http("search_42")
            .get("/share/res/js/lib/dojo-1.10.4/dojo/resources/blank.gif")
            .headers(headers_29),
          http("search_43")
            .get("/share/noauth/1_0_104/defaults.js")
            .headers(headers_43),
          http("search_44")
            .get("/share/res/js/aikau/1.0.104/alfresco/services/css/images/loading.gif")
            .headers(headers_29),
          http("search_45")
            .get("/share/res/js/aikau/1.0.104/alfresco/services/css/images/close.gif")
            .headers(headers_29),
          http("search_46")
            .get("/share/res/js/aikau/1.0.104/alfresco/header/css/images/search-16-gray.png"),
          http("search_47")
            .get("/share/res/js/aikau/1.0.104/alfresco/menus/css/images/transparent-20.png"),
          http("search_48")
            .get("/share/res/themes/lightTheme/images/app-logo-48.png"),
          http("search_49")
            .get("/share/res/js/aikau/1.0.104/alfresco/forms/controls/utilities/css/images/20x20-search-icon.png")
            .headers(headers_29),
          http("search_50")
            .get("/share/res/js/lib/dojo-1.10.4/dijit/themes/claro/form/images/commonFormArrows.png")
            .headers(headers_29),
          http("search_51")
            .get("/share/res/js/aikau/1.0.104/alfresco/buttons/css/images/20x20-search-icon-white.png")
            .headers(headers_29),
          http("search_52")
            .get("/share/res/js/aikau/1.0.104/alfresco/menus/css/images/12x12-selected-icon.png")
            .headers(headers_29),
          http("search_53")
            .get("/share/res/js/lib/dojo-1.10.4/dijit/themes/claro/images/spriteArrows.png")
            .headers(headers_29),
          http("search_54")
            .get("/share/proxy/alfresco/slingshot/search/?facetFields=%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreator%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.mimetype%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreated%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.size%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodifier%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodified&filters=&encodedFilters=&term=a&tag=&startIndex=0&sort=&site=&rootNode=alfresco%3A%2F%2Fcompany%2Fhome&repo=true&query=&pageSize=25&maxResults=0&noCache=1547775880178&spellcheck=true&highlightPrefix=%00&highlightPostfix=%03&highlightFields=cm%3Aname%2Ccm%3Adescription%2Ccm%3Atitle%2Ccontent%2Cia%3AdescriptionEvent%2Cia%3AwhatEvent%2Clnk%3Atitle&highlightFragmentSize=100&highlightSnippetCount=255&highlightMergeContiguous=false&highlightUsePhraseHighlighter=true")
            .headers(headers_54)
            .check(status.is(0)),
          http("search_55")
            .get("/share/res/js/aikau/1.0.104/alfresco/footer/css/images/alfresco-logo.svg")
            .headers(headers_29),
          http("search_56")
            .get("/share/res/js/aikau/1.0.104/alfresco/forms/controls/css/images/ajax_anim.gif")
            .headers(headers_29),
          http("search_57")
            .get("/share/res/js/aikau/1.0.104/alfresco/forms/controls/css/images/error-16.png")
            .headers(headers_29),
          http("search_58")
            .get("/share/res/js/aikau/1.0.104/alfresco/forms/controls/css/images/warning-16.png")
            .headers(headers_29),
          http("search_59")
            .get("/share/res/js/aikau/1.0.104/alfresco/forms/controls/css/images/help.png")
            .headers(headers_29),
          http("search_60")
            .get("/share/proxy/alfresco/slingshot/search/?facetFields=%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreator%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.mimetype%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreated%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.size%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodifier%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodified&filters=&encodedFilters=&term=a&tag=&startIndex=0&sort=&site=&rootNode=alfresco%3A%2F%2Fcompany%2Fhome&repo=true&query=&pageSize=25&maxResults=0&noCache=1547775880261&spellcheck=true&highlightPrefix=%00&highlightPostfix=%03&highlightFields=cm%3Aname%2Ccm%3Adescription%2Ccm%3Atitle%2Ccontent%2Cia%3AdescriptionEvent%2Cia%3AwhatEvent%2Clnk%3Atitle&highlightFragmentSize=100&highlightSnippetCount=255&highlightMergeContiguous=false&highlightUsePhraseHighlighter=true")
            .headers(headers_54)
            .check(status.is(0)),
          http("search_61")
            .get("/share/res/components/images/lightbox/overlay.png"),
          http("search_62")
            .get("/share/res/components/images/lightbox/loading.gif"),
          http("search_63")
            .get("/share/res/components/images/lightbox/close.gif"),
          http("search_64")
            .get("/share/proxy/alfresco/slingshot/search/?facetFields=%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreator%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.mimetype%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreated%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.size%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodifier%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodified&filters=&encodedFilters=&term=a&tag=&startIndex=0&sort=&site=&rootNode=alfresco%3A%2F%2Fcompany%2Fhome&repo=true&query=&pageSize=25&maxResults=0&noCache=1547775880265&spellcheck=true&highlightPrefix=%00&highlightPostfix=%03&highlightFields=cm%3Aname%2Ccm%3Adescription%2Ccm%3Atitle%2Ccontent%2Cia%3AdescriptionEvent%2Cia%3AwhatEvent%2Clnk%3Atitle&highlightFragmentSize=100&highlightSnippetCount=255&highlightMergeContiguous=false&highlightUsePhraseHighlighter=true")
            .headers(headers_64),
          http("search_65")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/c7d89418-c724-4c48-94e6-e0468b9bacfe/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1544816465802"),
          http("search_66")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/9e2f7695-f1c9-4f78-9246-77dad66fb5ae/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1544816465770"),
          http("search_67")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/166fdeb4-0bd8-4398-a1d0-598f4e114373/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772081486"),
          http("search_68")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/ca369f82-7f44-429e-b135-f1486739382a/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547757096808"),
          http("search_69")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/02a533c0-f8f5-4e6a-9150-a2bc8d49fa2a/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772062462"),
          http("search_70")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/4b9ebe73-7b19-4aaf-b596-5e545544e2a6/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_71")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/e57195d3-aeda-432d-bfc4-0a556b2d8ab9/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_72")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/05dedd34-9d9d-48d9-9af6-c81b555541c9/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_73")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/a53c7a85-12d0-4eb1-8e03-f030e0778da3/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_74")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/05571c6d-bf6c-4509-8242-5d159726ec80/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_75")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/7778cf88-836f-4833-a0df-3056d2b20e7a/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_76")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/8d4429e7-804f-43cf-bd81-288e561db9a8/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_77")
            .get("/share/res/js/aikau/1.0.104/alfresco/renderers/css/images/folder-64.png")
            .headers(headers_29),
          http("search_78")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/db31dce5-2469-4c68-8641-9becad64a756/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_79")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/06b07aa0-c8f5-494b-a2ff-ff134d7bcd9b/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_80")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/5eda88dd-74dc-4166-a3df-bb4500ed8877/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_81")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/f85d87f1-79d9-450f-b01c-5fed4b44f86b/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_82")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/0d25b0b0-e61b-4ac5-9c04-1647fde8d1c6/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772063258")
            .headers(headers_29),
          http("search_83")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/32662ab9-df6b-4ccc-89d9-1f46de24c474/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772101873")
            .headers(headers_29),
          http("search_84")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/1fc75fa2-c26d-44f3-a9a3-bb624d8cb14f/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772178902")
            .headers(headers_29),
          http("search_85")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/e5388e9f-05b8-4910-8080-bdbd848b7cbd/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772179271")
            .headers(headers_29),
          http("search_86")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/fe5fc1e7-9e88-42b8-a8ff-13eff3ea930c/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772063148")
            .headers(headers_29),
          http("search_87")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/56f1d973-2090-4120-9f5e-79f2a47ae5eb/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772101979")
            .headers(headers_29),
          http("search_88")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/9b1b4447-1ba4-458a-9787-d4c80d9d93b1/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772179066")
            .headers(headers_29),
          http("search_89")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/01a949c4-4bef-4b4f-9430-2dd59bd1d66d/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772178789")
            .headers(headers_29),
          http("search_90")
            .get("/share/res/js/aikau/1.0.104/alfresco/search/css/images/12x12-selected-icon.png")
            .headers(headers_29)))
      .pause(2)
      .exec(http("search_91")
        .get("/share/proxy/alfresco/slingshot/search/?facetFields=%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreator%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.mimetype%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcreated%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dcontent.size%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodifier%2C%7Bhttp%3A%2F%2Fwww.alfresco.org%2Fmodel%2Fcontent%2F1.0%7Dmodified&filters=&encodedFilters=&term=a&tag=&startIndex=25&sort=&site=&rootNode=alfresco%3A%2F%2Fcompany%2Fhome&repo=true&query=&pageSize=25&maxResults=0&noCache=1547775883989&spellcheck=true&highlightPrefix=%00&highlightPostfix=%03&highlightFields=cm%3Aname%2Ccm%3Adescription%2Ccm%3Atitle%2Ccontent%2Cia%3AdescriptionEvent%2Cia%3AwhatEvent%2Clnk%3Atitle&highlightFragmentSize=100&highlightSnippetCount=255&highlightMergeContiguous=false&highlightUsePhraseHighlighter=true")
        .headers(headers_64)
        .resources(http("search_92")
          .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/c671da7d-eedd-4797-947b-6a13368df0b3/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772079090"),
          http("search_93")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/d5f03ac4-4f02-41ab-9847-ac10c8d88aef/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1541768335256"),
          http("search_94")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/daf9ad08-a7f1-4c27-8d8f-d4ec162cb757/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772077650"),
          http("search_95")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/b5cccced-ef5b-4256-85f2-175212753b86/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772059626"),
          http("search_96")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/f3bb5d08-9fd1-46da-a94a-97f20f1ef208/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_97")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/150398b3-7f82-4cf6-af63-c450ef6c5eb8/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_98")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/a8290263-4178-48f5-a0b0-be155a424828/content/thumbnails/doclib?c=queue&ph=true")
            .headers(headers_29),
          http("search_99")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/da66df7c-75f9-44d0-90ad-c144887b7e49/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082060")
            .headers(headers_29),
          http("search_100")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/7ccb88de-7427-47dc-8316-82de33a3eef5/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082455")
            .headers(headers_29),
          http("search_101")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/3257f9db-6432-4a01-9fa4-ebce48282496/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082268")
            .headers(headers_29),
          http("search_102")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/f885d297-f498-438a-9f81-37126ffbb2ec/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082263")
            .headers(headers_29),
          http("search_103")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/9eeea3c8-08d1-4624-8561-0f96c5337de6/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082027")
            .headers(headers_29),
          http("search_104")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/5e4997c4-a48f-4eb4-bffd-17d7b6462ec4/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772082475")
            .headers(headers_29),
          http("search_105")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/46f2145c-452e-4862-8024-bd1768f7404a/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772053124")
            .headers(headers_29),
          http("search_106")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/a6654049-34c1-4707-85f9-dfcb03a14245/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772063431")
            .headers(headers_29),
          http("search_107")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/fa05b1fd-b033-49d0-b6c0-3339d116e791/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772062934")
            .headers(headers_29),
          http("search_108")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/af0bc994-69a0-41f8-b1c2-6f4ea81be689/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772062800")
            .headers(headers_29),
          http("search_109")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/3663b4fb-16e4-4a25-8b37-ee45cae3897b/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772053165")
            .headers(headers_29),
          http("search_110")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/c0ebb34b-3755-4122-beb1-eefeb5474c50/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547772053140")
            .headers(headers_29),
          http("search_111")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/d9d214cc-5764-4c20-98f8-bbc3e928431c/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775831041")
            .headers(headers_111),
          http("search_112")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/96608d67-bc0a-4472-987b-5c314fb4d39c/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775831039")
            .headers(headers_111),
          http("search_113")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/2fd03d2a-a0e1-4b58-b00d-6fae4396e339/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775830617")
            .headers(headers_111),
          http("search_114")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/7e35ec00-5111-4518-a788-e774c2c12350/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775830964")
            .headers(headers_111),
          http("search_115")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/3699fdcf-8b69-4d9e-a69b-d8bd3bcc812f/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775830983")
            .headers(headers_111),
          http("search_116")
            .get("/share/proxy/alfresco/api/node/workspace/SpacesStore/f15b06c7-71fe-45f4-8a68-b6c891987106/content/thumbnails/doclib?c=queue&ph=true&lastModified=doclib:1547775830759")
            .headers(headers_111))
      )
  }
}
