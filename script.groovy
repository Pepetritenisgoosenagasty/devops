def buildApp() {
    echo 'building the application...'
    echo "building version ${NEW_VERSION}"
               
}

def deployApp() {
    echo 'deploying the application...'
    echo "deploying the version ${params.VERSION}"
    echo "deploying with ${SERVER_CREDENTIALS}"
}

def testApp(){
    echo 'testing the application...'
}

return this