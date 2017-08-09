package com.mkonline.gradle.release

import org.gradle.api.Project

/**
 * Created by artur on 09.08.2017.
 */
class AutomatedReleaseExtension {

    private Project project

    String packagingType;

    AutomatedReleaseExtension(Project project) {
        this.project = project
/*        ExpandoMetaClass mc = new ExpandoMetaClass(AutomatedReleaseExtension, false, true)
        mc.initialize()
        metaClass = mc
        */
    }
}
