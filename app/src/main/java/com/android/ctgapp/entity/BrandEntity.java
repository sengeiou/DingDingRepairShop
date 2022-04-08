package com.android.ctgapp.entity;

import java.util.List;

public class BrandEntity {


    /**
     * status : 0
     * msg : null
     * data : [{"id":143,"carBrand":"日产","carFaction":"日系","alpha":"R","createTime":"2020-09-22T16:27:53","updateTime":null},{"id":173,"carBrand":"英菲尼迪","carFaction":"日系","alpha":"Y","createTime":"2020-09-22T16:27:53","updateTime":null}]
     */

    private int status;
    private Object msg;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 143
         * carBrand : 日产
         * carFaction : 日系
         * alpha : R
         * createTime : 2020-09-22T16:27:53
         * updateTime : null
         */

        private int id;
        private String carBrand;
        private String carFaction;
        private String alpha;
        private String createTime;
        private Object updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCarBrand() {
            return carBrand;
        }

        public void setCarBrand(String carBrand) {
            this.carBrand = carBrand;
        }

        public String getCarFaction() {
            return carFaction;
        }

        public void setCarFaction(String carFaction) {
            this.carFaction = carFaction;
        }

        public String getAlpha() {
            return alpha;
        }

        public void setAlpha(String alpha) {
            this.alpha = alpha;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }
    }
}
