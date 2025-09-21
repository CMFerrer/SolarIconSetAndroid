package dev.chiksmedina.solar.lineduotone.electronicdevices

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
import dev.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.BluetoothSquare: ImageVector
    get() {
        if (_bluetoothSquare != null) {
            return _bluetoothSquare!!
        }
        _bluetoothSquare = Builder(
            name = "BluetoothSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 11.9999f)
                lineTo(13.9333f, 9.7999f)
                curveTo(14.4222f, 9.4332f, 14.6667f, 9.2499f, 14.6667f, 8.9999f)
                curveTo(14.6667f, 8.7499f, 14.4222f, 8.5666f, 13.9333f, 8.1999f)
                lineTo(12.6f, 7.1999f)
                curveTo(11.9019f, 6.6763f, 11.5528f, 6.4145f, 11.2764f, 6.5527f)
                curveTo(11.0f, 6.6909f, 11.0f, 7.1272f, 11.0f, 7.9999f)
                verticalLineTo(11.9999f)
                close()
                moveTo(11.0f, 11.9999f)
                verticalLineTo(15.9999f)
                curveTo(11.0f, 16.8726f, 11.0f, 17.3089f, 11.2764f, 17.4471f)
                curveTo(11.5528f, 17.5853f, 11.9019f, 17.3235f, 12.6f, 16.7999f)
                lineTo(13.9333f, 15.7999f)
                curveTo(14.4222f, 15.4332f, 14.6667f, 15.2499f, 14.6667f, 14.9999f)
                curveTo(14.6667f, 14.7499f, 14.4222f, 14.5665f, 13.9333f, 14.1999f)
                lineTo(11.0f, 11.9999f)
                close()
                moveTo(11.0f, 11.9999f)
                lineTo(8.0f, 9.4999f)
                moveTo(11.0f, 11.9999f)
                lineTo(8.0f, 14.4999f)
            }
        }
            .build()
        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
