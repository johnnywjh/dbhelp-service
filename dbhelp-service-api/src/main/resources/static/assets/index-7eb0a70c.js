import{k as d,U as c,a0 as m,r as y,o as n,t as o,w as r,a1 as u,a2 as g,v as l,D as f,q as z,m as h,n as S}from"./index-220568ec.js";const v={tag:{type:String,default:"div"},type:String,size:String,deleted:Boolean,underline:Boolean,strong:Boolean,italic:Boolean,icon:[String,Object,Function],iconProps:Object,iconStyle:Object},B=d({name:"EleText",components:{ElIcon:c},props:v,setup(){const{authenticated:e}=m();return{authenticated:e}}}),C=(e,i)=>{const s=e.__vccOpts||e;for(const[a,t]of i)s[a]=t;return s};function $(e,i,s,a,t,k){const p=y("ElIcon");return n(),o(l(e.tag),{class:S(["ele-text",{"is-heading":e.type==="heading"},{"is-secondary":e.type==="secondary"},{"is-placeholder":e.type==="placeholder"},{"is-primary":e.type==="primary"},{"is-success":e.type==="success"},{"is-warning":e.type==="warning"},{"is-danger":e.type==="danger"},{"is-info":e.type==="info"},{"is-xs":e.size==="xs"},{"is-sm":e.size==="sm"},{"is-md":e.size==="md"},{"is-lg":e.size==="lg"},{"is-xl":e.size==="xl"},{"is-xxl":e.size==="xxl"},{"is-xxxl":e.size==="xxxl"},{"is-delete":e.deleted},{"is-underline":e.underline},{"is-strong":e.strong},{"is-italic":e.italic},{"is-icon":!!e.icon}])},{default:r(()=>[e.authenticated&&e.icon?(n(),o(p,u(g({key:0},e.iconProps||{})),{default:r(()=>[(n(),o(l(e.icon),{style:f(e.iconStyle)},null,8,["style"]))]),_:1},16)):z("",!0),h(e.$slots,"default")]),_:3},8,["class"])}const w=C(B,[["render",$]]);export{w as i};
