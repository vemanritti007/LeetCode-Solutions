#define MOD 1000000007
#define MAXN 200005

int peopleAwareOfSecret(int n, int delay, int forget) 
{
    long long learns[MAXN] = {0};

    long long sharing = 0, result = 0;
    learns[1] = 1;

    for (int d = 2; d <= n; d++)
    {
        // people start sharing
        if (d - delay >= 1)
        {
            sharing = (sharing + learns[d - delay]) % MOD;
        }

        // people forget
        if (d - forget >= 1)
        {
            sharing = (sharing - learns[d - forget] + MOD) % MOD;
        }

        learns[d] = sharing;
    }

    // count people who still remember
    for (int d = n - forget + 1; d <= n; d++)
    {
        if (d >= 1)
            result = (result + learns[d]) % MOD;
    }

    return (int)result;
}
