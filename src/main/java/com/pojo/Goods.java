package com.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
 
//@Data注解是lombok的注解，简化实体类编写，自动生成get/set以及toString等方法
@Data
public class Goods {
    @TableId
    private Long gid;
    private String gname;
    private Long userId;
    private String gstatus;
}