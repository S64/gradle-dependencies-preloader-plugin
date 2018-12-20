package jp.s64.gradle.dependenciespreloader;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class DependenciesPreloaderPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getTasks().create(
                PreloadDependenciesTask.TASK_NAME,
                PreloadDependenciesTask.class
        );
    }

}
