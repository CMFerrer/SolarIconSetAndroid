package dev.chiksmedina.solar.linear.networkitprogramming

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
import dev.chiksmedina.solar.linear.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(
            name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 6.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.25f, 18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(12.624f, 1.584f)
                curveTo(12.4849f, 1.3753f, 12.2508f, 1.25f, 12.0f, 1.25f)
                curveTo(11.7492f, 1.25f, 11.5151f, 1.3753f, 11.376f, 1.584f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(13.376f, 5.416f)
                curveTo(13.6057f, 5.7607f, 14.0714f, 5.8538f, 14.416f, 5.624f)
                curveTo(14.7607f, 5.3943f, 14.8538f, 4.9286f, 14.624f, 4.584f)
                lineTo(13.376f, 5.416f)
                close()
                moveTo(9.376f, 4.584f)
                curveTo(9.1462f, 4.9286f, 9.2393f, 5.3943f, 9.584f, 5.624f)
                curveTo(9.9286f, 5.8538f, 10.3943f, 5.7607f, 10.624f, 5.416f)
                lineTo(9.376f, 4.584f)
                close()
                moveTo(11.376f, 2.416f)
                lineTo(13.376f, 5.416f)
                lineTo(14.624f, 4.584f)
                lineTo(12.624f, 1.584f)
                lineTo(11.376f, 2.416f)
                close()
                moveTo(11.376f, 1.584f)
                lineTo(9.376f, 4.584f)
                lineTo(10.624f, 5.416f)
                lineTo(12.624f, 2.416f)
                lineTo(11.376f, 1.584f)
                close()
                moveTo(12.75f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
                moveTo(12.75f, 15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 7.0f)
                verticalLineTo(9.5585f)
                curveTo(6.0f, 10.4193f, 6.5509f, 11.1836f, 7.3675f, 11.4558f)
                lineTo(10.6325f, 12.5442f)
                curveTo(11.4491f, 12.8164f, 12.0f, 13.5807f, 12.0f, 14.4415f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 10.0f)
                verticalLineTo(12.5585f)
                curveTo(18.0f, 13.4193f, 17.4491f, 14.1836f, 16.6325f, 14.4558f)
                lineTo(13.3675f, 15.5442f)
                curveTo(12.5509f, 15.8164f, 12.0f, 16.5807f, 12.0f, 17.4415f)
                verticalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 8.5286f, 17.0f, 8.2929f, 17.1464f, 8.1465f)
                curveTo(17.2929f, 8.0f, 17.5286f, 8.0f, 18.0f, 8.0f)
                curveTo(18.4714f, 8.0f, 18.7071f, 8.0f, 18.8536f, 8.1465f)
                curveTo(19.0f, 8.2929f, 19.0f, 8.5286f, 19.0f, 9.0f)
                curveTo(19.0f, 9.4714f, 19.0f, 9.7071f, 18.8536f, 9.8535f)
                curveTo(18.7071f, 10.0f, 18.4714f, 10.0f, 18.0f, 10.0f)
                curveTo(17.5286f, 10.0f, 17.2929f, 10.0f, 17.1464f, 9.8535f)
                curveTo(17.0f, 9.7071f, 17.0f, 9.4714f, 17.0f, 9.0f)
                close()
            }
        }
            .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
