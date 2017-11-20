Configuration:\n
$git config --global user.email "you@examlpe.com"\n
$git config --global user.name "Your user name"\n
\n
\n
\n
1. To download the whole project:\n
$git clone <repositoryLink>\n
\n
2. To create a new local repository:\n
Go to the wanted directory: cd C:\Users\Nicu\Desktop\tutorial3>\n
$git init\n
\n
3. To link the local repository with the remote repository:\n
$git remote add origin <repositoryLink>\n
\n
4.To add new files to the project:\n
$git add <filname>\n
for all the files:\n
$git add .\n
\n
5.Commit the changes\n
$git commit -m"changesMessage"\n
\n
6.Check the status:\n
$git status\n
\n
7.Upload the code:\n
$git push origin <branchName>\n
master branch case:\n
$git push origin master\n
\n
8.To download the project changes from master branch\n
$git pull origin master\n
\n
9.Check which branch we are currently on:\n
$git branch\n
\n
10.Create a new branch localy and move the workflow on that branch\n
$git checkout -b <branchName>\n
\n
11.Switch to other branch\n
$git checkout <branchName>\n
\n
12. Merge branches from the master branch:\n
$git merge <otherBranchName>\n
\n
\n
13.Steps for merging branches:\n
$git checkout master\n
$git pull origin master\n
$git merge origin <branch>\n
$git push origin master\n
\n
14.Steps to update the code:\n
$git pull origin <branch>\n
$git add .\n
$git commit -m"msg"\n
$git push origin <branch>\n
\n
15.Steps to setup the repository\n
$cd <localProjectDirectory>\n
$git clone <repositoryLink>\n
