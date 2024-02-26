# Lab Report 3 <br/>
February 7, 2024 <br/>
Command Lin Usage: <br/>

Speedrunning GitHub forks:

Keys Pressed: `ssh<space>blnewhouse@ieng6-201.ucsd.edu<enter>` <br/>
First I logged onto my ieng6 machine using `ssh blnewhouse@ieng6-201.ucsd.edu`.  <br/>

Keys Pressed: `git<space>clone<ctrl>c<enter>` <br/>
After that, I used `git clone` to create a clone of the GitHub repository from the lab, using an argument of `git@github.com:blakenewhouse/lab7again.git` that I copy pasted from GitHub. <br/>

Once we have the clones repository, we need to enter the directory and run the program. <br/>
Keys Pressed: `ls<enter> cd<space>la<tab><enter> ls<enter> bash<space>test.sh<enter>` <br/>

This is not one of the steps, but for some reason the bash file I had contained an error, so I used vim to fix it.
Keys Pressed: `vim<space>test.sh<enter> <down>89li<delete><delete><delete><delete><esc>ATests<esc>:wq<enter>`

Now, we need to use `vim` to go and edit the code in the command line.
Keys Pressed: `vim<space>List<tab>.java<enter> 42j12li<delete>2<esc>:wq<enter>`

Now, we can run the tests and see that they all pass.
Keys Pressed: `bash<space>test.sh`
