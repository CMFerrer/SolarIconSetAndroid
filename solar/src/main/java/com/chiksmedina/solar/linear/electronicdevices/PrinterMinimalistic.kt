package com.chiksmedina.solar.linear.electronicdevices

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
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.PrinterMinimalistic: ImageVector
    get() {
        if (_printerMinimalistic != null) {
            return _printerMinimalistic!!
        }
        _printerMinimalistic = Builder(
            name = "PrinterMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 17.9827f)
                curveTo(4.4465f, 17.9359f, 3.52f, 17.7626f, 2.8787f, 17.1213f)
                curveTo(2.0f, 16.2426f, 2.0f, 14.8284f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1716f, 2.0f, 7.7574f, 2.8787f, 6.8787f)
                curveTo(3.7574f, 6.0f, 5.1716f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 6.0f, 20.2426f, 6.0f, 21.1213f, 6.8787f)
                curveTo(22.0f, 7.7574f, 22.0f, 9.1716f, 22.0f, 12.0f)
                curveTo(22.0f, 14.8284f, 22.0f, 16.2426f, 21.1213f, 17.1213f)
                curveTo(20.48f, 17.7626f, 19.5535f, 17.9359f, 18.0f, 17.9827f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1213f, 2.8787f)
                lineTo(16.591f, 3.409f)
                lineTo(16.591f, 3.409f)
                lineTo(17.1213f, 2.8787f)
                close()
                moveTo(6.8787f, 2.8787f)
                lineTo(7.409f, 3.409f)
                lineTo(7.409f, 3.409f)
                lineTo(6.8787f, 2.8787f)
                close()
                moveTo(6.8787f, 21.1213f)
                lineTo(7.409f, 20.591f)
                lineTo(7.409f, 20.591f)
                lineTo(6.8787f, 21.1213f)
                close()
                moveTo(18.75f, 12.0f)
                curveTo(18.75f, 11.5858f, 18.4142f, 11.25f, 18.0f, 11.25f)
                curveTo(17.5858f, 11.25f, 17.25f, 11.5858f, 17.25f, 12.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(6.75f, 12.0f)
                curveTo(6.75f, 11.5858f, 6.4142f, 11.25f, 6.0f, 11.25f)
                curveTo(5.5858f, 11.25f, 5.25f, 11.5858f, 5.25f, 12.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(17.25f, 16.0f)
                curveTo(17.25f, 17.4354f, 17.2484f, 18.4365f, 17.1469f, 19.1919f)
                curveTo(17.0482f, 19.9257f, 16.8678f, 20.3142f, 16.591f, 20.591f)
                lineTo(17.6517f, 21.6517f)
                curveTo(18.2536f, 21.0497f, 18.5125f, 20.2919f, 18.6335f, 19.3918f)
                curveTo(18.7516f, 18.5132f, 18.75f, 17.393f, 18.75f, 16.0f)
                horizontalLineTo(17.25f)
                close()
                moveTo(12.0f, 22.75f)
                curveTo(13.393f, 22.75f, 14.5132f, 22.7516f, 15.3918f, 22.6335f)
                curveTo(16.2919f, 22.5125f, 17.0497f, 22.2536f, 17.6517f, 21.6517f)
                lineTo(16.591f, 20.591f)
                curveTo(16.3142f, 20.8678f, 15.9257f, 21.0482f, 15.1919f, 21.1469f)
                curveTo(14.4365f, 21.2484f, 13.4354f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(13.4354f, 2.75f, 14.4365f, 2.7516f, 15.1919f, 2.8531f)
                curveTo(15.9257f, 2.9518f, 16.3142f, 3.1323f, 16.591f, 3.409f)
                lineTo(17.6517f, 2.3484f)
                curveTo(17.0497f, 1.7464f, 16.2919f, 1.4875f, 15.3918f, 1.3665f)
                curveTo(14.5132f, 1.2484f, 13.393f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(12.0f, 1.25f)
                curveTo(10.607f, 1.25f, 9.4868f, 1.2484f, 8.6082f, 1.3665f)
                curveTo(7.7081f, 1.4875f, 6.9503f, 1.7464f, 6.3484f, 2.3484f)
                lineTo(7.409f, 3.409f)
                curveTo(7.6858f, 3.1323f, 8.0743f, 2.9518f, 8.8081f, 2.8531f)
                curveTo(9.5635f, 2.7516f, 10.5646f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(5.25f, 16.0f)
                curveTo(5.25f, 17.393f, 5.2484f, 18.5132f, 5.3665f, 19.3918f)
                curveTo(5.4875f, 20.2919f, 5.7464f, 21.0497f, 6.3484f, 21.6517f)
                lineTo(7.409f, 20.591f)
                curveTo(7.1322f, 20.3142f, 6.9518f, 19.9257f, 6.8531f, 19.1919f)
                curveTo(6.7516f, 18.4365f, 6.75f, 17.4354f, 6.75f, 16.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(12.0f, 21.25f)
                curveTo(10.5646f, 21.25f, 9.5635f, 21.2484f, 8.8081f, 21.1469f)
                curveTo(8.0744f, 21.0482f, 7.6858f, 20.8678f, 7.409f, 20.591f)
                lineTo(6.3484f, 21.6517f)
                curveTo(6.9503f, 22.2536f, 7.7081f, 22.5125f, 8.6082f, 22.6335f)
                curveTo(9.4868f, 22.7516f, 10.607f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(18.7323f, 5.9774f)
                curveTo(18.6859f, 4.4352f, 18.5237f, 3.2204f, 17.6517f, 2.3484f)
                lineTo(16.591f, 3.409f)
                curveTo(17.0016f, 3.8196f, 17.1859f, 4.4579f, 17.233f, 6.0226f)
                lineTo(18.7323f, 5.9774f)
                close()
                moveTo(6.767f, 6.0226f)
                curveTo(6.8141f, 4.4579f, 6.9984f, 3.8196f, 7.409f, 3.409f)
                lineTo(6.3484f, 2.3484f)
                curveTo(5.4763f, 3.2204f, 5.3141f, 4.4352f, 5.2677f, 5.9774f)
                lineTo(6.767f, 6.0226f)
                close()
                moveTo(18.75f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(6.75f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.5f, 12.4429f)
                curveTo(17.8729f, 11.7123f, 15.4115f, 10.9998f, 12.0f, 10.9998f)
                curveTo(8.5885f, 10.9998f, 6.1271f, 11.7123f, 4.5f, 12.4429f)
            }
        }
            .build()
        return _printerMinimalistic!!
    }

private var _printerMinimalistic: ImageVector? = null
