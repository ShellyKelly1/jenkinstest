pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                script {
                    if (fileExists('.git')) {
                        echo 'Git repository exists, fetching updates'
                        bat 'git fetch'

                        def changes = bat(script: 'git rev-list HEAD..origin/main --count', returnStdout: true).trim()

                        if (changes == '0') {
                            echo 'No updates found in the repository'
                        } else {
                            echo 'Updates found, pulling changes'
                            bat 'git pull'
                        }
                    } else {
                        echo 'Cloning new repository'
                        git branch: 'main', url: 'https://github.com/ShellyKelly1/jenkinstest.git'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project using Maven'
                bat 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running tests'
                bat 'mvn test'
            }
        }

        stage('Package Artifact') {
            steps {
                echo 'Packaging the application'
                bat 'mvn package'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed'
        }
        success {
            echo 'Build succeeded'
        }
        failure {
            echo 'Build failed'
        }
    }
}
