package com.android.ctgapp.widget.dialog

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.NumberPicker
import android.widget.TextView
import androidx.core.view.get
import androidx.fragment.app.DialogFragment
import com.android.ctgapp.R
import com.android.ctgapp.base.BaseDialogFragment
import com.android.ctgapp.util.handlerNull
import kotlinx.android.synthetic.main.my_datepicker_dialog.*
import java.lang.Exception
import java.lang.reflect.Field
import java.util.*
import kotlin.collections.ArrayList


/**
 *作者:LiBW
 *创建日期: 3/18/21
 *描述:日期选择dialog
 */
class MyDatePickerDialog( private val listener: Callback,year:String,moth:String) : DialogFragment() {
    //private val mViewModel by lazy { ViewModelProvider(this)[SendGoodsViewModel::class.java] }
    //val loading: LoadingDialog by lazy { LoadingDialog(requireActivity()) }
    val year=year.toInt()
    val month=moth.toInt()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view=inflater.inflate(getLayout(), container, false)
        //val datepicker:DatePicker=view.findViewById(R.id.mDatePicker)
        val mPickerMonth:NumberPicker=view.findViewById(R.id.mPickerMonth)
        val mPickerYear:NumberPicker=view.findViewById(R.id.mPickerYear)
        val mConfigBT:TextView=view.findViewById(R.id.mConfigBT)
        val mCancelBT:TextView=view.findViewById(R.id.mCancelBT)

        //datepicker.getCalendarView().get(0).visibility=View.INVISIBLE

        val moths:Array<String> = arrayOf( "1月","2月","3月","4月","5月","6月","7月","8月","9月","10月","11月","12月")
        val years = arrayOfNulls<String>(11)
        mPickerMonth.maxValue=12
        mPickerMonth.minValue=1

        mPickerYear.minValue=year-10
        mPickerYear.maxValue=year

        for(index in 0 until 11){
            years[index]=(year-10+index).handlerNull()+"年"
        }

        mPickerMonth.displayedValues=moths
        mPickerYear.displayedValues=years
        mPickerYear.value=year
        mPickerMonth.value=month
        mConfigBT.setOnClickListener{
            listener.getTime(mPickerYear.value,mPickerMonth.value)
            dismiss()

        }
        mCancelBT.setOnClickListener{
            dismiss()
        }
        return view
    }



    /**
     * 隐藏DatePicker中的日期显示
     *
     * @param mDatePicker
     */
    private fun hidDay(mDatePicker: DatePicker) {
        val datePickerfFields: Array<Field> = mDatePicker.javaClass.declaredFields
        for (datePickerField in datePickerfFields) {
            if ("mDaySpinner" == datePickerField.getName()) {
                datePickerField.setAccessible(true)
                var dayPicker = Any()
                try {
                    dayPicker = datePickerField.get(mDatePicker)

                } catch (e: IllegalAccessException) {
                    e.printStackTrace()
                } catch (e: IllegalArgumentException) {
                    e.printStackTrace()
                }
                // datePicker.getCalendarView().setVisibility(View.GONE);
                (dayPicker as View).visibility = View.GONE
            }
        }
    }
     fun getLayout() = R.layout.my_datepicker_dialog
    interface Callback {
        fun getTime(year:Int,month:Int)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        if(showsDialog){
            setShowsDialog(false)
        }
        super.onActivityCreated(savedInstanceState)
        setShowsDialog(true)
        if(view!=null){
            if(view!!.parent!=null){

            }
            dialog!!.setContentView(view!!)
        }
        if(activity!=null){
            dialog!!.setOwnerActivity(activity!!)
        }
        if(savedInstanceState!=null){
            val dialogState:Bundle= savedInstanceState.getBundle("andriod:savedDialogState")!!
            if(dialogState!=null){
                dialog!!.onRestoreInstanceState(dialogState)
            }
        }
//        if(dialog!=null){
//            try {
//                dialog!!.setOnDismissListener(null)
//                dialog!!.setOnCancelListener(null)
//            }catch (e:Exception){
//                e.printStackTrace()
//            }
//        }

    }
}