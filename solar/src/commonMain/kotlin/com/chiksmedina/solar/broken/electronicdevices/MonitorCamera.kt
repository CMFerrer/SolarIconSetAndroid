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

val ElectronicDevicesGroup.MonitorCamera: ImageVector
    get() {
        if (_monitorCamera != null) {
            return _monitorCamera!!
        }
        _monitorCamera = Builder(
            name = "MonitorCamera", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.0f)
                curveTo(12.0f, 3.5858f, 12.0f, 2.8787f, 12.4393f, 2.4393f)
                curveTo(12.8787f, 2.0f, 13.5858f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.4142f, 2.0f, 18.1213f, 2.0f, 18.5607f, 2.4393f)
                curveTo(19.0f, 2.8787f, 19.0f, 3.5858f, 19.0f, 5.0f)
                curveTo(19.0f, 6.4142f, 19.0f, 7.1213f, 18.5607f, 7.5607f)
                curveTo(18.1213f, 8.0f, 17.4142f, 8.0f, 16.0f, 8.0f)
                horizontalLineTo(15.0f)
                curveTo(13.5858f, 8.0f, 12.8787f, 8.0f, 12.4393f, 7.5607f)
                curveTo(12.0f, 7.1213f, 12.0f, 6.4142f, 12.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 3.7499f)
                lineTo(20.6154f, 3.0768f)
                curveTo(21.2416f, 2.8159f, 21.5547f, 2.6855f, 21.7774f, 2.8339f)
                curveTo(22.0f, 2.9823f, 22.0f, 3.3215f, 22.0f, 3.9999f)
                verticalLineTo(5.9999f)
                curveTo(22.0f, 6.6783f, 22.0f, 7.0175f, 21.7774f, 7.1659f)
                curveTo(21.5547f, 7.3144f, 21.2416f, 7.1839f, 20.6154f, 6.923f)
                lineTo(19.0f, 6.2499f)
                verticalLineTo(3.7499f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 22.0f)
                horizontalLineTo(8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 13.8284f, 22.0f, 15.2426f, 21.1213f, 16.1213f)
                curveTo(20.2426f, 17.0f, 18.8284f, 17.0f, 16.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 17.0f, 3.7574f, 17.0f, 2.8787f, 16.1213f)
                curveTo(2.0f, 15.2426f, 2.0f, 13.8284f, 2.0f, 11.0f)
                verticalLineTo(10.0f)
                moveTo(9.5f, 2.0f)
                curveTo(6.2125f, 2.0f, 4.5688f, 2.0f, 3.4624f, 2.908f)
                curveTo(3.2599f, 3.0742f, 3.0742f, 3.2599f, 2.908f, 3.4624f)
                curveTo(2.4026f, 4.0782f, 2.1785f, 4.8605f, 2.0791f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.0f)
                horizontalLineTo(16.0f)
                moveTo(2.0f, 13.0f)
                horizontalLineTo(12.0f)
            }
        }
            .build()
        return _monitorCamera!!
    }

private var _monitorCamera: ImageVector? = null
