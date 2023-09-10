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

val ElectronicDevicesGroup.ServerMinimalistic: ImageVector
    get() {
        if (_serverMinimalistic != null) {
            return _serverMinimalistic!!
        }
        _serverMinimalistic = Builder(
            name = "ServerMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.0681f, 21.0f, 3.6022f, 21.0f, 3.2346f, 20.8478f)
                curveTo(2.7446f, 20.6448f, 2.3552f, 20.2554f, 2.1522f, 19.7654f)
                curveTo(2.0f, 19.3978f, 2.0f, 18.9319f, 2.0f, 18.0f)
                curveTo(2.0f, 17.0681f, 2.0f, 16.6022f, 2.1522f, 16.2346f)
                curveTo(2.3552f, 15.7446f, 2.7446f, 15.3552f, 3.2346f, 15.1522f)
                curveTo(3.6022f, 15.0f, 4.0681f, 15.0f, 5.0f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9319f, 15.0f, 20.3978f, 15.0f, 20.7654f, 15.1522f)
                curveTo(21.2554f, 15.3552f, 21.6448f, 15.7446f, 21.8478f, 16.2346f)
                curveTo(22.0f, 16.6022f, 22.0f, 17.0681f, 22.0f, 18.0f)
                curveTo(22.0f, 18.9319f, 22.0f, 19.3978f, 21.8478f, 19.7654f)
                curveTo(21.6448f, 20.2554f, 21.2554f, 20.6448f, 20.7654f, 20.8478f)
                curveTo(20.3978f, 21.0f, 19.9319f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 11.0681f, 2.0f, 10.6022f, 2.1522f, 10.2346f)
                curveTo(2.3552f, 9.7446f, 2.7446f, 9.3552f, 3.2346f, 9.1522f)
                curveTo(3.6022f, 9.0f, 4.0681f, 9.0f, 5.0f, 9.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9319f, 9.0f, 20.3978f, 9.0f, 20.7654f, 9.1522f)
                curveTo(21.2554f, 9.3552f, 21.6448f, 9.7446f, 21.8478f, 10.2346f)
                curveTo(22.0f, 10.6022f, 22.0f, 11.0681f, 22.0f, 12.0f)
                curveTo(22.0f, 12.9319f, 22.0f, 13.3978f, 21.8478f, 13.7654f)
                curveTo(21.6448f, 14.2554f, 21.2554f, 14.6448f, 20.7654f, 14.8478f)
                curveTo(20.3978f, 15.0f, 19.9319f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveTo(4.0681f, 15.0f, 3.6022f, 15.0f, 3.2346f, 14.8478f)
                curveTo(2.7446f, 14.6448f, 2.3552f, 14.2554f, 2.1522f, 13.7654f)
                curveTo(2.0f, 13.3978f, 2.0f, 12.9319f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.9319f, 3.0f, 20.3978f, 3.0f, 20.7654f, 3.1522f)
                curveTo(21.2554f, 3.3552f, 21.6448f, 3.7446f, 21.8478f, 4.2346f)
                curveTo(22.0f, 4.6022f, 22.0f, 5.0681f, 22.0f, 6.0f)
                curveTo(22.0f, 6.9319f, 22.0f, 7.3978f, 21.8478f, 7.7654f)
                curveTo(21.6448f, 8.2554f, 21.2554f, 8.6448f, 20.7654f, 8.8478f)
                curveTo(20.3978f, 9.0f, 19.9319f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.0681f, 9.0f, 3.6022f, 9.0f, 3.2346f, 8.8478f)
                curveTo(2.7446f, 8.6448f, 2.3552f, 8.2554f, 2.1522f, 7.7654f)
                curveTo(2.0f, 7.3978f, 2.0f, 6.9319f, 2.0f, 6.0f)
                curveTo(2.0f, 5.0681f, 2.0f, 4.6022f, 2.1522f, 4.2346f)
                curveTo(2.3552f, 3.7446f, 2.7446f, 3.3552f, 3.2346f, 3.1522f)
                curveTo(3.6022f, 3.0f, 4.0681f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 12.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 6.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 18.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _serverMinimalistic!!
    }

private var _serverMinimalistic: ImageVector? = null
