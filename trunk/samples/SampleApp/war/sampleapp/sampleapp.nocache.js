function sampleapp(){var l='',F='" for "gwt:onLoadErrorFn"',D='" for "gwt:onPropertyErrorFn"',n='"><\/script>',p='#',r='/',Db='<script defer="defer">sampleapp.onInjectionDone(\'sampleapp\')<\/script>',bc='<script id="',A='=',q='?',C='Bad handler "',Cb='DOMContentLoaded',tb="GWT module 'sampleapp' needs to be (re)compiled, please run a compile or use the Compile/Browse button in hosted mode",ub='GwtFacebook.css',o='SCRIPT',ac='__gwt_marker_sampleapp',s='base',nb='begin',cb='bootstrap',u='clear.cache.gif',z='content',Fb='end',mb='gecko',ob='gecko1_8',yb='gwt.hybrid',Bb='gwt/standard/standard.css',E='gwt:onLoadErrorFn',B='gwt:onPropertyErrorFn',y='gwt:property',Ab='head',rb='hosted.html?sampleapp',zb='href',lb='ie6',kb='ie8',ab='iframe',t='img',bb="javascript:''",vb='link',qb='loadExternalRefs',v='meta',eb='moduleRequested',Eb='moduleStartup',jb='msie',w='name',gb='opera',db='position:absolute;width:0;height:0;border:none',wb='rel',ib='safari',m='sampleapp',sb='selectingPermutation',x='startup',xb='stylesheet',pb='unknown',fb='user.agent',hb='webkit';var dc=window,k=document,cc=dc.__gwtStatsEvent?function(a){return dc.__gwtStatsEvent(a)}:null,xc,nc,ic,hc=l,qc={},Ac=[],wc=[],gc=[],tc,vc;cc&&cc({moduleName:m,subSystem:x,evtGroup:cb,millis:(new Date()).getTime(),type:nb});if(!dc.__gwt_stylesLoaded){dc.__gwt_stylesLoaded={}}if(!dc.__gwt_scriptsLoaded){dc.__gwt_scriptsLoaded={}}function mc(){var b=false;try{b=dc.external&&(dc.external.gwtOnLoad&&dc.location.search.indexOf(yb)==-1)}catch(a){}mc=function(){return b};return b}
function pc(){if(xc&&nc){var c=k.getElementById(m);var b=c.contentWindow;if(mc()){b.__gwt_getProperty=function(a){return jc(a)}}sampleapp=null;b.gwtOnLoad(tc,m,hc);cc&&cc({moduleName:m,subSystem:x,evtGroup:Eb,millis:(new Date()).getTime(),type:Fb})}}
function kc(){var j,h=ac,i;k.write(bc+h+n);i=k.getElementById(h);j=i&&i.previousSibling;while(j&&j.tagName!=o){j=j.previousSibling}function f(b){var a=b.lastIndexOf(p);if(a==-1){a=b.length}var c=b.indexOf(q);if(c==-1){c=b.length}var d=b.lastIndexOf(r,Math.min(c,a));return d>=0?b.substring(0,d+1):l}
;if(j&&j.src){hc=f(j.src)}if(hc==l){var e=k.getElementsByTagName(s);if(e.length>0){hc=e[e.length-1].href}else{hc=f(k.location.href)}}else if(hc.match(/^\w+:\/\//)){}else{var g=k.createElement(t);g.src=hc+u;hc=f(g.src)}if(i){i.parentNode.removeChild(i)}}
function uc(){var f=document.getElementsByTagName(v);for(var d=0,g=f.length;d<g;++d){var e=f[d],h=e.getAttribute(w),b;if(h){if(h==y){b=e.getAttribute(z);if(b){var i,c=b.indexOf(A);if(c>=0){h=b.substring(0,c);i=b.substring(c+1)}else{h=b;i=l}qc[h]=i}}else if(h==B){b=e.getAttribute(z);if(b){try{vc=eval(b)}catch(a){alert(C+b+D)}}}else if(h==E){b=e.getAttribute(z);if(b){try{tc=eval(b)}catch(a){alert(C+b+F)}}}}}}
function jc(d){var e=wc[d](),b=Ac[d];if(e in b){return e}var a=[];for(var c in b){a[b[c]]=c}if(vc){vc(d,a,e)}throw null}
var lc;function oc(){if(!lc){lc=true;var a=k.createElement(ab);a.src=bb;a.id=m;a.style.cssText=db;a.tabIndex=-1;k.body.appendChild(a);cc&&cc({moduleName:m,subSystem:x,evtGroup:Eb,millis:(new Date()).getTime(),type:eb});a.contentWindow.location.replace(hc+yc)}}
wc[fb]=function(){var d=navigator.userAgent.toLowerCase();var b=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(d.indexOf(gb)!=-1){return gb}else if(d.indexOf(hb)!=-1){return ib}else if(d.indexOf(jb)!=-1){if(document.documentMode>=8){return kb}else{var c=/msie ([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){var e=b(c);if(e>=6000){return lb}}}}else if(d.indexOf(mb)!=-1){var c=/rv:([0-9]+)\.([0-9]+)/.exec(d);if(c&&c.length==3){if(b(c)>=1008)return ob}return mb}return pb};Ac[fb]={gecko:0,gecko1_8:1,ie6:2,ie8:3,opera:4,safari:5};sampleapp.onScriptLoad=function(){if(lc){nc=true;pc()}};sampleapp.onInjectionDone=function(){xc=true;cc&&cc({moduleName:m,subSystem:x,evtGroup:qb,millis:(new Date()).getTime(),type:Fb});pc()};kc();var yc;if(mc()){if(dc.external.initModule&&dc.external.initModule(m)){dc.location.reload();return}yc=rb}uc();cc&&cc({moduleName:m,subSystem:x,evtGroup:cb,millis:(new Date()).getTime(),type:sb});if(!yc){try{alert(tb);return}catch(a){return}}var sc;function rc(){if(!ic){ic=true;if(!__gwt_stylesLoaded[ub]){var a=k.createElement(vb);__gwt_stylesLoaded[ub]=a;a.setAttribute(wb,xb);a.setAttribute(zb,hc+ub);k.getElementsByTagName(Ab)[0].appendChild(a)}if(!__gwt_stylesLoaded[Bb]){var a=k.createElement(vb);__gwt_stylesLoaded[Bb]=a;a.setAttribute(wb,xb);a.setAttribute(zb,hc+Bb);k.getElementsByTagName(Ab)[0].appendChild(a)}pc();if(k.removeEventListener){k.removeEventListener(Cb,rc,false)}if(sc){clearInterval(sc)}}}
if(k.addEventListener){k.addEventListener(Cb,function(){oc();rc()},false)}var sc=setInterval(function(){if(/loaded|complete/.test(k.readyState)){oc();rc()}},50);cc&&cc({moduleName:m,subSystem:x,evtGroup:cb,millis:(new Date()).getTime(),type:Fb});cc&&cc({moduleName:m,subSystem:x,evtGroup:qb,millis:(new Date()).getTime(),type:nb});k.write(Db)}
sampleapp();