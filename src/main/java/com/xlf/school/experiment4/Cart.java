package com.xlf.school.experiment4;

import com.xlf.school.experiment4.bean.Goods;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 购物车类
 * <p>
 * 用于存储用户购物车信息
 *
 * @author xiao_lfeng
 * @version v1.0.0
 * @since v1.0.0
 */
public class Cart implements Serializable {
    private static final long serialVersionUID = 44256950914898900L;
    private ArrayList<Goods> goodslist = new ArrayList<>();

    public ArrayList<Goods> getGoodslist() {
        return goodslist;
    }

    public void setGoodslist(ArrayList<Goods> goodslist) {
        this.goodslist = goodslist;
    }

    public int getGcount() {
        int count = 0;
        for (Goods g : goodslist) {
            count += g.getGcount();
        }
        return count;
    }

    public double getTotal() {
        double sum = 0;
        for (Goods g : goodslist) {
            sum += g.getGprice() * g.getGcount();
        }
        return sum;
    }

    public int check(int gid) {
        for (int i = 0; i < goodslist.size(); i++) {
            if (goodslist.get(i).getGid() == gid) {
                return i;
            }
        }
        return -1;
    }

    public void addGoods(Goods goods) {
        int index = check(goods.getGid());
        if (index == -1) {
            goodslist.add(goods);
        } else {
            Goods g = goodslist.get(index);
            g.setGcount(g.getGcount() + goods.getGcount());
        }
    }

    public void removeItem(int gid) {
        goodslist.removeIf(goods -> goods.getGid() == gid);
    }
}
