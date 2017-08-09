package com.mkonline.gradle.release

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * Gradle plugin that provides custom tasks for interacting with Docker via its remote API.
 * Gradle plugin that provides custom tasks
 */
class AutomatedReleasePlugin implements Plugin<Project> {

    static final String RELEASE_GROUP = 'Release'

    private AutomatedReleaseExtension extension

    @Override
    void apply(Project project) {
        extension = project.extensions.create('automateRelease', AutomatedReleaseExtension, project)

        project.task('packageAndRelease', description: 'Verify project, release, and update version to next.',
                group: RELEASE_GROUP) doLast this.&verifyVersion
    }

    void verifyVersion() {
        if ('MAVEN'.equals(extension.packagingType)) {
            println '-- RUNNING MAVEN TYPE PKG --'
        } else if ('DOCKER'.equals(extension.packagingType)) {
            println '-- RUNNING DOCKER TYPE PKG --'
        } else {
            println '-- RUNNING NONE TYPE PKG --'
        }
    }

}