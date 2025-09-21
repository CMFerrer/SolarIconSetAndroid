package dev.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Cassette2: ImageVector
    get() {
        if (_cassette2 != null) {
            return _cassette2!!
        }
        _cassette2 = Builder(
            name = "Cassette2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.2288f, 2.0f, 6.3432f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(22.0f, 6.3432f, 22.0f, 8.2288f, 22.0f, 12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(19.6569f, 20.0f, 17.7712f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5f, 10.75f)
                curveTo(8.0858f, 10.75f, 7.75f, 11.0858f, 7.75f, 11.5f)
                curveTo(7.75f, 11.9142f, 8.0858f, 12.25f, 8.5f, 12.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(16.0f, 12.25f)
                curveTo(16.4142f, 12.25f, 16.75f, 11.9142f, 16.75f, 11.5f)
                curveTo(16.75f, 11.0858f, 16.4142f, 10.75f, 16.0f, 10.75f)
                verticalLineTo(12.25f)
                close()
                moveTo(8.5f, 15.25f)
                curveTo(8.0858f, 15.25f, 7.75f, 15.5858f, 7.75f, 16.0f)
                curveTo(7.75f, 16.4142f, 8.0858f, 16.75f, 8.5f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(16.0f, 16.75f)
                curveTo(16.4142f, 16.75f, 16.75f, 16.4142f, 16.75f, 16.0f)
                curveTo(16.75f, 15.5858f, 16.4142f, 15.25f, 16.0f, 15.25f)
                verticalLineTo(16.75f)
                close()
                moveTo(17.25f, 13.75f)
                curveTo(17.25f, 14.5784f, 16.5784f, 15.25f, 15.75f, 15.25f)
                verticalLineTo(16.75f)
                curveTo(17.4069f, 16.75f, 18.75f, 15.4069f, 18.75f, 13.75f)
                horizontalLineTo(17.25f)
                close()
                moveTo(15.75f, 12.25f)
                curveTo(16.5784f, 12.25f, 17.25f, 12.9216f, 17.25f, 13.75f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 12.0931f, 17.4069f, 10.75f, 15.75f, 10.75f)
                verticalLineTo(12.25f)
                close()
                moveTo(8.25f, 15.25f)
                curveTo(7.4216f, 15.25f, 6.75f, 14.5784f, 6.75f, 13.75f)
                horizontalLineTo(5.25f)
                curveTo(5.25f, 15.4069f, 6.5932f, 16.75f, 8.25f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(8.25f, 10.75f)
                curveTo(6.5932f, 10.75f, 5.25f, 12.0931f, 5.25f, 13.75f)
                horizontalLineTo(6.75f)
                curveTo(6.75f, 12.9216f, 7.4216f, 12.25f, 8.25f, 12.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(8.5f, 12.25f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.25f)
                close()
                moveTo(8.5f, 16.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(16.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.75f, 15.25f)
                curveTo(14.9216f, 15.25f, 14.25f, 14.5784f, 14.25f, 13.75f)
                horizontalLineTo(12.75f)
                curveTo(12.75f, 15.4069f, 14.0931f, 16.75f, 15.75f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(15.75f, 10.75f)
                curveTo(14.0931f, 10.75f, 12.75f, 12.0931f, 12.75f, 13.75f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 12.9216f, 14.9216f, 12.25f, 15.75f, 12.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(9.75f, 13.75f)
                curveTo(9.75f, 14.5784f, 9.0784f, 15.25f, 8.25f, 15.25f)
                verticalLineTo(16.75f)
                curveTo(9.9068f, 16.75f, 11.25f, 15.4069f, 11.25f, 13.75f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.25f, 12.25f)
                curveTo(9.0784f, 12.25f, 9.75f, 12.9216f, 9.75f, 13.75f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 12.0931f, 9.9068f, 10.75f, 8.25f, 10.75f)
                verticalLineTo(12.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.5f, 4.5f)
                lineTo(16.9733f, 5.9045f)
                curveTo(16.5025f, 7.16f, 16.2671f, 7.7877f, 15.7532f, 8.1439f)
                curveTo(15.2393f, 8.5f, 14.5688f, 8.5f, 13.228f, 8.5f)
                horizontalLineTo(10.772f)
                curveTo(9.4312f, 8.5f, 8.7607f, 8.5f, 8.2468f, 8.1439f)
                curveTo(7.7329f, 7.7877f, 7.4975f, 7.16f, 7.0267f, 5.9045f)
                lineTo(6.5f, 4.5f)
            }
        }
            .build()
        return _cassette2!!
    }

private var _cassette2: ImageVector? = null
