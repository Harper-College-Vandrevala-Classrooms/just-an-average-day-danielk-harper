package com.csc;

import java.util.*;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("This class can house your driver program and / or your functions.");
  }
  
  public int maximumUsingForLoop(int[] nums) {
    int max = nums[0];
    for(int i = 1; i < nums.length; i++) {
      if (max < nums[i]) max = nums[i];
    }
    
    return max;
  }
  
  public int minimumUsingForLoop(int[] nums) {
    int min = nums[0];
    for(int i = 1; i < nums.length; i++) {
      if (min < nums[i]) min = nums[i];
    }
    
    return min;
  }
  public int sumUsingForLoop(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    
    return sum;
  }
  public double averageUsingForLoop(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    
    return ((double)sum) / ((double)nums.length);
  }

  private int minmax(int a, int b, boolean should_min) {
    if (should_min) {
      if (a > b) return b;
      return a;
    }
    if (a > b) return a;
    return b;
  }
  
  public int maximumUsingStream(int[] nums) {
    return Arrays.stream(nums).reduce((x, y) -> minmax(x, y, false)).orElse(0);
  }
  public int minimumUsingStream(int[] nums) {
    return Arrays.stream(nums).reduce((x, y) -> minmax(x, y, true)).orElse(0);
  }
  public int sumUsingStream(int[] nums) {
    return Arrays.stream(nums).sum();

  }
  
  public double averageUsingStream(int[] nums) {
    return Arrays.stream(nums).reduce((x, y) -> x + y).orElse(0) / ((double)nums.length);
  }
}
