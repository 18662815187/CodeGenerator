package com.rose.live.entity;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * <p>
 * 
 * </p>
 *
 * @author jozu
 * @since 2020-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Anchorzone对象", description="")
public class Anchorzone implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty(value = "主播id")
    @TableField("anchorId")
    private Long anchorId;

    @ApiModelProperty(value = "专区id")
    @TableField("zoneId")
    private Long zoneId;

    @TableField("gmtCreated")
    private LocalDateTime gmtCreated;

    @TableField("gmtModify")
    private LocalDateTime gmtModify;

}
