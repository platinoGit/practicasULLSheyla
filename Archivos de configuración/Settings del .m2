<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.2.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.2.0 http://maven.apache.org/xsd/settings-1.2.0.xsd">
  <profiles>
    <profile>
      <id>redhat-ga-repository</id>
      <repositories>
        <repository>
          <id>redhat-ga-repository</id>
          <name>Red Hat GA repository</name>
          <url>http://maven.repository.redhat.com/ga/</url>
          <releases>
            <enabled>true</enabled>
            <updatePolicy>never</updatePolicy>
          </releases>
          <snapshots>
            <enabled>false</enabled>
            <updatePolicy>daily</updatePolicy>
          </snapshots>
        </repository>
      </repositories>
      <pluginRepositories>
        <pluginRepository>
          <id>redhat-ga-repository</id>
          <name>Red Hat GA repository</name>
          <url>http://maven.repository.redhat.com/ga/</url>
          <releases>
            <enabled>true</enabled>
            <updatePolicy>never</updatePolicy>
          </releases>
          <snapshots>
            <enabled>false</enabled>
            <updatePolicy>daily</updatePolicy>
          </snapshots>
        </pluginRepository>
      </pluginRepositories>
    </profile>
  </profiles>
  <activeProfiles>
    <activeProfile>redhat-ga-repository</activeProfile>
	<activeProfile>jboss-eap-repository</activeProfile>
  </activeProfiles>
</settings>
