node {
   def final slackChannel = "#tms-alerts-nonprod"
   def final slackSuccessColor = "#00FF00"
   def final slackFailColor = "#FF0000"
   checkout scm;
   try {
      stage('Build and Deploy') {
         sh "mvn clean deploy"
         slackSend(color: slackSuccessColor, channel: slackChannel, message: "Shared JPA framework (QA team) build success (branch=${env.BRANCH_NAME})")
      }
   } catch (e) {
      slackSend(color: slackFailColor, channel: slackChannel, message: "Shared JPA framework (QA team) build failed (branch=${env.BRANCH_NAME})");
      throw e
   }
}