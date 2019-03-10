function loadSearchDemo(){
    $("#searchDemoListDiv").clear;
    $("#searchDemoListDiv").load("/demo/searchDemoList");
}

function loadManagerDemo(){
    $("#managerDemoListDiv").clear;
    $("#managerDemoListDiv").load("/demo/managerDemoList");
}


function addDemo() {
    var id = $('#addDemoForm #id').val();
    var name = $('#addDemoForm #name').val();
    var email = $('#addDemoForm #email').val();
    var detail = $('#addDemoForm #detail').val();
    $.ajax({
        url: '/demo/addDemo',
        type: "post",
        async: false,
        data:{
            id:id,
            name:name,
            email:email,
            detail:detail
        },
        success:function(data){
            $('#addDemoModal').modal('hide');//隐藏modal
            $('.modal-backdrop').remove();//去掉遮罩层
            $('#logAndReg').hide();
            $('#log')
            loadManagerDemo();
        },
        error:function(data){
            $('#addDemoModal').modal('hide');//隐藏modal
            $('.modal-backdrop').remove();//去掉遮罩层
            $('#logAndReg').hide();
            $('#log')
            loadManagerDemo();
        }
    });
}

function editDemo(obj) {
    var this_ = $(obj);

    var id = this_.parents('tr').find('td:eq(0)').text()
    var name = this_.parents('tr').find('td:eq(1)').text();
    var email = this_.parents('tr').find('td:eq(2)').text();
    var detail = this_.parents('tr').find('td:eq(3)').text();

    $('#editDemoForm #id').val(id);
    $('#editDemoForm #name').val(name);
    $('#editDemoForm #email').val(email);
    $('#editDemoForm #detail').val(detail);
}

function saveEditDemo() {
    var id = $('#editDemoForm #id').val();
    var name = $('#editDemoForm #name').val();
    var email = $('#editDemoForm #email').val();
    var detail = $('#editDemoForm #detail').val();

    $.ajax({
        url: '/demo/editDemo',
        type: "post",
        async: false,
        data:{
            id:id,
            name:name,
            email:email,
            detail:detail
        },
        success:function(data){
            $('#editDemoModal').modal('hide');//隐藏modal
            $('.modal-backdrop').remove();//去掉遮罩层
            $('#logAndReg').hide();
            $('#log')
            loadManagerDemo();
        },
        error:function(data){
            $('#editDemoModal').modal('hide');//隐藏modal
            $('.modal-backdrop').remove();//去掉遮罩层
            $('#logAndReg').hide();
            $('#log')
            loadManagerDemo();
        }
    });
}

function delDemo(id) {
    var result = confirm('确定删除该Demo吗?！');
    if(result){
        $.ajax({
            url: '/demo/deleteDemo',
            type: "post",
            async: false,
            data:{
                id:id
            },
            success:function(data){
                loadManagerDemo();
            },
            error:function(data){
                loadManagerDemo();
            }
        });
    }else{
        return
    }
}