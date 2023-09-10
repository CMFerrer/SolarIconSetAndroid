package com.chiksmedina.solar.broken.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.ElectronicDevicesGroup

val ElectronicDevicesGroup.Cpu: ImageVector
    get() {
        if (_cpu != null) {
            return _cpu!!
        }
        _cpu = Builder(
            name = "Cpu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 14.0f)
                curveTo(17.0f, 15.4142f, 17.0f, 16.1213f, 16.5607f, 16.5607f)
                curveTo(16.1213f, 17.0f, 15.4142f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(8.5858f, 17.0f, 7.8787f, 17.0f, 7.4393f, 16.5607f)
                curveTo(7.0f, 16.1213f, 7.0f, 15.4142f, 7.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 8.5858f, 7.0f, 7.8787f, 7.4393f, 7.4393f)
                curveTo(7.8787f, 7.0f, 8.5858f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(15.4142f, 7.0f, 16.1213f, 7.0f, 16.5607f, 7.4393f)
                curveTo(17.0f, 7.8787f, 17.0f, 8.5858f, 17.0f, 10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 8.2288f, 4.0f, 6.3432f, 5.1716f, 5.1716f)
                curveTo(6.3432f, 4.0f, 8.2288f, 4.0f, 12.0f, 4.0f)
                curveTo(15.7712f, 4.0f, 17.6569f, 4.0f, 18.8284f, 5.1716f)
                curveTo(20.0f, 6.3432f, 20.0f, 8.2288f, 20.0f, 12.0f)
                curveTo(20.0f, 15.7712f, 20.0f, 17.6569f, 18.8284f, 18.8284f)
                curveTo(17.6569f, 20.0f, 15.7712f, 20.0f, 12.0f, 20.0f)
                curveTo(8.2288f, 20.0f, 6.3432f, 20.0f, 5.1716f, 18.8284f)
                curveTo(4.0f, 17.6569f, 4.0f, 15.7712f, 4.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 12.0f)
                horizontalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 9.0f)
                horizontalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 9.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 15.0f)
                horizontalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 15.0f)
                horizontalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                lineTo(12.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 20.0f)
                lineTo(9.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 2.0f)
                lineTo(9.0f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 2.0f)
                lineTo(15.0f, 4.0f)
            }
        }
            .build()
        return _cpu!!
    }

private var _cpu: ImageVector? = null
