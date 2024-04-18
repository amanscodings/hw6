def threeSum(nums):
  nums.sort()  
  result = []  
  length = len(nums)
  for i in range(length - 2): 
      if i > 0 and nums[i] == nums[i - 1]:
          continue
      left, right = i + 1, length - 1  
      while left < right:
          total = nums[i] + nums[left] + nums[right] 
          if total < 0:
              left += 1  
          elif total > 0:
              right -= 1  
          else:
         
              result.append([nums[i], nums[left], nums[right]])
         
              while left < right and nums[left] == nums[left + 1]:
                  left += 1
              while left < right and nums[right] == nums[right - 1]:
                  right -= 1
        
              left += 1
              right -= 1
  return result

print(threeSum([0, 1, 1])) 
print(threeSum([-5, 0, 5, 10, -10, 0]))  