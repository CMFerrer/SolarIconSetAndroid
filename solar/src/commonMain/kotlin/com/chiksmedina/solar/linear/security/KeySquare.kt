package com.chiksmedina.solar.linear.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SecurityGroup

val SecurityGroup.KeySquare: ImageVector
    get() {
        if (_keySquare != null) {
            return _keySquare!!
        }
        _keySquare = Builder(
            name = "KeySquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.2084f, 13.5521f)
                curveTo(16.3025f, 13.5521f, 18.0f, 11.8615f, 18.0f, 9.7761f)
                curveTo(18.0f, 7.6906f, 16.3025f, 6.0f, 14.2084f, 6.0f)
                curveTo(12.1144f, 6.0f, 10.4169f, 7.6906f, 10.4169f, 9.7761f)
                curveTo(10.4169f, 10.742f, 10.8578f, 11.4446f, 10.8578f, 11.4446f)
                lineTo(6.2726f, 16.011f)
                curveTo(6.0669f, 16.2159f, 5.7789f, 16.7486f, 6.2726f, 17.2404f)
                lineTo(6.8017f, 17.7673f)
                curveTo(7.0074f, 17.9429f, 7.5247f, 18.1888f, 7.948f, 17.7673f)
                lineTo(8.5652f, 17.1526f)
                curveTo(9.1824f, 17.7673f, 9.8878f, 17.416f, 10.1523f, 17.0647f)
                curveTo(10.5932f, 16.45f, 10.0642f, 15.8353f, 10.0642f, 15.8353f)
                lineTo(10.2405f, 15.6597f)
                curveTo(11.087f, 16.5027f, 11.8277f, 16.011f, 12.0922f, 15.6597f)
                curveTo(12.5331f, 15.045f, 12.0922f, 14.4303f, 12.0922f, 14.4303f)
                curveTo(11.9159f, 14.079f, 11.5632f, 14.079f, 12.004f, 13.64f)
                lineTo(12.5331f, 13.113f)
                curveTo(12.9564f, 13.4643f, 13.8264f, 13.5521f, 14.2084f, 13.5521f)
                close()
            }
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
        }
            .build()
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
