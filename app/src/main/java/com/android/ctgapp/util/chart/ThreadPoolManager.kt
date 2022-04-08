package com.android.ctgapp.util.chart

import java.util.concurrent.Executors
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

/**
 *作者:LiBW
 *创建日期: 2/9/21
 *描述: 线程池
 */
object ThreadPoolManager  {

    private val executor: ThreadPoolExecutor
    /**
     * 添加任务
     */
    fun execute(runnable: Runnable?) {
        runnable?.let {
            executor.execute(it)
        }
    }

    /**
     * 移除任务
     */
    fun remove(runnable: Runnable?) {
        runnable?.let {
            executor.remove(it)
        }
    }

    init {
        //获取处理器核心数*2+1 作为线程池的线程数量
        val  corePoolSize = Runtime.getRuntime().availableProcessors() * 2 + 1
        //非核心线程空闲时间等待1小时
        val keepAliveTime = 1
        val unit = TimeUnit.HOURS
        executor = ThreadPoolExecutor(
            corePoolSize,
            corePoolSize,
            keepAliveTime.toLong(),
            unit,
            LinkedBlockingQueue(),
            Executors.defaultThreadFactory(),
            ThreadPoolExecutor.AbortPolicy()
        )
    }
}