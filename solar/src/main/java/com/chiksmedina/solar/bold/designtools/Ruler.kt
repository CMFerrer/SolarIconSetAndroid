package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

public val DesignToolsGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.6157f)
                curveTo(2.0f, 16.463f, 2.6818f, 17.1448f, 4.0454f, 18.5083f)
                lineTo(5.4917f, 19.9546f)
                curveTo(6.8552f, 21.3182f, 7.537f, 22.0f, 8.3843f, 22.0f)
                curveTo(9.2315f, 22.0f, 9.9133f, 21.3182f, 11.2769f, 19.9546f)
                lineTo(19.9546f, 11.2769f)
                curveTo(21.3182f, 9.9133f, 22.0f, 9.2315f, 22.0f, 8.3843f)
                curveTo(22.0f, 7.537f, 21.3182f, 6.8552f, 19.9546f, 5.4917f)
                lineTo(18.5083f, 4.0454f)
                curveTo(17.1448f, 2.6818f, 16.463f, 2.0f, 15.6157f, 2.0f)
                curveTo(14.8623f, 2.0f, 14.2396f, 2.5393f, 13.1519f, 3.6178f)
                curveTo(13.1817f, 3.6398f, 13.2103f, 3.6643f, 13.2373f, 3.6913f)
                lineTo(14.6515f, 5.1056f)
                curveTo(14.9444f, 5.3985f, 14.9444f, 5.8733f, 14.6515f, 6.1662f)
                curveTo(14.3586f, 6.4591f, 13.8837f, 6.4591f, 13.5908f, 6.1662f)
                lineTo(12.1766f, 4.752f)
                curveTo(12.1494f, 4.7248f, 12.1247f, 4.696f, 12.1026f, 4.6659f)
                lineTo(11.0299f, 5.7386f)
                curveTo(11.06f, 5.7608f, 11.0888f, 5.7854f, 11.116f, 5.8127f)
                lineTo(13.2373f, 7.934f)
                curveTo(13.5302f, 8.2269f, 13.5302f, 8.7018f, 13.2373f, 8.9946f)
                curveTo(12.9444f, 9.2875f, 12.4695f, 9.2875f, 12.1766f, 8.9946f)
                lineTo(10.0553f, 6.8733f)
                curveTo(10.0281f, 6.8461f, 10.0034f, 6.8173f, 9.9812f, 6.7873f)
                lineTo(8.9086f, 7.8599f)
                curveTo(8.9387f, 7.8821f, 8.9674f, 7.9068f, 8.9946f, 7.934f)
                lineTo(10.4089f, 9.3482f)
                curveTo(10.7018f, 9.6411f, 10.7018f, 10.116f, 10.4089f, 10.4089f)
                curveTo(10.116f, 10.7018f, 9.6411f, 10.7018f, 9.3482f, 10.4089f)
                lineTo(7.934f, 8.9946f)
                curveTo(7.9068f, 8.9674f, 7.8821f, 8.9387f, 7.8599f, 8.9086f)
                lineTo(6.7873f, 9.9812f)
                curveTo(6.8173f, 10.0034f, 6.8461f, 10.0281f, 6.8733f, 10.0553f)
                lineTo(8.9946f, 12.1766f)
                curveTo(9.2875f, 12.4695f, 9.2875f, 12.9444f, 8.9946f, 13.2373f)
                curveTo(8.7018f, 13.5302f, 8.2269f, 13.5302f, 7.934f, 13.2373f)
                lineTo(5.8127f, 11.116f)
                curveTo(5.7854f, 11.0888f, 5.7608f, 11.06f, 5.7386f, 11.0299f)
                lineTo(4.6659f, 12.1026f)
                curveTo(4.696f, 12.1247f, 4.7248f, 12.1494f, 4.752f, 12.1766f)
                lineTo(6.1662f, 13.5908f)
                curveTo(6.4591f, 13.8837f, 6.4591f, 14.3586f, 6.1662f, 14.6515f)
                curveTo(5.8733f, 14.9444f, 5.3985f, 14.9444f, 5.1056f, 14.6515f)
                lineTo(3.6913f, 13.2373f)
                curveTo(3.6643f, 13.2103f, 3.6398f, 13.1817f, 3.6178f, 13.1519f)
                curveTo(2.5393f, 14.2396f, 2.0f, 14.8623f, 2.0f, 15.6157f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
