
			function showusermanage(user){
				var doc=document.getElementsByClassName(user);
				for(var i=0;i<doc.length;i++){	
					var docdom=doc[i].style.display
					if(docdom=="none"||docdom==""){
						doc[i].style.display="block"
					}else{
						doc[i].style.display="none"
					}
				}
			}
