#!groovy
@Library('PKJEE_lib@master') _
node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '2', numToKeepStr: '2'))])
    rubyPipeline_prod {
        GIT_URL                 = 'https://del.tools.publicis.sapient.com/bitbucket/scm/fcaab/fcg-rails-fiat.com.au.git'
        BITBUCKET_NOTIFY_URL    = 'https://del.tools.publicis.sapient.com/bitbucket/rest/build-status/1.0/commits'
        GIT_CREDENTIALS         = 'Git-Credentials'
        REPORT_DIRECTORY        = 'reports'
        RUBY_REPORT_FILE        = 'index.html'
        RUBY_REPORT_TITLE       = 'SANDI METER REPORT'
        RUBOCOP_REPORT_FILE     = 'rubocop.html'
        RUBOCOP_REPORT_TITLE    = 'RUBOCOP ANALYSIS REPORT'
        BRAKEMAN_REPORT_FILE    = 'brakeman.html'
        BRAKEMAN_REPORT_TITLE   = 'BRAKEMAN SECURITY REPORT'
        RSPEC_REPORT_FILE       = 'rspec.html'
        RSPEC_REPORT_TITLE      = 'RSPEC TEST REPORT'
        RUBYCRITIC_REPORT_TITLE = 'RUBYCRITIC ANALYSIS REPORT'
        RUBYCRITIC_REPORT_FILE  = 'overview.html'
        RECIPIENT               = 'richard.thompson@digitaslbi.com, barry.edwards@digitaslbi.com, stephen.smithstone@digitaslbi.com'
        EMAIL_TEMPLATE          = 'email_template'
        SKIP_UNIT_TEST          = 'yes'
        DEPLOYMENT_PACKAGE_DIRECTORY = '/app/artifacts'
        DEPLOYMENT_SCRIPT            = '/app/scripts/fca_deploy.sh'
        BRAND_NAME                   = 'FIAT'
        BUILD_PACKAGE_DIRECTORY      = '/app/fca/ci/jenkins/build_packages'
        LINUX_USER                   = 'fcadmin'
    }
}

