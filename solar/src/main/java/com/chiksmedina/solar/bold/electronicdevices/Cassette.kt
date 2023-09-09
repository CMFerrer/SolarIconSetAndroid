package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.Cassette: ImageVector
    get() {
        if (_cassette != null) {
            return _cassette!!
        }
        _cassette = Builder(name = "Cassette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(11.2498f)
                verticalLineTo(7.75f)
                horizontalLineTo(10.7718f)
                curveTo(10.0846f, 7.75f, 9.6305f, 7.7489f, 9.2822f, 7.7101f)
                curveTo(8.9525f, 7.6734f, 8.7917f, 7.6091f, 8.6738f, 7.5274f)
                curveTo(8.5559f, 7.4457f, 8.4393f, 7.3177f, 8.2891f, 7.0219f)
                curveTo(8.1304f, 6.7094f, 7.97f, 6.2846f, 7.7287f, 5.6411f)
                lineTo(7.1245f, 4.0301f)
                curveTo(7.939f, 4.0f, 8.8874f, 4.0f, 10.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 12.25f)
                curveTo(14.9216f, 12.25f, 14.25f, 12.9216f, 14.25f, 13.75f)
                curveTo(14.25f, 14.5784f, 14.9216f, 15.25f, 15.75f, 15.25f)
                curveTo(16.5784f, 15.25f, 17.25f, 14.5784f, 17.25f, 13.75f)
                curveTo(17.25f, 12.9216f, 16.5784f, 12.25f, 15.75f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 13.75f)
                curveTo(6.75f, 12.9216f, 7.4216f, 12.25f, 8.25f, 12.25f)
                curveTo(9.0784f, 12.25f, 9.75f, 12.9216f, 9.75f, 13.75f)
                curveTo(9.75f, 14.5784f, 9.0784f, 15.25f, 8.25f, 15.25f)
                curveTo(7.4216f, 15.25f, 6.75f, 14.5784f, 6.75f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1716f, 5.1716f)
                curveTo(3.7497f, 4.5934f, 4.5017f, 4.3006f, 5.5684f, 4.1523f)
                lineTo(6.3384f, 6.2057f)
                curveTo(6.5617f, 6.8011f, 6.7506f, 7.3051f, 6.9516f, 7.7009f)
                curveTo(7.1653f, 8.1219f, 7.4234f, 8.4859f, 7.8194f, 8.7603f)
                curveTo(8.2154f, 9.0347f, 8.6468f, 9.1486f, 9.116f, 9.2009f)
                curveTo(9.5572f, 9.25f, 10.0954f, 9.25f, 10.7314f, 9.25f)
                horizontalLineTo(13.2682f)
                curveTo(13.9042f, 9.25f, 14.4423f, 9.25f, 14.8835f, 9.2009f)
                curveTo(15.3528f, 9.1486f, 15.7841f, 9.0347f, 16.1802f, 8.7603f)
                curveTo(16.5762f, 8.4859f, 16.8342f, 8.1219f, 17.0479f, 7.7009f)
                curveTo(17.2489f, 7.3051f, 17.4378f, 6.8012f, 17.6611f, 6.2057f)
                lineTo(18.4312f, 4.1522f)
                curveTo(19.4981f, 4.3005f, 20.2502f, 4.5934f, 20.8284f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                close()
                moveTo(12.75f, 13.75f)
                curveTo(12.75f, 12.0931f, 14.0931f, 10.75f, 15.75f, 10.75f)
                curveTo(17.4069f, 10.75f, 18.75f, 12.0931f, 18.75f, 13.75f)
                curveTo(18.75f, 15.4069f, 17.4069f, 16.75f, 15.75f, 16.75f)
                curveTo(14.0931f, 16.75f, 12.75f, 15.4069f, 12.75f, 13.75f)
                close()
                moveTo(8.25f, 10.75f)
                curveTo(6.5932f, 10.75f, 5.25f, 12.0931f, 5.25f, 13.75f)
                curveTo(5.25f, 15.4069f, 6.5932f, 16.75f, 8.25f, 16.75f)
                curveTo(9.9068f, 16.75f, 11.25f, 15.4069f, 11.25f, 13.75f)
                curveTo(11.25f, 12.0931f, 9.9068f, 10.75f, 8.25f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.875f, 4.0301f)
                curveTo(16.0607f, 4.0f, 15.1124f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(12.7498f)
                verticalLineTo(7.75f)
                horizontalLineTo(13.2278f)
                curveTo(13.915f, 7.75f, 14.369f, 7.7489f, 14.7174f, 7.7101f)
                curveTo(15.0471f, 7.6734f, 15.2078f, 7.6091f, 15.3258f, 7.5274f)
                curveTo(15.4437f, 7.4457f, 15.5603f, 7.3177f, 15.7104f, 7.0219f)
                curveTo(15.8691f, 6.7094f, 16.0295f, 6.2846f, 16.2708f, 5.6411f)
                lineTo(16.875f, 4.0301f)
                close()
            }
        }
        .build()
        return _cassette!!
    }

private var _cassette: ImageVector? = null
