<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ArticleContent</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="内容页">
	
	<link rel="stylesheet" type="text/css" href="css/header.css">
	
	<script src="js/jquery.js"></script>
	<script type="text/javascript" src="http://static.runoob.com/assets/qrcode/qrcode.min.js"></script>

  </head>
  
  <body style="text-align:center;">
  <%@include file="../common/header.jsp" %>
  <div style="width:85%;padding:4%">
  		<div class="content_read" style="width:90%;height:100%;">
  			<div class="box_con" style="width:100%;height:100%;">
				<div class="bookname">
					<h1> 第一章 他叫白小纯</h1>
				</div>
				<div id="content">
					帽儿山，位于东林山脉中，山下有一个村子，民风淳朴，以耕田为生，与世隔绝。
					 
					 清晨，村庄的大门前，整个村子里的乡亲，正为一个十五六岁少年送别，这少年瘦弱，但却白白净净，看起来很是乖巧，衣着尽管是寻常的青衫，可却洗的泛白，穿在这少年的身上，与他目中的纯净搭配在一起，透出一股子灵动。
					 
					 他叫白小纯。
					 
					 “父老乡亲们，我要去修仙了，可我舍不得你们啊。”少年满脸不舍，原本就乖巧的样子，此刻看起来更为纯朴。
					 
					 四周的乡亲，面面相觑，顿时摆出难舍之色。
					 
					 “小纯，你爹娘走的早，你是个……好孩子！！难道你不想长生了么，成为仙人就可以长生，能活的很久很久，走吧，雏鹰长大，总有飞出去的那一天。”人群内走出一个头发花白的老者，说道好孩子三个字时，他顿了一下。
					 
					 “在外面遇到任何事情，都要坚持下去，走出村子，就不要回来，因为你的路在前方！”老人神色慈祥，拍了拍少年的肩膀。
					 
					 “长生……”白小纯身体一震，目中慢慢坚定起来，在老者以及四周乡亲鼓励的目光下，他重重的点了点头，深深的看了一眼四周的乡亲，转身迈着大步，渐渐走出了村子。
					 
					 眼看少年的身影远去，村中的众人，一个个都激动起来，目中的难舍刹那就被喜悦代替，那之前满脸慈祥的老者，此刻也在颤抖，眼中流下泪水。
					 
					 “苍天有眼，这白鼠狼，他终于……终于走了，是谁告诉他在附近看到仙人的，你为村子立下了大功！”
					 
					 “这白鼠狼终于肯离开了，可怜我家的几只鸡，就因为这白鼠狼怕鸡打鸣，不知用了什么方法，唆使一群孩子吃鸡肉，把全村的鸡都给吃的干干净净……”
					 
					 “今天过年了！”欢呼之声，立刻在这不大的村子里，沸腾而起，甚至有人拿出了锣鼓，高兴的敲打起来。
					 
					 村子外，白小纯还没等走远，他就听到了身后村子内，传出了敲锣打鼓的声音，还夹着欢呼。
					 
					 白小纯脚步一顿，神色有些古怪，干咳一声，伴随着耳边传来的锣鼓，白小纯顺着山路，走上了帽儿山。
					 
					 这帽儿山虽不高，却灌木杂多，虽是清晨，可看起来也是黑压压一片，很是安静。
					 
					 “听二狗说，他前几天在这里被一头野猪追赶时，看到天上有仙人飞过……”白小纯走在山路上，心脏怦怦跳动时，忽然一旁的灌林中传来阵阵哗哗声，似野猪一样，这声音来的突然，让本就紧张的白小纯，顿时背后发凉。
					 
					 “谁，谁在那里！”白小纯右手快速从行囊中拿出四把斧头，六把柴刀，还觉得不放心，又从怀里取出了一小根黑色的香，死死的抓住。
					 
					 “别出来，千万别出来，我有斧头，有柴刀，手里的香还可以召唤天雷，能引仙人降临，你敢出来，就霹死你！”白小纯哆嗦的大喊，连滚带爬的夹着那些武器，赶紧顺着山路跑去，沿途叮当乱响，斧头柴刀掉了一地。
					 
					 或许是真的被他给吓住了，很快的哗哗声就消失，没有什么野兽跑出来，白小纯面色苍白，擦了擦冷汗，有心放弃继续上山，可一想到手中这根香是他爹娘去世前留给他的，据说是祖上曾偶然的救下一个落魄的仙人，那仙人离去时留下这根香作为报答，曾言会收下白家血脉一人为弟子，只要点燃，仙人就会到来。
					 
				</div>
			</div>
  		</div>
  </div>
    
  <%@include file="../common/footer.jsp" %>
  <script>
  $(document).ready(function(){
		qrload();
	});
  
  function qrload(){
		/* new QRCode(document.getElementById('qrcode'), 'your content');
		qrcode.makeCode(this.value); */
		var name = $("#name").html();
		//二维码生成
		// 设置参数方式
		var qrcode = new QRCode('qrcode', {
		  text: 'my content',
		  width: 100,
		  height: 100,
		  colorDark : '#000000',
		  colorLight : '#ffffff',
		  correctLevel : QRCode.CorrectLevel.H
		});
		// 使用 API
		qrcode.makeCode("http://www.baidu.com");//至于怎么联系！哈哈哈！
	}
  </script>
  </body>
</html>
