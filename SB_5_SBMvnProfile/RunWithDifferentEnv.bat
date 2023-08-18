cd target

::test env
java -jar SB_4_MultiEnvConfigs-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
::prodution env
::java -jar SB_4_MultiEnvConfigs-0.0.1-SNAPSHOT.jar --spring.profiles.active=pro