package dev.chiksmedina.solar.boldduotone.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.SecurityGroup

val SecurityGroup.SirenRounded: ImageVector
    get() {
        if (_sirenRounded != null) {
            return _sirenRounded!!
        }
        _sirenRounded = Builder(
            name = "SirenRounded", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 16.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 11.5817f, 16.4183f, 8.0f, 12.0f, 8.0f)
                curveTo(7.5817f, 8.0f, 4.0f, 11.5817f, 4.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 5.4142f, 11.5858f, 5.75f, 12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 5.4142f, 12.75f, 5.0f)
                verticalLineTo(2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5303f, 5.4697f)
                curveTo(21.8232f, 5.7626f, 21.8232f, 6.2374f, 21.5303f, 6.5303f)
                lineTo(20.0303f, 8.0303f)
                curveTo(19.7374f, 8.3232f, 19.2626f, 8.3232f, 18.9697f, 8.0303f)
                curveTo(18.6768f, 7.7374f, 18.6768f, 7.2626f, 18.9697f, 6.9697f)
                lineTo(20.4697f, 5.4697f)
                curveTo(20.7626f, 5.1768f, 21.2374f, 5.1768f, 21.5303f, 5.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.5303f, 5.4697f)
                curveTo(3.2374f, 5.1768f, 2.7626f, 5.1768f, 2.4697f, 5.4697f)
                curveTo(2.1768f, 5.7626f, 2.1768f, 6.2374f, 2.4697f, 6.5303f)
                lineTo(3.9697f, 8.0303f)
                curveTo(4.2626f, 8.3232f, 4.7374f, 8.3232f, 5.0303f, 8.0303f)
                curveTo(5.3232f, 7.7374f, 5.3232f, 7.2626f, 5.0303f, 6.9697f)
                lineTo(3.5303f, 5.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5716f, 10.8048f)
                curveTo(14.1877f, 10.6493f, 13.7505f, 10.8346f, 13.595f, 11.2185f)
                curveTo(13.4396f, 11.6025f, 13.6249f, 12.0397f, 14.0088f, 12.1952f)
                curveTo(14.8233f, 12.5248f, 15.4746f, 13.1762f, 15.8043f, 13.9906f)
                curveTo(15.9597f, 14.3746f, 16.3969f, 14.5598f, 16.7809f, 14.4044f)
                curveTo(17.1648f, 14.249f, 17.3501f, 13.8117f, 17.1947f, 13.4278f)
                curveTo(16.7126f, 12.2368f, 15.7626f, 11.2868f, 14.5716f, 10.8048f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 18.7993f)
                curveTo(13.1984f, 18.54f, 13.5f, 18.0552f, 13.5f, 17.5f)
                curveTo(13.5f, 16.6716f, 12.8284f, 16.0f, 12.0f, 16.0f)
                curveTo(11.1716f, 16.0f, 10.5f, 16.6716f, 10.5f, 17.5f)
                curveTo(10.5f, 18.0552f, 10.8016f, 18.54f, 11.25f, 18.7993f)
                verticalLineTo(21.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(18.7993f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.0f, 21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.25f, 1.25f, 21.5858f, 1.25f, 22.0f)
                curveTo(1.25f, 22.4142f, 1.5858f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 22.75f, 22.75f, 22.4142f, 22.75f, 22.0f)
                curveTo(22.75f, 21.5858f, 22.4142f, 21.25f, 22.0f, 21.25f)
                horizontalLineTo(20.0f)
                horizontalLineTo(12.75f)
                horizontalLineTo(11.25f)
                horizontalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _sirenRounded!!
    }

private var _sirenRounded: ImageVector? = null
