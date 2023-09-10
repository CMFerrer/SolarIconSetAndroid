package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.ColourTuneing: ImageVector
    get() {
        if (_colourTuneing != null) {
            return _colourTuneing!!
        }
        _colourTuneing = Builder(
            name = "ColourTuneing", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 6.2288f, 22.0f, 4.3432f, 20.8284f, 3.1716f)
                curveTo(19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                close()
                moveTo(7.9129f, 8.717f)
                curveTo(8.0949f, 8.1151f, 8.4077f, 7.5932f, 8.7467f, 7.2336f)
                curveTo(9.1071f, 6.8512f, 9.3978f, 6.75f, 9.5227f, 6.75f)
                curveTo(9.8283f, 6.75f, 10.2387f, 6.9276f, 10.6131f, 7.7663f)
                curveTo(10.9917f, 8.6146f, 11.2501f, 9.9936f, 11.2501f, 12.0f)
                curveTo(11.2501f, 14.0988f, 11.515f, 15.7198f, 12.0173f, 16.8452f)
                curveTo(12.5239f, 17.9802f, 13.3522f, 18.75f, 14.4773f, 18.75f)
                curveTo(15.2014f, 18.75f, 15.8606f, 18.309f, 16.3448f, 17.7953f)
                curveTo(16.8504f, 17.2589f, 17.2769f, 16.5307f, 17.5229f, 15.717f)
                curveTo(17.6428f, 15.3205f, 17.4185f, 14.9019f, 17.022f, 14.7821f)
                curveTo(16.6255f, 14.6622f, 16.2069f, 14.8865f, 16.0871f, 15.283f)
                curveTo(15.9051f, 15.8849f, 15.5923f, 16.4068f, 15.2533f, 16.7664f)
                curveTo(14.8929f, 17.1488f, 14.6022f, 17.25f, 14.4773f, 17.25f)
                curveTo(14.1717f, 17.25f, 13.7613f, 17.0724f, 13.387f, 16.2338f)
                curveTo(13.0084f, 15.3855f, 12.7501f, 14.0065f, 12.7501f, 12.0f)
                curveTo(12.7501f, 9.9013f, 12.4851f, 8.2803f, 11.9828f, 7.1549f)
                curveTo(11.4761f, 6.0198f, 10.6478f, 5.25f, 9.5227f, 5.25f)
                curveTo(8.7986f, 5.25f, 8.1394f, 5.691f, 7.6552f, 6.2047f)
                curveTo(7.1496f, 6.7411f, 6.7231f, 7.4693f, 6.4771f, 8.283f)
                curveTo(6.3572f, 8.6795f, 6.5815f, 9.0981f, 6.978f, 9.2179f)
                curveTo(7.3745f, 9.3378f, 7.7931f, 9.1135f, 7.9129f, 8.717f)
                close()
                moveTo(6.0f, 11.25f)
                curveTo(5.5858f, 11.25f, 5.25f, 11.5858f, 5.25f, 12.0f)
                curveTo(5.25f, 12.4142f, 5.5858f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 12.75f, 10.25f, 12.4142f, 10.25f, 12.0f)
                curveTo(10.25f, 11.5858f, 9.9142f, 11.25f, 9.5f, 11.25f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.5f, 11.25f)
                curveTo(14.0858f, 11.25f, 13.75f, 11.5858f, 13.75f, 12.0f)
                curveTo(13.75f, 12.4142f, 14.0858f, 12.75f, 14.5f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 12.75f, 18.75f, 12.4142f, 18.75f, 12.0f)
                curveTo(18.75f, 11.5858f, 18.4142f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(14.5f)
                close()
            }
        }
            .build()
        return _colourTuneing!!
    }

private var _colourTuneing: ImageVector? = null
