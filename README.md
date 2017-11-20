Configuration:	<br />
$git config --global user.email "you@examlpe.com"	<br />
$git config --global user.name "Your user name"	<br />
<br />
<br />
<br />
1. To download the whole project:<br />
$git clone <repositoryLink><br />
<br />
2. To create a new local repository:<br />
Go to the wanted directory: cd C:\Users\Nicu\Desktop\tutorial3><br />
$git init<br />
<br />
3. To link the local repository with the remote repository:<br />
$git remote add origin <repositoryLink><br />
<br />
4.To add new files to the project:<br />
$git add <filname><br />
for all the files:<br />
$git add .<br />
<br />
5.Commit the changes<br />
$git commit -m"changesMessage"<br />
<br />
6.Check the status:<br />
$git status<br />
<br />
7.Upload the code:<br />
$git push origin <branchName><br />
master branch case:<br />
$git push origin master<br />
<br />
8.To download the project changes from master branch<br />
$git pull origin master<br />
<br />
9.Check which branch we are currently on:<br />
$git branch<br />
<br />
10.Create a new branch localy and move the workflow on that branch<br />
$git checkout -b <branchName><br />
<br />
11.Switch to other branch<br />
$git checkout <branchName><br />
<br />
12. Merge branches from the master branch:<br />
$git merge <otherBranchName><br />
<br />
<br />
13.Steps for merging branches:<br />
$git checkout master<br />
$git pull origin master<br />
$git merge origin <branch><br />
$git push origin master<br />
<br />
14.Steps to update the code:<br />
$git pull origin <branch><br />
$git add .<br />
$git commit -m"msg"<br />
$git push origin <branch><br />

15.Steps to setup the repository<br />
$cd <localProjectDirectory><br />
$git clone <repositoryLink><br />