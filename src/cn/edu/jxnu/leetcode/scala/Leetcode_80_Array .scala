package cn.edu.jxnu.leetcode.scala

/**
  * 删除排序数组中的重复项 II
  *
  * @author 梦境迷离
  * @time 2018年7月16日
  */
object Leetcode_80_Array {

    def removeDuplicates(nums: Array[Int]): Int = {
        var i = 0
        for (n <- nums) {
            if (i < 2 || n > nums(i - 2)) {
                nums(i) = n
                i += 1
            }
        }
        i
    }
}