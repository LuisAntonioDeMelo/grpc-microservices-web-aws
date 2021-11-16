

#Run deploy aplication

mvn install:install-file -Dfile=C:\dev\proto-1.0.jar -DgroupId=com.proto -DartifactId=proto -Dversion=1.0  -Dpackaging=jar

mvn install:install-file -Dfile=C:\dev\proto-1.0.jar -DgroupId=com.google.code -DartifactId=proto -Dversion=1.0 -Dpackaging=jar