<#--this is ${name}-->

<#--<#if sex=="1">-->
            <#--男-->
      <#--<#elseif sex=="2">-->
            <#--女-->
     <#--<#else>-->
        <#--其他      -->
	  <#---->
	  <#--</#if>-->

<#list bloglist as blog>
 ${blog.title}
</#list>
