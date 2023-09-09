package com.chiksmedina.solar.lineduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.NetworkItProgrammingGroup

public val NetworkItProgrammingGroup.UsbCircle: ImageVector
    get() {
        if (_usbCircle != null) {
            return _usbCircle!!
        }
        _usbCircle = Builder(name = "UsbCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 16.0f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12.0f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.0f, 6.0f)
                lineTo(12.5303f, 5.4697f)
                curveTo(12.2374f, 5.1768f, 11.7626f, 5.1768f, 11.4697f, 5.4697f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(12.4697f, 7.5303f)
                curveTo(12.7626f, 7.8232f, 13.2374f, 7.8232f, 13.5303f, 7.5303f)
                curveTo(13.8232f, 7.2374f, 13.8232f, 6.7626f, 13.5303f, 6.4697f)
                lineTo(12.4697f, 7.5303f)
                close()
                moveTo(10.4697f, 6.4697f)
                curveTo(10.1768f, 6.7626f, 10.1768f, 7.2374f, 10.4697f, 7.5303f)
                curveTo(10.7626f, 7.8232f, 11.2374f, 7.8232f, 11.5303f, 7.5303f)
                lineTo(10.4697f, 6.4697f)
                close()
                moveTo(11.4697f, 6.5303f)
                lineTo(12.4697f, 7.5303f)
                lineTo(13.5303f, 6.4697f)
                lineTo(12.5303f, 5.4697f)
                lineTo(11.4697f, 6.5303f)
                close()
                moveTo(11.4697f, 5.4697f)
                lineTo(10.4697f, 6.4697f)
                lineTo(11.5303f, 7.5303f)
                lineTo(12.5303f, 6.5303f)
                lineTo(11.4697f, 5.4697f)
                close()
                moveTo(12.75f, 16.0f)
                verticalLineTo(14.125f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 14.125f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.125f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                verticalLineTo(11.0296f)
                curveTo(8.0f, 11.9044f, 8.5685f, 12.6777f, 9.4035f, 12.9386f)
                lineTo(10.8069f, 13.3772f)
                curveTo(11.5167f, 13.599f, 12.0f, 14.2563f, 12.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                verticalLineTo(12.0296f)
                curveTo(16.0f, 12.9044f, 15.4315f, 13.6777f, 14.5966f, 13.9386f)
                lineTo(13.1931f, 14.3772f)
                curveTo(12.4833f, 14.599f, 12.0f, 15.2563f, 12.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                curveTo(15.0f, 9.5286f, 15.0f, 9.2929f, 15.1464f, 9.1465f)
                curveTo(15.2929f, 9.0f, 15.5286f, 9.0f, 16.0f, 9.0f)
                curveTo(16.4714f, 9.0f, 16.7071f, 9.0f, 16.8536f, 9.1465f)
                curveTo(17.0f, 9.2929f, 17.0f, 9.5286f, 17.0f, 10.0f)
                curveTo(17.0f, 10.4714f, 17.0f, 10.7071f, 16.8536f, 10.8536f)
                curveTo(16.7071f, 11.0f, 16.4714f, 11.0f, 16.0f, 11.0f)
                curveTo(15.5286f, 11.0f, 15.2929f, 11.0f, 15.1464f, 10.8536f)
                curveTo(15.0f, 10.7071f, 15.0f, 10.4714f, 15.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
        }
        .build()
        return _usbCircle!!
    }

private var _usbCircle: ImageVector? = null
