# Lab Report 5 <br/>
March 10, 2024 <br/>
Debugging and Reflection: <br/>

---

Student post: <br/>
"I am trying to make a method that takes the square of a number and returns it. However, my code wont compile. Why is that?"
![codeWontRun](./Screenshots/infiniteLoop)
![executionOfCode](./Screenshots/infiniteLoopTerminal)

TA response: <br/>
"Looking at your code, I see that you are using a while loop to square the number. Check to make sure that you are correctly updating the `count variable` in order to stop the `while` loop."

Student Corrections: <br/>
![fixedLoop](./Screenshots/infiniteLoop)
![fixedLoopTerminal](./Screenshots/infiniteLoop)

Contents:

The file, `square.java`, contained the following code before we fixed the bug:

```
public class square {

  private int endPoint;
  private int result;
  private int count;

  public square(int endPoint) {
    this.endPoint = endPoint;
  }

  public int counter(int end) {
    while(this.count < end) {
      this.result += end;
      endPoint += 1; 
    }
    return this.result;
  }

  public static void main(String[] args) {
    square sq = new square(Integer.parseInt(args[0]));
    String output = "The square is " + sq.counter(Integer.parseInt(args[0]));
    System.out.println(output);
  }

}
```

The only line changed was line 14, which was changed to:

```
count += 1; //fixed this variable to count
```

The two commands used for this were:

```
javac square.java
java square 2
```

and they were stored in the bash file, `bash.sh`:

```
javac square.java
java square 2
```

To fix the bug, all you needed to do was correct the variable getting counted in order to prevent an infinite loop. <br/>

This quarter, I learned so many different things from 15L that it is hard to count. Some of the most useful things were the command line arguments, such as vim, and the ability to use bash files. The jdb, jave debugger, was really interesting to learn but wa difficult to understand/felt clunky at times. However, this was extremely useful and I will probably try to use in the future. I use bash in every one of my cse 12 assignments, and am glad to have learned it and be able to save myself time.




