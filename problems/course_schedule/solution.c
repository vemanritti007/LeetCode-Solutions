#define MAX 2000

bool canFinish(int numCourses, int** prerequisites, int prerequisitesSize, int* prerequisitesColSize) {
    int indegree[MAX] = {0};
    int adj[MAX][MAX] = {0};
    for (int i = 0; i < prerequisitesSize; i++) {
        int a = prerequisites[i][0];
        int b = prerequisites[i][1];
        if (adj[b][a] == 0) {
            adj[b][a] = 1;
            indegree[a]++;
        }
    }
    int queue[MAX];
    int front = 0, rear = -1;
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) {
            queue[++rear] = i;
        }
    }

    int count = 0;
    while (front <= rear) {
        int node = queue[front++];
        count++;

        for (int i = 0; i < numCourses; i++) {
            if (adj[node][i] == 1) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    queue[++rear] = i;
                }
            }
        }
    }
    return count == numCourses;
}