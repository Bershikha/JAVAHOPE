class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l = -1;
        int g = 0;
        int tank = 0;
        int total = 0;  // total balance check

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];

            tank += diff;
            total += diff;

            // if tank becomes negative, reset start
            if (tank < 0) {
                g = i + 1;
                tank = 0;
            }
        }

        // if total gas < total cost → impossible
        if (total < 0) return -1;

        return g;
    }
}
