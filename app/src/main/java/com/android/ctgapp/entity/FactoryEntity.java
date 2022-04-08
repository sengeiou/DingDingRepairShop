package com.android.ctgapp.entity;

import java.util.List;

public class FactoryEntity {


    /**
     * status : 0
     * msg : null
     * data : [{"id":106,"carFactory":"东风日产","alpha":"D","createTime":"2020-09-22T16:27:57","updateTime":null},{"id":180,"carFactory":"东风英菲尼迪","alpha":"D","createTime":"2020-09-22T16:27:57","updateTime":null},{"id":181,"carFactory":"英菲尼迪(进口)","alpha":"Y","createTime":"2020-09-22T16:27:57","updateTime":null},{"id":215,"carFactory":"郑州日产","alpha":"Z","createTime":"2020-09-22T16:27:57","updateTime":null},{"id":231,"carFactory":"日产(进口)","alpha":"R","createTime":"2020-09-22T16:27:57","updateTime":null}]
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
         * id : 106
         * carFactory : 东风日产
         * alpha : D
         * createTime : 2020-09-22T16:27:57
         * updateTime : null
         */

        private int id;
        private String carFactory;
        private String alpha;
        private String createTime;
        private Object updateTime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCarFactory() {
            return carFactory;
        }

        public void setCarFactory(String carFactory) {
            this.carFactory = carFactory;
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
