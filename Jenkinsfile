@Library('my-shared-library') _
import org.foo.scm.*
node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '2', numToKeepStr: '2'))])
   var {
       GIT_URL = 'https://github.com/safiur/test-env.git'
       BRANCH_NAME = 'master'
       GOAL1 = 'clean'
       GOAL2 = 'test'
       GOAL3 = 'package' 
      }
  
} 
