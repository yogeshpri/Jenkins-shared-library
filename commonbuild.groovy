def call() {
    stage('Checkout') {
        checkout scm
    }

    stage('Unit Tests') {
        echo 'Running unit tests...'
        sh './gradlew test'
    }

    stage('Deploy') {
        echo 'Deploying to environment...'
        // Add your deployment logic here, e.g.:
        sh './deploy.sh'
    }
}
