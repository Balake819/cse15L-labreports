# Lab Report 3 <br/>
February 7, 2024 <br/>
Bugs and Commands: <br/>

With the Array Tests Lab from last week, we were tasked to find the Symptoms and Failure-Inducing Inputs within the ArrayExamples class. <br/>

The initial code that we were given for ArrayExamples was:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

---

This code contains several bugs, and it is prevelent when we run the testers.
```
  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }
```
The Test above produced an failure with the input, `{1,2,3}`. This is because the initial code(displayed above) overwrites the elements in the list and then copies the new elements from the overwritten
ones, producing an output of `{3,2,3}`.
