package com.chiksmedina.solar.outline.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SearchGroup

val SearchGroup.RoundedMagniferZoomOut: ImageVector
    get() {
        if (_roundedMagniferZoomOut != null) {
            return _roundedMagniferZoomOut!!
        }
        _roundedMagniferZoomOut = Builder(
            name = "RoundedMagniferZoomOut", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.0f, 2.75f)
                curveTo(6.4436f, 2.75f, 2.75f, 6.4436f, 2.75f, 11.0f)
                curveTo(2.75f, 15.5563f, 6.4436f, 19.25f, 11.0f, 19.25f)
                curveTo(15.5563f, 19.25f, 19.25f, 15.5563f, 19.25f, 11.0f)
                curveTo(19.25f, 6.4436f, 15.5563f, 2.75f, 11.0f, 2.75f)
                close()
                moveTo(1.25f, 11.0f)
                curveTo(1.25f, 5.6152f, 5.6152f, 1.25f, 11.0f, 1.25f)
                curveTo(16.3848f, 1.25f, 20.75f, 5.6152f, 20.75f, 11.0f)
                curveTo(20.75f, 16.3848f, 16.3848f, 20.75f, 11.0f, 20.75f)
                curveTo(5.6152f, 20.75f, 1.25f, 16.3848f, 1.25f, 11.0f)
                close()
                moveTo(8.25f, 11.0f)
                curveTo(8.25f, 10.5858f, 8.5858f, 10.25f, 9.0f, 10.25f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 10.25f, 13.75f, 10.5858f, 13.75f, 11.0f)
                curveTo(13.75f, 11.4142f, 13.4142f, 11.75f, 13.0f, 11.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 11.75f, 8.25f, 11.4142f, 8.25f, 11.0f)
                close()
                moveTo(20.1579f, 19.7511f)
                curveTo(19.9264f, 19.7335f, 19.7335f, 19.9264f, 19.7511f, 20.1579f)
                curveTo(19.7514f, 20.1592f, 19.7553f, 20.1848f, 19.7746f, 20.2573f)
                curveTo(19.7974f, 20.3424f, 19.8312f, 20.4554f, 19.8828f, 20.6277f)
                curveTo(19.9301f, 20.7857f, 19.9609f, 20.8881f, 19.9862f, 20.9641f)
                curveTo(20.0121f, 21.0419f, 20.021f, 21.0568f, 20.0171f, 21.0496f)
                curveTo(20.1225f, 21.2465f, 20.3745f, 21.31f, 20.5607f, 21.1867f)
                curveTo(20.5538f, 21.1912f, 20.5688f, 21.1824f, 20.6284f, 21.1261f)
                curveTo(20.6868f, 21.0712f, 20.7624f, 20.9957f, 20.8791f, 20.8791f)
                curveTo(20.9957f, 20.7624f, 21.0712f, 20.6868f, 21.1261f, 20.6284f)
                curveTo(21.1727f, 20.579f, 21.1868f, 20.5602f, 21.1877f, 20.5592f)
                curveTo(21.3093f, 20.3736f, 21.2463f, 20.1236f, 21.0511f, 20.018f)
                curveTo(21.0499f, 20.0175f, 21.0287f, 20.0077f, 20.9641f, 19.9862f)
                curveTo(20.8881f, 19.9609f, 20.7857f, 19.9301f, 20.6277f, 19.8828f)
                curveTo(20.4554f, 19.8312f, 20.3424f, 19.7974f, 20.2573f, 19.7746f)
                curveTo(20.1848f, 19.7553f, 20.1591f, 19.7514f, 20.1579f, 19.7511f)
                close()
                moveTo(18.2564f, 20.2833f)
                curveTo(18.1612f, 19.1267f, 19.1267f, 18.1612f, 20.2833f, 18.2564f)
                curveTo(20.4833f, 18.2728f, 20.7251f, 18.3457f, 20.9862f, 18.4242f)
                curveTo(21.0101f, 18.4314f, 21.0341f, 18.4387f, 21.0583f, 18.4459f)
                curveTo(21.0801f, 18.4524f, 21.1018f, 18.4589f, 21.1234f, 18.4654f)
                curveTo(21.3632f, 18.5369f, 21.5881f, 18.604f, 21.7576f, 18.6948f)
                curveTo(22.7335f, 19.2173f, 23.0485f, 20.4659f, 22.4373f, 21.3889f)
                curveTo(22.3312f, 21.5492f, 22.165f, 21.715f, 21.9878f, 21.8917f)
                curveTo(21.9719f, 21.9076f, 21.9558f, 21.9236f, 21.9397f, 21.9397f)
                curveTo(21.9236f, 21.9558f, 21.9076f, 21.9719f, 21.8917f, 21.9878f)
                curveTo(21.7149f, 22.165f, 21.5492f, 22.3312f, 21.3889f, 22.4373f)
                curveTo(20.4659f, 23.0485f, 19.2173f, 22.7335f, 18.6948f, 21.7576f)
                curveTo(18.604f, 21.5881f, 18.5369f, 21.3632f, 18.4654f, 21.1234f)
                curveTo(18.4589f, 21.1018f, 18.4524f, 21.0801f, 18.4459f, 21.0583f)
                curveTo(18.4387f, 21.0341f, 18.4314f, 21.0101f, 18.4242f, 20.9862f)
                curveTo(18.3457f, 20.7252f, 18.2728f, 20.4833f, 18.2564f, 20.2833f)
                close()
            }
        }
            .build()
        return _roundedMagniferZoomOut!!
    }

private var _roundedMagniferZoomOut: ImageVector? = null
