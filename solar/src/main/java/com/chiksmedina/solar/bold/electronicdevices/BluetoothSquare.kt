package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.75f, 16.0001f)
                verticalLineTo(13.5001f)
                lineTo(13.4834f, 14.8001f)
                curveTo(13.5878f, 14.8785f, 13.6737f, 14.9429f, 13.7472f, 15.0001f)
                curveTo(13.6737f, 15.0573f, 13.5878f, 15.1217f, 13.4834f, 15.2001f)
                lineTo(12.15f, 16.2001f)
                curveTo(11.9904f, 16.3198f, 11.8607f, 16.4166f, 11.7528f, 16.4946f)
                curveTo(11.7504f, 16.3615f, 11.75f, 16.1996f, 11.75f, 16.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7906f, 16.9603f)
                curveTo(11.7904f, 16.9596f, 11.7901f, 16.9585f, 11.7895f, 16.9571f)
                curveTo(11.7904f, 16.9602f, 11.7909f, 16.9616f, 11.7909f, 16.9615f)
                curveTo(11.791f, 16.9614f, 11.7909f, 16.9611f, 11.7906f, 16.9603f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.75f, 8.0001f)
                verticalLineTo(10.5001f)
                lineTo(13.4834f, 9.2001f)
                curveTo(13.5878f, 9.1217f, 13.6737f, 9.0573f, 13.7472f, 9.0001f)
                curveTo(13.6737f, 8.9429f, 13.5878f, 8.8785f, 13.4834f, 8.8001f)
                lineTo(12.15f, 7.8001f)
                curveTo(11.9904f, 7.6804f, 11.8607f, 7.5836f, 11.7528f, 7.5057f)
                curveTo(11.7504f, 7.6387f, 11.75f, 7.8006f, 11.75f, 8.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(13.0099f, 6.57f)
                curveTo(12.6958f, 6.3344f, 12.3963f, 6.1096f, 12.1382f, 5.9693f)
                curveTo(11.8739f, 5.8257f, 11.4222f, 5.6415f, 10.941f, 5.8821f)
                curveTo(10.4598f, 6.1227f, 10.3362f, 6.5946f, 10.2925f, 6.8922f)
                curveTo(10.2499f, 7.1828f, 10.2499f, 7.5573f, 10.25f, 7.9499f)
                lineTo(10.25f, 10.3988f)
                lineTo(8.4802f, 8.9239f)
                curveTo(8.162f, 8.6588f, 7.689f, 8.7018f, 7.4239f, 9.02f)
                curveTo(7.1587f, 9.3382f, 7.2017f, 9.8111f, 7.5199f, 10.0763f)
                lineTo(9.8285f, 12.0001f)
                lineTo(7.5199f, 13.9239f)
                curveTo(7.2017f, 14.1891f, 7.1587f, 14.662f, 7.4239f, 14.9802f)
                curveTo(7.689f, 15.2985f, 8.162f, 15.3414f, 8.4802f, 15.0763f)
                lineTo(10.25f, 13.6014f)
                lineTo(10.25f, 16.0503f)
                curveTo(10.2499f, 16.4429f, 10.2499f, 16.8174f, 10.2925f, 17.108f)
                curveTo(10.3362f, 17.4056f, 10.4598f, 17.8775f, 10.941f, 18.1181f)
                curveTo(11.4222f, 18.3587f, 11.8739f, 18.1745f, 12.1382f, 18.0309f)
                curveTo(12.3963f, 17.8906f, 12.6958f, 17.6659f, 13.0099f, 17.4302f)
                lineTo(14.4167f, 16.3751f)
                curveTo(14.6318f, 16.2139f, 14.8537f, 16.0476f, 15.0152f, 15.8852f)
                curveTo(15.1982f, 15.7011f, 15.4167f, 15.4125f, 15.4167f, 15.0001f)
                curveTo(15.4167f, 14.5877f, 15.1982f, 14.2991f, 15.0152f, 14.115f)
                curveTo(14.8537f, 13.9526f, 14.6318f, 13.7863f, 14.4167f, 13.6251f)
                lineTo(12.25f, 12.0001f)
                lineTo(14.4167f, 10.3751f)
                curveTo(14.6318f, 10.2139f, 14.8537f, 10.0476f, 15.0152f, 9.8852f)
                curveTo(15.1982f, 9.7011f, 15.4167f, 9.4125f, 15.4167f, 9.0001f)
                curveTo(15.4167f, 8.5877f, 15.1982f, 8.2991f, 15.0152f, 8.115f)
                curveTo(14.8537f, 7.9526f, 14.6318f, 7.7863f, 14.4167f, 7.6251f)
                lineTo(13.0099f, 6.57f)
                close()
            }
        }
            .build()
        return _bluetoothSquare!!
    }

private var _bluetoothSquare: ImageVector? = null
