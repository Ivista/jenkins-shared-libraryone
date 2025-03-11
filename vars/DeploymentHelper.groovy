package com.example

class DeploymentHelper implements Serializable {
    def steps

    DeploymentHelper(steps) {
        this.steps = steps
    }

    def notifyDeployment(String message) {
        steps.echo "Notification: ${message}"
    }
}
