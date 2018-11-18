package com.muses.taoshop.item.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *  商品SPU规格类
 * </pre>
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.06.09 21:49    修改内容:
 * </pre>
 */
@Data
public class ItemSpuSpec implements Serializable{
    /**
     * id
     */
    private Long id;
    /**
     * spu id
     */
    private Long spuId;
    /**
     * 规格值id
     */
    private Long specId;

    private Date lastModifyTime;

    private Date createTime;


}