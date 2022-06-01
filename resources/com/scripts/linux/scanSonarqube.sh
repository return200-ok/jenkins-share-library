# /opt/sonar-scanner/bin/sonar-scanner " +
#         "-Dsonar.projectName=${env.SONAR_QUBE_PROJECT_KEY} " +
#         "-Dsonar.projectKey=${env.SONAR_QUBE_PROJECT_KEY} " +
#         "-Dsonar.java.binaries=. " +
#         "-Dsonar.sources=./ " +
#         "-Dsonar.inclusions=**/*.java,**/*.cs " +
#         "-Dsonar.exclusions=**/res/**,**/target/**,**/build/**,**/share/**,**.html*,*/.settings/**,**/.mvn/**"
#b8308ae45827ac5ff6a775f5b91ce603f52d27c0

mvn clean verify sonar:sonar \
  -Dsonar.projectKey=$1 \
  -Dsonar.host.url=$2 \
  -Dsonar.login=$3