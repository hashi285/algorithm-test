#include <iostream>
using namespace std;


int main(void)
{
	ios_base::sync_with_stdio(false); cin.tie(NULL);
	int a, b, c, d, e, cnt = 0;
	cin >> a >> b >> c >> d >> e;
	if (a - 1000 <= b) cnt++;
	if (a - 1000 <= c) cnt++;
	if (a - 1000 <= d) cnt++;
	if (a - 1000 <= e) cnt++;
	cout << cnt;
}