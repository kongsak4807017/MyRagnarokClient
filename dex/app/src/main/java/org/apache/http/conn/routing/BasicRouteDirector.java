package org.apache.http.conn.routing;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicRouteDirector implements HttpRouteDirector {
    @Override // org.apache.http.conn.routing.HttpRouteDirector
    public int nextStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        Args.notNull(routeInfo, "Planned route");
        if (routeInfo2 == null || routeInfo2.getHopCount() <= 0) {
            return firstStep(routeInfo);
        }
        if (routeInfo.getHopCount() > 1) {
            return proxiedStep(routeInfo, routeInfo2);
        }
        return directStep(routeInfo, routeInfo2);
    }

    protected int firstStep(RouteInfo routeInfo) {
        return routeInfo.getHopCount() > 1 ? 2 : 1;
    }

    protected int directStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        if (routeInfo2.getHopCount() > 1 || !routeInfo.getTargetHost().equals(routeInfo2.getTargetHost()) || routeInfo.isSecure() != routeInfo2.isSecure()) {
            return -1;
        }
        if (routeInfo.getLocalAddress() != null && !routeInfo.getLocalAddress().equals(routeInfo2.getLocalAddress())) {
            return -1;
        }
        return 0;
    }

    protected int proxiedStep(RouteInfo routeInfo, RouteInfo routeInfo2) {
        int hopCount;
        int hopCount2;
        if (routeInfo2.getHopCount() <= 1 || !routeInfo.getTargetHost().equals(routeInfo2.getTargetHost()) || (hopCount = routeInfo.getHopCount()) < (hopCount2 = routeInfo2.getHopCount())) {
            return -1;
        }
        for (int i = 0; i < hopCount2 - 1; i++) {
            if (!routeInfo.getHopTarget(i).equals(routeInfo2.getHopTarget(i))) {
                return -1;
            }
        }
        if (hopCount > hopCount2) {
            return 4;
        }
        if (routeInfo2.isTunnelled() && !routeInfo.isTunnelled()) {
            return -1;
        }
        if (routeInfo2.isLayered() && !routeInfo.isLayered()) {
            return -1;
        }
        if (routeInfo.isTunnelled() && !routeInfo2.isTunnelled()) {
            return 3;
        }
        if (routeInfo.isLayered() && !routeInfo2.isLayered()) {
            return 5;
        }
        if (routeInfo.isSecure() != routeInfo2.isSecure()) {
            return -1;
        }
        return 0;
    }
}
