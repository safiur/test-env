@Library('my-shared-library') _
import org.foo.scm.*
node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '2', numToKeepStr: '2'))])
   simple {
       scmUrl = 'https://github.com/safiur/test-env.git'
       branch = 'master'
      }
  
} 
