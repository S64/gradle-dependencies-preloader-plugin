package jp.s64.gradle.dependenciespreloader;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class PreloadDependenciesTask extends DefaultTask {

    static final String TASK_NAME = "preloadDependencies";

    @TaskAction
    public void run() {
        getProject().allprojects(project -> {
            project.getConfigurations().forEach(configuration -> {
                if (configuration.isCanBeResolved()) {
                    configuration.resolve();
                } else {
                    dbg(configuration.getName() + "is not can be resolved");
                }
            });
        });
        msg("All configurations already loaded.");
    }

    private static void msg(String msg) {
        System.out.println(msg);
    }

    private void dbg(String msg) {
        getLogger().debug(msg);
    }

}
