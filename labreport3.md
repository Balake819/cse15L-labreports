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
This code contains several bugs, and it is prevelent when we run the testers.

---

```
@Test
public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
}
```
The test above produced an failure with the input, `{1,2,3}`. This is because the initial code(displayed above) overwrites the elements in the list and then copies the new elements from the overwritten
ones.

---

```
@Test
public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
}
```
This test does not produce a falure because the input is an array with no elements, so the reveresed list is the same as the originial. The output will simply just be `{}`.

---

![Failed Tests](./Screenshots/FailureInducingTests.png) <br/>

This is what gets returned when the tests are run, producing one successful test and one failed test.

---

Finally, this is the completed code that passes both tests without errors:

```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
        newArray[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i += 1) {
        arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
}
```
In the code above, we changed the reversed method so that we make a copy of the original list, and reverse the elements from the copy onto the original list, and then return that reversed original list. This fixes the issue of using the overwritten list because it takes a copy of it and doesn't change that copy.

---

The command `less` is a command which will display the entire contents of a file on a seperate page, and it allows you to scroll though as if you were reading from a website. <br/>

```
less -N 1471-2431-2-1.txt
```
One option for a command line argument is `-N`, which will add line numbers onto the side of the file. This is extremely useful when using many other commands because it allows you to figure out which line you specifically need for other commands or methods. Output below:
```
      1 
      2   
      3     
      4       
      5         Background
      6         Extensive bone marrow infiltration with cancer cells and
      7         anticancer therapy lead to immune incompetence in children
      8         with cancer [ 1 2 ] . Since the prognosis and overall
      9         survival of children with cancer have dramatically improved
     10         during past 30 years [ 3 ] , problems remain related to
     11         infections, mainly during leukopenic periods [ 3 4 5 ] .
     12         Causal pathogens of febrile neutropenia (FN), most
     13         frequently bacterial or fungal, are identified and
     14         confirmed by culture in 25-35% of the cases [ 3 6 ] . In
     15         other 15-25% of patients with FN, bacterial or fungal
     16         pathogens are suspected clinically. The remaining 50% of
     17         cases are classified as a fever of unknown origin (FUO) and
     18         may be caused by other pathogens, namely viruses, that are
     19         more difficult to detect by conventional diagnostic methods
     20         [ 7 8 9 ] .
     21         Lymphotropic herpesviruses (LH) Epstein-Barr virus
     22         (EBV), cytomegalovirus (CMV) and human herpesvirus-6
     23         (HHV-6) establish a lifelong persistent infection in a
     24         great majority of humans. They usually produce inaparent
     25         infection or transient immune compromise in otherwise
     26         healthy hosts but are able to cause life-threatening
     27         primary or reactivated infections in individuals with
```
