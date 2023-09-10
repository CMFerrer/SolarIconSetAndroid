package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Airbuds: ImageVector
    get() {
        if (_airbuds != null) {
            return _airbuds!!
        }
        _airbuds = Builder(
            name = "Airbuds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 8.3f)
                curveTo(22.0f, 9.9569f, 20.6569f, 11.3f, 19.0f, 11.3f)
                curveTo(18.4477f, 11.3f, 18.0f, 11.7477f, 18.0f, 12.3f)
                verticalLineTo(18.0f)
                moveTo(13.5f, 18.0f)
                verticalLineTo(18.75f)
                curveTo(13.5f, 19.9926f, 14.5074f, 21.0f, 15.75f, 21.0f)
                curveTo(16.9926f, 21.0f, 18.0f, 19.9926f, 18.0f, 18.75f)
                verticalLineTo(18.0f)
                moveTo(13.5f, 18.0f)
                verticalLineTo(8.3125f)
                curveTo(13.5f, 8.0223f, 13.5f, 7.8773f, 13.506f, 7.7547f)
                curveTo(13.6322f, 5.1861f, 15.6861f, 3.1322f, 18.2547f, 3.006f)
                curveTo(18.3773f, 3.0f, 18.5223f, 3.0f, 18.8125f, 3.0f)
                curveTo(18.9866f, 3.0f, 19.0736f, 3.0f, 19.1472f, 3.0036f)
                curveTo(19.9772f, 3.0444f, 20.7177f, 3.4207f, 21.2361f, 4.0f)
                moveTo(13.5f, 18.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 18.0f)
                verticalLineTo(18.75f)
                curveTo(10.5f, 19.9926f, 9.4926f, 21.0f, 8.25f, 21.0f)
                curveTo(7.0074f, 21.0f, 6.0f, 19.9926f, 6.0f, 18.75f)
                verticalLineTo(18.0f)
                moveTo(10.5f, 18.0f)
                horizontalLineTo(6.0f)
                moveTo(10.5f, 18.0f)
                verticalLineTo(14.0f)
                moveTo(6.0f, 18.0f)
                verticalLineTo(12.3f)
                curveTo(6.0f, 11.7477f, 5.5523f, 11.3f, 5.0f, 11.3f)
                curveTo(3.3431f, 11.3f, 2.0f, 9.9569f, 2.0f, 8.3f)
                verticalLineTo(6.1875f)
                curveTo(2.0f, 6.0134f, 2.0f, 5.9264f, 2.0036f, 5.8528f)
                curveTo(2.0793f, 4.3117f, 3.3117f, 3.0793f, 4.8528f, 3.0036f)
                curveTo(4.9264f, 3.0f, 5.0134f, 3.0f, 5.1875f, 3.0f)
                curveTo(5.4777f, 3.0f, 5.6227f, 3.0f, 5.7453f, 3.006f)
                curveTo(8.3139f, 3.1322f, 10.3678f, 5.1861f, 10.494f, 7.7547f)
                curveTo(10.5f, 7.8773f, 10.5f, 8.0223f, 10.5f, 8.3125f)
                verticalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 6.0f)
                verticalLineTo(8.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 6.0f)
                verticalLineTo(8.5f)
            }
        }
            .build()
        return _airbuds!!
    }

private var _airbuds: ImageVector? = null
