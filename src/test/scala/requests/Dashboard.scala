package requests

import io.gatling.http.Predef.{http, status}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Dashboard {
  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "cache-control" -> "max-age=0",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_49 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_50 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_60 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "application/json",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "x-requested-with" -> "application/json")

  val headers_65 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "content-type" -> "application/x-www-form-urlencoded",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "x-requested-with" -> "application/json")

  val headers_67 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "x-requested-with" -> "application/json")

  val headers_83 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")

  val headers_89 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9",
    "cache-control" -> "no-cache",
    "pragma" -> "no-cache",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")


  val dashboard = group("Open Dashboard") {
    exec(http("Dashboard")
      .get("/share/page/user/admin/dashboard")
      .headers(headers_0)
      .resources(http("dashboard_1")
        .get("/share/noauth/messages_4c142500ec820b7198a19dd4df4f7753.js?locale=en_US"),
        http("dashboard_2")
          .get("/share/res/js/lib/dojo-1.10.4/dojo/dojo.js"),
        http("dashboard_3")
          .get("/share/res/js/yui-common_85fe398e5deaf2958d87495ebd1e083d.js"),
        http("dashboard_4")
          .get("/share/res/yui/history/history_543b42a00a378f4d4b6e70c81d915b0a.js"),
        http("dashboard_5")
          .get("/share/res/js/bubbling.v2.1_5a671b93e806ea64b41f915cf6147232.js"),
        http("dashboard_6")
          .get("/share/res/js/flash/AC_OETags_23681d043aef7e80993a9f9354d71741.js"),
        http("dashboard_7")
          .get("/share/res/js/alfresco_16d6ab19ef893ce787dba847b324f713.js"),
        http("dashboard_8")
          .get("/share/res/modules/editors/tiny_mce_947dfc74b7dbff0f5062c429a469db58.js"),
        http("dashboard_9")
          .get("/share/res/modules/editors/yui_editor_0a0da13c6dc370802cb4c2dc6ef1f559.js"),
        http("dashboard_10")
          .get("/share/res/js/forms-runtime_e249b4f9b1efd764036d2d7a0b430943.js"),
        http("dashboard_11")
          .get("/share/res/js/share_c5904b7093618304a3f28053799379a7.js"),
        http("dashboard_12")
          .get("/share/res/js/lightbox_bc0f7ca3f123011aa02ad82dace7cae3.js"),
        http("dashboard_13")
          .get("/share/res/modules/create-site_60c9a76848df17fa1f408ecfa0fba17f.js"),
        http("dashboard_14")
          .get("/share/res/rm/js/alfresco-rm_cb59a2fd885d93b0dffef9c5213ff575.js"),
        http("dashboard_15")
          .get("/share/res/rm/js/event-delegator_706ded03c3626b45142bb90f84fdc6c6.js"),
        http("dashboard_16")
          .get("/share/res/rm/modules/create-site_0b88cdb0f71b3d56817d57654e763089.js"),
        http("dashboard_17")
          .get("/share/res/rm-enterprise/alfresco-rm-enterprise_df0894a83f1465cf663aa4e99ee86208.js"),
        http("dashboard_18")
          .get("/share/res/components/dashlets/my-documents_609f91590f29b703462cc5768795f4d6.js"),
        http("dashboard_19")
          .get("/share/res/components/dashlets/my-docs-editing_a64fe4128428c977f729d5bd7bd523e7.js"),
        http("dashboard_20")
          .get("/share/res/components/dashlets/activities_cda37f5c76395886e32270503d0ab7bb.js"),
        http("dashboard_21")
          .get("/share/res/components/dashlets/my-sites_8d096e61d79b220283c9440065734929.js"),
        http("dashboard_22")
          .get("/share/res/modules/delete-site_4f654579c88935e9819b08bd9653c0b9.js"),
        http("dashboard_23")
          .get("/share/res/modules/about-share_469c075223b37f7a4263a25a0921b929.js"),
        http("dashboard_24")
          .get("/share/res/9ce2bea406e05673afe93d6cc634d18a.js"),
        http("dashboard_25")
          .get("/share/res/css/yui-fonts-grids_fe8fbe97553ea9e004731970a95a499b.css"),
        http("dashboard_26")
          .get("/share/res/yui/columnbrowser/assets/columnbrowser_7cf1b34a0f616c15b52f4e1e2b15de28.css"),
        http("dashboard_27")
          .get("/share/res/yui/columnbrowser/assets/skins/default/columnbrowser-skin_8d0c089e2ba8e57eaf72126e1fff5581.css"),
        http("dashboard_28")
          .get("/share/res/themes/lightTheme/yui/assets/skin_1b184da3ae78707b9db6b4f085c6f2a4.css"),
        http("dashboard_29")
          .get("/share/res/css/base_1fdda62f7742edc3b0e3c2fc1f5b51b6.css"),
        http("dashboard_30")
          .get("/share/res/css/yui-layout_dcf75721dfd8e8e7c46cdcf6a269cedd.css"),
        http("dashboard_31")
          .get("/share/res/themes/lightTheme/presentation_af5d4757102e90143972349a16a7be18.css"),
        http("dashboard_32")
          .get("/share/res/modules/create-site_a38bada01786d33165967625c46d10fd.css"),
        http("dashboard_33")
          .get("/share/res/components/form/form_2912bd6700da67b8ca6974dca52b6ebe.css"),
        http("dashboard_34")
          .get("/share/res/js/lib/dojo-1.10.4/dijit/themes/claro/claro_cca50166019f5e7251eadfc9247b6551.css"),
        http("dashboard_35")
          .get("/share/res/components/dashlets/my-documents_277fd4aa3e5f02b08f8fabeeb21af9fd.css"),
        http("dashboard_36")
          .get("/share/res/components/dashlets/my-docs-editing_1eb52e38cd63c6184563fa1db59febcd.css"),
        http("dashboard_37")
          .get("/share/res/components/dashlets/activities_22a0386accc23fb6a4c168023d905847.css"),
        http("dashboard_38")
          .get("/share/res/components/dashlets/my-sites_5773ff8319a6d8335c69f91b0424daf4.css"),
        http("dashboard_39")
          .get("/share/res/modules/delete-site_d41d8cd98f00b204e9800998ecf8427e.css"),
        http("dashboard_40")
          .get("/share/res/components/dashlets/my-profile_ee4fdc710e8342b5ad9be55899437693.css"),
        http("dashboard_41")
          .get("/share/res/modules/about-share_c2a748db5261f52c33948513e542370e.css"),
        http("dashboard_42")
          .get("/share/res/components/footer/footer_a16f133d448efeab6e296e2d567be59b.css"),
        http("dashboard_43")
          .get("/share/res/modules/editors/tinymce/tinymce.min.js?checksum=f34ea2e33cbdf16fb05ecb3e9a6f6562"),
        http("dashboard_44")
          .get("/share/res/rm/css/rm_3c6d5f39e60b48720882518ed58a6d15.css"),
        http("dashboard_45")
          .get("/share/res/components/images/site-16.png"),
        http("dashboard_46")
          .get("/share/res/components/images/user-16.png"),
        http("dashboard_47")
          .get("/share/proxy/alfresco/slingshot/profile/avatar/avatar"),
        http("dashboard_48")
          .get("/share/res/components/images/alfresco-logo.svg"),
        http("dashboard_49")
          .get("/share/res/a27498439375a45360406b83ab2a09bd.css")
          .headers(headers_49),
        http("dashboard_50")
          .get("/share/res/components/images/filetypes/%7BfileExt%7D-file-32.png")
          .headers(headers_50)
          .check(status.is(404)),
        http("dashboard_51")
          .get("/share/res/%7Bicon%7D")
          .headers(headers_50)
          .check(status.is(404)),
        http("dashboard_52")
          .get("/share/res/css/fonts/opensans.woff"),
        http("dashboard_53")
          .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensans.woff"),
        http("dashboard_54")
          .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensansbold.woff"),
        http("dashboard_55")
          .get("/share/res/js/aikau/1.0.104/alfresco/core/css/opensanscondensed.woff"),
        http("dashboard_56")
          .get("/share/res/components/images/lightbox/loading.gif"),
        http("dashboard_57")
          .get("/share/res/components/documentlibrary/images/simple-view-on-16.png"),
        http("dashboard_58")
          .get("/share/res/components/documentlibrary/images/detailed-view-off-16.png"),
        http("dashboard_59")
          .get("/share/res/components/images/header/help.png"),
        http("dashboard_60")
          .get("/share/proxy/alfresco/slingshot/doclib/doclist/documents/node/alfresco/company/home?filter=editingMe&max=3&sortField=cm:modified&sortAsc=false")
          .headers(headers_60),
        http("dashboard_61")
          .get("/share/res/components/images/feed-icon-16.png"),
        http("dashboard_62")
          .get("/share/res/js/surf/fb37ad838bd8487195826e558f362bc5.js")
          .headers(headers_49),
        http("dashboard_63")
          .get("/share/proxy/alfresco/slingshot/dashlets/my-contents")
          .headers(headers_60),
        http("dashboard_64")
          .get("/share/service/modules/authenticated?noCache=1547775721235&a=user")
          .headers(headers_60),
        http("dashboard_65")
          .get("/share/proxy/alfresco/api/people/admin/sites?roles=user&size=100")
          .headers(headers_65),
        http("dashboard_66")
          .get("/share/service/components/dashlets/activities/list?site=&mode=user&dateFilter=7&userFilter=all&activityFilter=")
          .headers(headers_65),
        http("dashboard_67")
          .get("/share/proxy/alfresco/slingshot/doclib/doclist/documents/node/alfresco/company/home?max=50&filter=recentlyModifiedByMe")
          .headers(headers_67),
        http("dashboard_68")
          .get("/share/res/components/images/filetypes/generic-site-32.png"),
        http("dashboard_69")
          .get("/share/res/components/images/wikipage-32.png"),
        http("dashboard_70")
          .get("/share/res/components/images/star-selected_16x16.png"),
        http("dashboard_71")
          .get("/share/res/components/images/delete-16.png"),
        http("dashboard_72")
          .get("/share/res/components/images/star-deselected_16x16.png"),
        http("dashboard_73")
          .get("/share/res/components/images/help-activities-bw-32.png"),
        http("dashboard_74")
          .get("/share/res/%7Bicon%7D")
          .headers(headers_50)
          .check(status.is(404)),
        http("dashboard_75")
          .get("/share/res/components/images/filetypes/img-file-32.png"),
        http("dashboard_76")
          .get("/share/res/components/images/filetypes/pdf-file-32.png"),
        http("dashboard_77")
          .get("/share/res/components/images/filetypes/doc-file-32.png"),
        http("dashboard_78")
          .get("/share/res/js/aikau/1.0.104/alfresco/patches/touch.js")
          .headers(headers_49),
        http("dashboard_79")
          .get("/share/res/js/lib/jquery-1.11.1/jquery-1.11.1.min.js")
          .headers(headers_49),
        http("dashboard_80")
          .get("/share/res/js/lib/jquery-ui-1.11.1/jquery-ui.min.js")
          .headers(headers_49),
        http("dashboard_81")
          .get("/share/res/js/lib/es6-promise/es6-promise.js")
          .headers(headers_49),
        http("dashboard_82")
          .get("/share/res/js/lib/dojo-1.10.4/dojo/resources/blank.gif")
          .headers(headers_49),
        http("dashboard_83")
          .get("/share/noauth/1_0_104/defaults.js")
          .headers(headers_83),
        http("dashboard_84")
          .get("/share/res/js/aikau/1.0.104/alfresco/header/css/images/search-16-gray.png"),
        http("dashboard_85")
          .get("/share/res/js/aikau/1.0.104/alfresco/menus/css/images/transparent-20.png"),
        http("dashboard_86")
          .get("/share/res/themes/lightTheme/images/app-logo-48.png"),
        http("dashboard_87")
          .get("/share/res/components/images/lightbox/overlay.png"),
        http("dashboard_88")
          .get("/share/res/components/images/lightbox/close.gif"),
        http("dashboard_89")
          .get("/share/res/favicon.ico")
          .headers(headers_89),
        http("dashboard_90")
          .get("/share/res/favicon.ico")
          .headers(headers_49)))
  }
}
