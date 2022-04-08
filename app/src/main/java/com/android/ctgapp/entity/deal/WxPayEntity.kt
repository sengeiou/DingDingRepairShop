package com.android.ctgapp.entity.deal

import com.google.gson.annotations.SerializedName

class WxPayEntity {
    /**
     * package : Sign=WXPay
     * appid : wx635283d6cec45ac9
     * sign : E4C632806E19C0C9C68EAC6ED726E884
     * partnerid : 1545788671
     * prepayid : wx3011025834816368bd5942c15749f00000
     * noncestr : 1606705378399
     * timestamp : 1606705378
     */
    @SerializedName("package")
    var packageX: String? = null
    var appid: String? = null
    var sign: String? = null
    var partnerid: String? = null
    var prepayid: String? = null
    var noncestr: String? = null
    var timestamp: String? = null
}