package org.jenkinsci.plugins.dtkit.types.violation;

import org.jenkinsci.lib.dtkit.model.InputMetricXSL;
import org.jenkinsci.lib.dtkit.model.InputType;
import org.jenkinsci.lib.dtkit.model.OutputMetric;
import org.jenkinsci.plugins.dtkit.types.CustomInputMetric;

import java.io.File;

/**
 * @author Gregory Boissinot
 */
public class CustomViolationInputMetric extends InputMetricXSL implements CustomInputMetric {

    private File customXSLFile;

    @Override
    public void setCustomXSLFile(File customXSLFile) {
        this.customXSLFile = customXSLFile;
    }

    @Override
    public InputType getToolType() {
        return InputType.VIOLATION;
    }

    @Override
    public String getToolVersion() {
        return null;
    }

    @Override
    public String getToolName() {
        return "Custom Tool";
    }

    @Override
    public File getXslFile() {
        return customXSLFile;
    }

    @Override
    public Class getXslResourceClass() {
        return null;
    }

    @Override
    public String getXslName() {
        return null;
    }

    @Override
    public String[] getInputXsdNameList() {
        return null;
    }

    @Override
    public OutputMetric getOutputFormatType() {
        return null;
    }
}
