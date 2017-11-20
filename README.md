Configuration:
$git config --global user.email "you@examlpe.com"
$git config --global user.name "Your user name"



1. To download the whole project:
$git clone <repositoryLink>

2. To create a new local repository:
Go to the wanted directory: cd C:\Users\Nicu\Desktop\tutorial3>
$git init

3. To link the local repository with the remote repository:
$git remote add origin <repositoryLink>

4.To add new files to the project:
$git add <filname>
for all the files:
$git add .

5.Commit the changes
$git commit -m"changesMessage"

6.Check the status:
$git status

7.Upload the code:
$git push origin <branchName>
master branch case:
$git push origin master

8.To download the project changes from master branch
$git pull origin master

9.Check which branch we are currently on:
$git branch

10.Create a new branch localy and move the workflow on that branch
$git checkout -b <branchName>

11.Switch to other branch
$git checkout <branchName>

12. Merge branches from the master branch:
$git merge <otherBranchName>


13.Steps for merging branches:
$git checkout master
$git pull origin master
$git merge origin <branch>
$git push origin master

14.Steps to update the code:
$git pull origin <branch>
$git add .
$git commit -m"msg"
$git push origin <branch>

15.Steps to setup the repository
$cd <localProjectDirectory>
$git clone <repositoryLink>
