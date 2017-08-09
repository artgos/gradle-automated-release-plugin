package com.mkonline.gradle.release

import org.gradle.api.Project

/**
 * Created by artur on 09.08.2017.
 */
class AutomatedReleaseExtension {

    private Project project
    private Map<String, Object> attributes

    String packagingType;

    AutomatedReleaseExtension(Project project, Map<String, Object> attributes) {
        this.attributes = attributes
        this.project = project
        ExpandoMetaClass mc = new ExpandoMetaClass(ReleaseExtension, false, true)
        mc.initialize()
        metaClass = mc
    }
}
