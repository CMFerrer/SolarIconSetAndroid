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

public val SearchGroup.RoundedMagniferBug: ImageVector
    get() {
        if (_roundedMagniferBug != null) {
            return _roundedMagniferBug!!
        }
        _roundedMagniferBug = Builder(name = "RoundedMagniferBug", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveTo(8.0489f, 7.6859f)
                curveTo(8.7355f, 6.8116f, 9.8021f, 6.25f, 11.0f, 6.25f)
                curveTo(12.1979f, 6.25f, 13.2645f, 6.8116f, 13.9511f, 7.6859f)
                lineTo(14.6646f, 7.3292f)
                curveTo(15.0351f, 7.1439f, 15.4856f, 7.2941f, 15.6708f, 7.6646f)
                curveTo(15.8561f, 8.0351f, 15.7059f, 8.4856f, 15.3354f, 8.6708f)
                lineTo(14.6226f, 9.0272f)
                curveTo(14.7057f, 9.3375f, 14.75f, 9.6636f, 14.75f, 10.0f)
                verticalLineTo(10.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9142f, 10.25f, 16.25f, 10.5858f, 16.25f, 11.0f)
                curveTo(16.25f, 11.4142f, 15.9142f, 11.75f, 15.5f, 11.75f)
                horizontalLineTo(14.75f)
                verticalLineTo(12.0f)
                curveTo(14.75f, 12.3364f, 14.7057f, 12.6625f, 14.6226f, 12.9728f)
                lineTo(15.3354f, 13.3292f)
                curveTo(15.7059f, 13.5144f, 15.8561f, 13.9649f, 15.6708f, 14.3354f)
                curveTo(15.4856f, 14.7059f, 15.0351f, 14.8561f, 14.6646f, 14.6708f)
                lineTo(13.9511f, 14.3141f)
                curveTo(13.2645f, 15.1884f, 12.1979f, 15.75f, 11.0f, 15.75f)
                curveTo(9.8021f, 15.75f, 8.7355f, 15.1884f, 8.0489f, 14.3141f)
                lineTo(7.3354f, 14.6708f)
                curveTo(6.9649f, 14.8561f, 6.5144f, 14.7059f, 6.3292f, 14.3354f)
                curveTo(6.1439f, 13.9649f, 6.2941f, 13.5144f, 6.6646f, 13.3292f)
                lineTo(7.3774f, 12.9728f)
                curveTo(7.2943f, 12.6625f, 7.25f, 12.3364f, 7.25f, 12.0f)
                verticalLineTo(11.75f)
                horizontalLineTo(6.5f)
                curveTo(6.0858f, 11.75f, 5.75f, 11.4142f, 5.75f, 11.0f)
                curveTo(5.75f, 10.5858f, 6.0858f, 10.25f, 6.5f, 10.25f)
                horizontalLineTo(7.25f)
                verticalLineTo(10.0f)
                curveTo(7.25f, 9.6636f, 7.2943f, 9.3375f, 7.3774f, 9.0272f)
                lineTo(6.6646f, 8.6708f)
                curveTo(6.2941f, 8.4856f, 6.1439f, 8.0351f, 6.3292f, 7.6646f)
                curveTo(6.5144f, 7.2941f, 6.9649f, 7.1439f, 7.3354f, 7.3292f)
                lineTo(8.0489f, 7.6859f)
                close()
                moveTo(8.75f, 10.75f)
                verticalLineTo(12.0f)
                curveTo(8.75f, 12.9797f, 9.3761f, 13.8131f, 10.25f, 14.122f)
                verticalLineTo(10.75f)
                horizontalLineTo(8.75f)
                close()
                moveTo(11.75f, 10.75f)
                verticalLineTo(14.122f)
                curveTo(12.6239f, 13.8131f, 13.25f, 12.9797f, 13.25f, 12.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(11.75f)
                close()
                moveTo(13.122f, 9.25f)
                horizontalLineTo(8.878f)
                curveTo(9.1869f, 8.3761f, 10.0203f, 7.75f, 11.0f, 7.75f)
                curveTo(11.9797f, 7.75f, 12.8131f, 8.3761f, 13.122f, 9.25f)
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
        return _roundedMagniferBug!!
    }

private var _roundedMagniferBug: ImageVector? = null
