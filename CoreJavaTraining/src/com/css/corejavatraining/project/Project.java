package com.css.corejavatraining.project;

public class Project {
		private int projectId;
		private String projectName;
		private String projectHead; 
		private int noOfResources;
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getProjectHead() {
			return projectHead;
		}
		public void setProjectHead(String projectHead) {
			this.projectHead = projectHead;
		}
		public int getNoOfResources() {
			return noOfResources;
		}
		public void setNoOfResources(int noOfResources) {
			this.noOfResources = noOfResources;
		}
		public Project(int projectId, String projectName, String projectHead, int noOfResources) {
			super();
			this.projectId = projectId;
			this.projectName = projectName;
			this.projectHead = projectHead;
			this.noOfResources = noOfResources;
		}
		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
					+ ", noOfResources=" + noOfResources + "]";
		}
		public static void main(String[] args)
		{
			Project project = new Project();
			project.setProjectId(101);
			project.setProjectName("Java App");
			project.setProjectHead("Project Manager abc");
			project.setNoOfResources(7);
			System.out.println(project);
			
			
			project.setProjectId(102);
			project.setProjectName("Java Web");
			project.setProjectHead("Project Manager abcd");
			project.setNoOfResources(4);
			System.out.println(project);
		}

}

	

