class Solution {
public int[] twoSum(int[] nums, int target)
{
int n= nums.length;
int h=0;
int sum[]=new int[2];
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
int d= nums[i]+nums[j];
if(d==target)
{
sum[h]=i;
h++;
sum[h]=j;
}
}
}
return sum;
}
}