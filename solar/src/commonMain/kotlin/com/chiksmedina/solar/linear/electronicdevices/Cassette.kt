package com.chiksmedina.solar.linear.electronicdevices

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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.Cassette: ImageVector
    get() {
        if (_cassette != null) {
            return _cassette!!
        }
        _cassette = Builder(
            name = "Cassette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 13.75f)
                curveTo(13.5f, 12.5074f, 14.5074f, 11.5f, 15.75f, 11.5f)
                curveTo(16.9926f, 11.5f, 18.0f, 12.5074f, 18.0f, 13.75f)
                curveTo(18.0f, 14.9926f, 16.9926f, 16.0f, 15.75f, 16.0f)
                curveTo(14.5074f, 16.0f, 13.5f, 14.9926f, 13.5f, 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 13.75f)
                curveTo(6.0f, 12.5074f, 7.0074f, 11.5f, 8.25f, 11.5f)
                curveTo(9.4926f, 11.5f, 10.5f, 12.5074f, 10.5f, 13.75f)
                curveTo(10.5f, 14.9926f, 9.4926f, 16.0f, 8.25f, 16.0f)
                curveTo(7.0074f, 16.0f, 6.0f, 14.9926f, 6.0f, 13.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
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
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(8.5f)
            }
        }
            .build()
        return _cassette!!
    }

private var _cassette: ImageVector? = null
