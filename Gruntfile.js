/*global module:false*/

var fs = require('fs');

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'clean-mwp-java-client-cruft': [
        'generated-sources/docs', 
        'generated-sources/gradle', 
        'generated-sources/build.gradle',
        'generated-sources/build.sbt',
        'generated-sources/git_push.sh',
        'generated-sources/gradle.properties',
        'generated-sources/gradlew',
        'generated-sources/gradlew.bat',
        'generated-sources/LICENSE',
        'generated-sources/README.md',
        'generated-sources/settings.gradle',
        'generated-sources/src/test',
        'generated-sources/src/main/AndroidManifest.xml',
        'generated-sources/src/main/java/io',
        'generated-sources/src/main/java/fi/otavanopisto/mwp/auth',
        'generated-sources/src/main/java/fi/otavanopisto/mwp/*.java'
      ]
    },
    'copy': {
      'copy-mwp-rest-client-extras': {
        src: '**',
        dest: 'generated-sources',
        cwd: 'client-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'generate-mwp-java-client': {
        command : 'mv generated-sources/pom.xml generated-sources/pom.xml.before && \
          java -jar swagger-codegen-cli.jar generate \
          -i http://manage.kunta-api.dev/wp-json/apigenerate/swagger \
          -l java \
          --api-package fi.otavanopisto.mwp.client\
          --model-package fi.otavanopisto.mwp.client.model \
          --group-id fi.otavanopisto.mwp.mwp-rest-client \
          --artifact-id mwp-rest-client\
          --artifact-version `mvn -f generated-sources/pom.xml.before -q -Dexec.executable=\'echo\' -Dexec.args=\'${project.version}\' --non-recursive org.codehaus.mojo:exec-maven-plugin:1.3.1:exec` \
          --template-dir templates \
          --library jersey2 \
          --additional-properties dateLibrary=java8-localdatetime \
          -o generated-sources/'
      },
      'install-mwp-java-client': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      },
      'release-mwp-java-client': {
        command : 'mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'shell:generate-mwp-java-client', 'clean:clean-mwp-java-client-cruft', 'copy:copy-mwp-rest-client-extras', 'shell:install-mwp-java-client', 'shell:release-mwp-java-client' ]);
  
};