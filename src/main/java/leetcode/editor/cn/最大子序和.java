package leetcode.editor.cn;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 2941 👎 0

public class 最大子序和{
	public static void main(String[] args) {
		Solution solution = new 最大子序和().new Solution();
		int[] array = {-2,-3,-1};
		System.out.println(solution.maxSubArray(array));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j <= nums.length; j++) {
				for (int k = i; k < j; k++) {
					temp = temp + nums[k];
				}
				if (temp > max ){
					max = temp;
				}
				temp = 0;
			}
		}
		return max;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
