
$(document).ready(function(){
	
	
	$.ajax({
		url: "/dsm/group/list", 
		type:"POST",
		data : {},
		success : function(data){
			grid(data);
			
		}
		});
	
})


function grid (data){
	const instance = new tui.Grid({
		el: document.getElementById("grid"),
		columns:[
			{
				header :'',
				name :'chkbox'
			},
			{
				header :'그룹명',
				name :'groupname'
			},
			{
				header :'그룹코드',
				name :'groupcode'
			},
			{
				header :'그룹리더',
				name :'groupleader'
			},
			{
				header :'인원',
				name :'groupmember'
			}
		],
		data 
	});
	
	instance.resetData(data);
	
	
	
	
}