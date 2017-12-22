<#--这是Freemarker的设置 -->
<#setting number_format="currency"/>

<#assign num1=20/>
<#assign num2=2.345/>
数字：${num1}
<#--这是Freemarker的数字的使用-->
数字：${num1?string}
数字：${num1?string.percent}
数字：#{num1;m4}
数字：#{num2;M2}
<#--这是Freemarker的集合的使用-->
<#list ["张三","李四","王麻子"]+["aaa","bbbb"] as n >
${n}
</#list>

外界：${name}
${name?length}
${name?length/10}
外界传递集合：
<#list ids as i>
主键：${i}
</#list>
集合的元素个数：${ids?size}
<#--这是Freemarker的Map集合的使用-->
<#list students?keys as k>
Map集合：${k}--值：${students[k]?default("未知")}

</#list>
<#assign str="abcdefg"/>
${str[1..5]}
<#list (map1+map2)?keys as k>
Map集合：${k}--值：${map1[k]?default("未知")}

</#list>

<#if idddss?exists >
存在
<#else>
不存在
</#if>
